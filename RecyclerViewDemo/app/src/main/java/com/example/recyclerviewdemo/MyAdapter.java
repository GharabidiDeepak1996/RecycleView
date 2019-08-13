package com.example.recyclerviewdemo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Student> mStudentList;
    private Context mContext;

    private static final String TAG = "MyAdapter";

    public MyAdapter(Context context, List<Student> studentList) {
        mStudentList = studentList;
        mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( mContext );
        View view = inflater.inflate( R.layout.recycler_view_item, parent, false );   //data storing
        return new MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d( TAG, "onBindViewHolder: Position : " + position);

        Student student = mStudentList.get(  position);
        //Student student=new Student(position);
        Log.d( TAG, "onBindViewHolder: Name " + student.getName());             //data set
        holder.mTvName.setText( student.getName() );
        //holder.mTvName.setText( String.valueOf( student.getRollNumber() ) );
    }

    @Override
    public int getItemCount() {

        return mStudentList.size();        //This method returns the size of the collection that contains the items we want to display
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mTvName;

        public MyViewHolder(@NonNull View itemView) {                           //
            super( itemView );
            mTvName = itemView.findViewById( R.id. tv_name);
        }
    }
}
