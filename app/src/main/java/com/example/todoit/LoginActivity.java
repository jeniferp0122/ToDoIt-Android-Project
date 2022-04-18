package com.example.todoit;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends AppCompatActivity  {

    public static final String TAG = "LoginActivity";
    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG , "onCLick was pressed");
                String username = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                loginUSer(username, password);
            }
        });
    }



    private void loginUSer(String username, String password) {
        Log.i(TAG, "Attempting to Log IN");
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if(e != null){
                    Toast.makeText(LoginActivity.this, "Incorrect Username and Password", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "Issue with loging " + e);
                }else{
                    Toast.makeText(LoginActivity.this, "Success" , Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
