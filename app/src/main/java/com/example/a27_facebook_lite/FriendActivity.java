package com.example.a27_facebook_lite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a27_facebook_lite.models.Friends;

public class FriendActivity extends AppCompatActivity {


    Friends[] friends = {
            new Friends("Becky", "Becky is the charge nurse for Auburn Hospital Labor and Delivery warde. She is mom to 5 kids and is active in her church."),
            new Friends("Laura", "Laura is an excellent seamstress and crochet artist and quiltist. She is the mother of 2 boys and has a penchant for photography."),
            new Friends("Rachel", "Rachel is a former assistant dean for Pensacola Christian College and now a teacher at Pensacola Christian Academy. She has her masters in School Administration and Management."),
            new Friends("Sam", "Sam has done practically every office job under the sun and rocks at whatever position she gets into. If you want a lean running office, she is the one to make it happen."),
            new Friends("Gene", "Gene is a former Army Ranger and CEO/Owner of Ranger Industries. His passion for all things military keeps him active in the retired military community."),
            new Friends("Brenda", "Brenda is a music and drama instructor for a private school in Reno, NV. She is living her passion teaching music and drama to the next generation.")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
    }

}
