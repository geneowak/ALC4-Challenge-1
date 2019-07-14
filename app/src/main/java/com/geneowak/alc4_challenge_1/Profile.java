package com.geneowak.alc4_challenge_1;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.Objects;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = findViewById(R.id.profile_toolbar);
        setSupportActionBar(toolbar);
        ActionBar bar = getSupportActionBar();
        Objects.requireNonNull(bar).setTitle("My Profile");
        // enable up button
        bar.setDisplayHomeAsUpEnabled(true);
//        bar.setDisplayOptions();
    }


}
