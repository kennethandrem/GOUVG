package com.wokonik.kenneth.gouvg;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity{

    private Button loginButton;
    private Button signUpButton;
    private EditText username;
    private EditText password;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*loginButton = (Button)findViewById(R.id.btnLogin);
        signUpButton = (Button)findViewById(R.id.btnRegist);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.passText);
        mAuth = FirebaseAuth.getInstance();

*/
        TextView textView1 = (TextView) findViewById(R.id.link_signup);



    }

    public void click(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.link_signup:
                intent = new Intent(this, SignUpActivity.class);
                startActivity(intent);
                break;
        }

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
