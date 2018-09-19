package com.example.panos.friendlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String bio = i.getStringExtra("bio");
        TextView nameView = findViewById(R.id.name);
        TextView bioView = findViewById(R.id.bio);
        nameView.setText(name);
        bioView.setText(bio);
    }
}
