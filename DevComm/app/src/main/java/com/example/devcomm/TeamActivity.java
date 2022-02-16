package com.example.devcomm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URL;

public class TeamActivity extends AppCompatActivity {

    Button createteambtn, jointeambtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        createteambtn = findViewById(R.id.createteambtn);
        jointeambtn = findViewById(R.id.jointeambtn);

        jointeambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TeamActivity.this, CreateteamActivity.class));
            }
        });

        createteambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TeamActivity.this, ChatActivity.class));
            }
        });
    }
}