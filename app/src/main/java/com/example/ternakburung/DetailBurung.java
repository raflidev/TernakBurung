package com.example.ternakburung;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailBurung extends AppCompatActivity {

    public static final String EXTRA_CATEGORY="burung";
    @Override
    protected void onCreate(Bundle savedIntanceState) {

        super.onCreate(savedIntanceState);
        setContentView(R.layout.burung_detail);
        getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_CATEGORY));
        TextView nyoba = findViewById(R.id.test_putextra);

        String burung = getIntent().getStringExtra(EXTRA_CATEGORY);

        nyoba.setText(burung);
    }
}
