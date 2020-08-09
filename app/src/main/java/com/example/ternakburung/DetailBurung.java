package com.example.ternakburung;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailBurung extends AppCompatActivity {


    private RecyclerView rvDetail;
    private ArrayList<Detail> listDetail = new ArrayList<>();

    public static final String EXTRA_CATEGORY="burung";


    @Override
    protected void onCreate(Bundle savedIntanceState) {

        super.onCreate(savedIntanceState);


        setContentView(R.layout.burung_detail);
        getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_CATEGORY));
        TextView nyoba = findViewById(R.id.test_putextra);

        String burung = getIntent().getStringExtra(EXTRA_CATEGORY);
        String text = "Data burung " + burung;
        nyoba.setText(text);

        rvDetail = findViewById(R.id.rv_detail);
        rvDetail.setHasFixedSize(true);

        listDetail.addAll(BirdData.getListDetail(burung));

        showRecyclerLister();
    }

    private void showRecyclerLister(){
        rvDetail.setLayoutManager(new LinearLayoutManager((this)));
        ListDetailAdapter listDetailAdapter = new ListDetailAdapter(listDetail);
        rvDetail.setAdapter(listDetailAdapter);
    }
}
