package com.example.shivani.androidconcepts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_life_cycle);
    }
}
