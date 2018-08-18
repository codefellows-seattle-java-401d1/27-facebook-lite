package com.yutani.codefellows.a27_facebook_lite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yutani.codefellows.a27_facebook_lite.model.Friend;

public class FriendsActivity extends AppCompatActivity {
    Friend[] friends = {
            new Friend("Paul", "I love beer"),
            new Friend("Tyler", "I also love beer"),
            new Friend("Nick", "I get stabbed a lot"),
            new Friend("Tara", "I'm a certified badass"),
            new Friend("Jean", "I go on rad adventures and keep Brandon from falling to his death.")
    };

    private Button mGoHomeBtn;

//    private Button mFriend1Btn = findViewById(R.id.friend_1_btn);
//    private Button mFriend2Btn = findViewById(R.id.friend_2_btn);
//    private Button mFriend3Btn = findViewById(R.id.friend_3_btn);
//    private Button mFriend4Btn = findViewById(R.id.friend_4_btn);
//    private Button mFriend5Btn = findViewById(R.id.friend_5_btn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        mGoHomeBtn = findViewById(R.id.go_back_btn);

        mGoHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
