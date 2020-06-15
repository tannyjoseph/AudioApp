package com.example.audioapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.audioapp.Adapters.MyListAdapter;
import com.example.audioapp.Classes.MyListData;
import com.example.audioapp.R;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

public class MainActivity extends AppCompatActivity {

    MultiSnapRecyclerView multiSnapRecyclerView, secondMultiSnap, thirdMultiSnap, fourthMultiSnap;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flag = true;


        multiSnapRecyclerView = findViewById(R.id.first_recycler_view);
        secondMultiSnap = findViewById(R.id.second_recycler_view);
        thirdMultiSnap = findViewById(R.id.third_recycler_view);
        fourthMultiSnap = findViewById(R.id.fourth_recycler_view);

        MyListData[] myListData = new MyListData[] {
                new MyListData(R.drawable.music,"Audio"),
                new MyListData(R.drawable.music,"Audio"),
                new MyListData(R.drawable.music,"Audio"),
                new MyListData(R.drawable.music,"Audio"),
                new MyListData(R.drawable.music,"Audio"),
        };

        MyListAdapter adapter = new MyListAdapter(myListData, MainActivity.this);

        LinearLayoutManager firstManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        multiSnapRecyclerView.setLayoutManager(firstManager);
        multiSnapRecyclerView.setAdapter(adapter);


        LinearLayoutManager second = new LinearLayoutManager((getApplicationContext())
                , LinearLayoutManager.HORIZONTAL, false);
        secondMultiSnap.setLayoutManager(second);
        secondMultiSnap.setAdapter(adapter);

        LinearLayoutManager third = new LinearLayoutManager((getApplicationContext())
                , LinearLayoutManager.HORIZONTAL, false);
        thirdMultiSnap.setLayoutManager(third);
        thirdMultiSnap.setAdapter(adapter);

        LinearLayoutManager fourth = new LinearLayoutManager((getApplicationContext())
                , LinearLayoutManager.HORIZONTAL, false);
        fourthMultiSnap.setLayoutManager(fourth);
        fourthMultiSnap.setAdapter(adapter);

    }


}
