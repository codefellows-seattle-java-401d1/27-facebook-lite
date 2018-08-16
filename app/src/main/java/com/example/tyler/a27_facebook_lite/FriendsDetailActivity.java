package com.example.tyler.a27_facebook_lite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FriendsDetailActivity extends AppCompatActivity {
    public static final int REQUEST_CHOOSE_FRIEND = 1;
    public static final String EXTRA_RANDOM_NUMBER = "random-number";

    private TextView selectedFriend;
    private TextView friendBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_detail);

        selectedFriend = findViewById(R.id.friendName);
        friendBio = findViewById(R.id.bio);

        Intent data = getIntent();
        Friend friend = Friend.fromIntent(data);
        selectedFriend.setText(friend.name);
        friendBio.setText(friend.bio);


    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data){
//        if (resultCode != RESULT_OK){
//            reset();
//
//        } if (requestCode == REQUEST_CHOOSE_FRIEND){
//            reset();
//            return;
//        }
//
//        String selectedFriend = data.getStringExtra(FriendsActivity.FRIEND);
//        String message = getString(R.string.selected_friend, selectedFriend);
//        this.selectedFriend.setText(message);
//
//    }
//
//    public void reset() {
//    }
}
