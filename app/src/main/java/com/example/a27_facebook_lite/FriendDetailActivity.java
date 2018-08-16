package com.example.a27_facebook_lite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FriendDetailActivity extends AppCompatActivity {

    public Button mBack;
    public TextView name;
    public TextView bio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

        mBack = findViewById(R.id.goBack);
        name = findViewById(R.id.name_detail);
        bio = findViewById(R.id.bio_detail);


        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //pulled from Paul's repo
        Intent data = getIntent();
        data.getStringExtra("name");
        data.getStringExtra("bio");

        name = findViewById(R.id.name_detail);
        name.setText(data.getStringExtra("name"));

        name = findViewById(R.id.bio_detail);
        name.setText(data.getStringExtra("bio"));
    }
}
