package com.example.facebooklite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FriendDetailActivity extends AppCompatActivity {

    private TextView name;
    private TextView bio;

    private Button mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

        Intent data = getIntent();
        data.getStringExtra("name");
        data.getStringExtra("bio");

        name = findViewById(R.id.friend_name);
        name.setText(data.getStringExtra("name"));

        name = findViewById(R.id.friend_bio);
        name.setText(data.getStringExtra("bio"));

        mBack = findViewById(R.id.back);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
