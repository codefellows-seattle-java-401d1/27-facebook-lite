package com.example.facebooklite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.facebooklite.models.Friend;

public class MainActivity extends AppCompatActivity {

    private TextView intro;
    private Button seeFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating our text views
        intro = findViewById(R.id.intro);

        // Creating our buttons
        seeFriends = findViewById(R.id.seeFriends);

        // Adding our buttons listener
        seeFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FriendsActivity.class);
                startActivity(intent);
            }
        });
    }
}
