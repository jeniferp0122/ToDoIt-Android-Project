package com.example.todoit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private Button btnLogin;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLoginActivity();
                Toast.makeText(MainActivity.this, "Success" , Toast.LENGTH_SHORT);
            }
        });


    }
    private void goLoginActivity(){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }



}