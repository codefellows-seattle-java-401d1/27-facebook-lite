package com.example.facebooklite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.facebooklite.models.Friend;

import static com.example.facebooklite.MainActivity.REQUEST_CHOOSE_FRIEND;

public class FriendsActivity extends AppCompatActivity{

    private Button mTyler;
    private Button mPaul;
    private Button mLuther;
    private Button mBrandiboi;
    private Button mTara;
    private Button mBack;

    //Creating an array of Friends named friends.
    Friend[] friends = {
            new Friend("Tyler", "I'm a home schooled vapey boi who loves long walks on Skellige Isle with Geralt of Rivia. 32 Vape Lyfe."),
            new Friend("Paul", "My hobbies include vaping, eating the food of my people, and stealing handles of other peoples liquor."),
            new Friend("Luther", "My hobbies include the Python Lyfe, and making these guns look amazing. You see this hair? Stylin' and profilin'!"),
            new Friend("Brandiboi", "I like swiping right and climbing mountains with the bois. Ramen is life, and you can't keep a good corn dog down. #EverestOneDay"),
            new Friend("Tara", "I'm a skilled programmer with a lot of self confidence issues who doesn't believe what the bois say when they tell me I am the best programmer."),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_activity);

        mBack = findViewById(R.id.back);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mBrandiboi = findViewById(R.id.brandiboi);
        mBrandiboi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                startActivity(intent);
            }
        });

        mTyler = findViewById(R.id.tyler);
        mPaul = findViewById(R.id.paul);
        mLuther = findViewById(R.id.luther);
        mBrandiboi = findViewById(R.id.brandiboi);
        mTara = findViewById(R.id.tara);
    }
}
