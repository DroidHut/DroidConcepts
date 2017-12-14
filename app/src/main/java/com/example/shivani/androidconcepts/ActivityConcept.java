package com.example.shivani.androidconcepts;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class ActivityConcept extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_concept);
        Toolbar toolbar = (Toolbar)findViewById(R.id.tool);

        TextView textView = (TextView)findViewById(R.id.textActivity);
        String string = getResources().getString(R.string.actoverview);
        textView.setText(Html.fromHtml(string));
      //  toolbar.setTitle(R.string.activity);
       // toolbar.setSubtitle(R.string.overview);
       // toolbar.setTitleTextColor(Color.WHITE);
       // toolbar.setSubtitleTextColor(Color.WHITE);
        
    }
}
