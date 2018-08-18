package com.yutani.codefellows.a27_facebook_lite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FriendDetailActivity extends AppCompatActivity {
    private TextView mName;
    private TextView mBio;
    private Button mGoBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

        Intent data = getIntent();

        mName = findViewById(R.id.friend_name);
        mBio = findViewById(R.id.friend_bio);

        mName.setText(data.getStringExtra("name"));
        mBio.setText(data.getStringExtra("bio"));

        mGoBackButton = findViewById(R.id.go_back_btn_2);
        mGoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
