package com.example.actionbar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myRecyclerView extends AppCompatActivity {
    Toolbar toolbar;
    List<Friend> friendsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        if (ab !=null )
            ab.setDisplayHomeAsUpEnabled(true);

        Friend f0 = new Friend(1, "Asad", 1980, "Giglgit", R.drawable.person);
        Friend f1 = new Friend(2, "Zubair", 1981, "Lahore", R.drawable.person);
        Friend f2 = new Friend(3, "Musa", 1980, "Quetta", R.drawable.person);
        Friend f3 = new Friend(4, "Nadeem", 1987, "Peshawar", R.drawable.person);
        Friend f4 = new Friend(5, "Shahid", 1980, "Karachi", R.drawable.person);
        Friend f5 = new Friend(6, "Zia", 1987, "Faisalabad ", R.drawable.person);
        Friend f6 = new Friend(7, "Badar", 1980, "Rawalpindi", R.drawable.person);
        Friend f7 = new Friend(8, "Hashim", 1997, "Karachi", R.drawable.person);
        Friend f8 = new Friend(9, "Salman", 1980, "Quetta", R.drawable.person);
        Friend f9 = new Friend(10, "Rizwan", 1982, "Kasur", R.drawable.person);
        Friend f10 = new Friend(11, "Junaid", 1977, "Islamabad", R.drawable.person);
        Friend f11 = new Friend(12, "Waseem", 1967, "Rawalpindi", R.drawable.person);

        friendsList.addAll(Arrays.asList(f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11));

        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        //recyclerView.setHasFixedSize(true);

        RecyclerView.Adapter adapter = new myRecyclerViewAdapter(friendsList);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(myRecyclerView.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView recyclerView2 = findViewById(R.id.myRecyclerView2);
        recyclerView2.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(myRecyclerView.this);
        recyclerView2.setLayoutManager(layoutManager2);

        //GridLayoutManager layoutManagerGrid = new GridLayoutManager(this, 2);
        //recyclerView.setLayoutManager(layoutManager);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}