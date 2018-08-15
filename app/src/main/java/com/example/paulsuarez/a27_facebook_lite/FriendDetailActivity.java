package com.example.paulsuarez.a27_facebook_lite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FriendDetailActivity extends AppCompatActivity {

    private TextView name;
    private TextView bio;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

        Intent data = getIntent();
        data.getStringExtra("name");
        data.getStringExtra("bio");

        name = findViewById(R.id.name);
        name.setText(data.getStringExtra("name"));

        name = findViewById(R.id.bio);
        name.setText(data.getStringExtra("bio"));

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

// this page was the hardest. getting one activity to update with different content is still so abstract for me.