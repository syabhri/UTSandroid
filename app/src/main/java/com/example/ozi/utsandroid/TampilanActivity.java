package com.example.ozi.utsandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class TampilanActivity extends Activity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        mRecyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);

        ArrayList<String> data = new ArrayList<>();
        dumy(data);

        mAdapter = new Adapter(data);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void dumy(ArrayList<String> data) {
        data.add("SeaWorld");
        data.add("TamanMini");
        data.add("Dufan");
        data.add("JatimPark1");
        data.add("JatimPark2");
        data.add("Jatimpark3");
    }
}
