package com.wokonik.kenneth.gouvg;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {

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
