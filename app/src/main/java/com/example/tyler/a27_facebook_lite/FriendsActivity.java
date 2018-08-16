package com.example.tyler.a27_facebook_lite;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class FriendsActivity extends AppCompatActivity {
    public static final String FRIEND = "selected_friend";
    private String friendDetails;
    Friend[] friends = {
            new Friend("Paul Suarez", "Big boi polly Loves video games and alcohol. Has a career in taking advantage of elderly women and uneducated peoples"),
            new Friend("Brandon Fenty", "Mountain climbing hotshot with serious confidence issues. Has a nice beard and vapes hard core."),
            new Friend("Tara Johnson", "Best programmer codefellows has ever seen."),
            new Friend("Steve G Man", "Steve 'the pitcher ditcher' G man."),
            new Friend("Nick Di", "Soulless Nicky Di is the gingeriest boi that you ever have seen. 10 out of 10 will sunburn again.")

    };

    private Button paul;
    private Button brandon;
    private Button tara;
    private Button steve;
    private Button nick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        paul = findViewById(R.id.buttonPaul);
        brandon = findViewById(R.id.buttonBrandon);
        tara = findViewById(R.id.buttonTara);
        steve = findViewById(R.id.buttonSteve);
        nick = findViewById(R.id.buttonNick);


            Button[] buttons = {paul, brandon, tara, steve, nick};
            for (int i = 0; i < 5; i++){
                attachClickListener(buttons[i], friends[i]);

        }
    }

    public void attachClickListener(Button button, final Friend friend){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity.this, FriendsDetailActivity.class);
                intent.putExtra("name", friend.name);
                intent.putExtra("bio", friend.bio);
                startActivity(intent);
            }
        });
    }


//    public class ChooseFriendListener implements View.OnClickListener {
//        @Override
//        public void onClick(View view){
//            Button button = (Button) view;
//            String friend = button.getText().toString();
//
//
//            Intent intent = new Intent(FriendsActivity.this, FriendsDetailActivity.class);
//            Intent data = new Intent();
//            data.putExtra(friend, friend);
//            setResult(RESULT_OK, intent);
//            startActivity(intent);
//        }
//    }
}
