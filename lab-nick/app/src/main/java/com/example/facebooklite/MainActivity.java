package com.example.facebooklite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.facebooklite.models.Friend;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CHOOSE_FRIEND = 1;
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

        // This is missing something but not sure what...? <!--How to fix override-->
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, FriendsActivity.class);
            startActivityForResult(intent, REQUEST_CHOOSE_FRIEND);
        }

        // Don't know if we actually need this for our current app needs?
        @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (resultCode != RESULT_OK) {
                reset();
                return;
            }
            if (requestCode == REQUEST_CHOOSE_FRIEND) {
                if (data == null) {
                    reset();
                    return;
                }
            }
        }
    }
}
