package com.example.geolocalisation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button btn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.btn = (Button) findViewById(R.id.btn);

        EditText login = (EditText) findViewById(R.id.login);
        EditText pwd = (EditText) findViewById(R.id.pwd);

        this.btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                //final String URL = "LocalHost:3000/connection/?username="+login+"&password="+pwd;

                String infoLogin = login.getText().toString();
                String infoMdp = pwd.getText().toString();

                String URL = "{\"login\":\""+login+"\",\"mdp\":\""+pwd+"\"}";

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}