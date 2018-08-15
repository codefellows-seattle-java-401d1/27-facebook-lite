package com.example.tyler.a27_facebook_lite;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class FriendsActivity extends AppCompatActivity {
    private String friendDetails;
    Friend[] friends = {
            new Friend("Paul Suarez", "Bio"),
            new Friend("Brandon Fenty", "Bio"),
            new Friend("Tara Johnson", "Bio"),
            new Friend("Steve G Man", "Bio"),
            new Friend("Nick Di", "Bio")

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

        List<View> buttons = ((ConstraintLayout) findViewById(R.id.friends)).getTouchables();
        for (View button : buttons) {
            button.setOnClickListener(new ChooseFriendListener());

        }
    }



    public class ChooseFriendListener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            Button button = (Button) view;
            String friend = button.getText().toString();

            Intent data = new Intent();
            data.putExtra(friendDetails, friend);
            setResult(RESULT_OK, data);
            Intent intent = new Intent(FriendsActivity.this, FriendsDetailActivity.class);
            startActivity(intent);
        }
    }
}
