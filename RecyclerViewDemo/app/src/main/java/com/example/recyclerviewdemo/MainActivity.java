package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        mRecyclerView = findViewById( R.id.recycler_view );
        //Layout manager which tells to recyclerView that which type of list it is
        LinearLayoutManager layoutManager = new LinearLayoutManager( this );
        mRecyclerView.setLayoutManager( layoutManager );

        //Collect data
        List<Student> studentList = new ArrayList<>(  );

        Student student1 = new Student();
        student1.setName( "ABC" );
        student1.setRollNumber( 1 );
        studentList.add(student1);

        Student student2 = new Student();
        student2.setName( "DEF" );
        student2.setRollNumber( 2 );
        studentList.add(student2);

        Student student3 = new Student();
        student3.setName( "GHI" );
        student3.setRollNumber( 3 );
        studentList.add(student3);

        //Display data in recyclerView i.e display list
        MyAdapter adapter = new MyAdapter( this, studentList );
        mRecyclerView.setAdapter(adapter  );
    }
}
