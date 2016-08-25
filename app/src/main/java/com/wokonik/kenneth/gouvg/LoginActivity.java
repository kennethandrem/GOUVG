package com.wokonik.kenneth.gouvg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private Button signUpButton;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button)findViewById(R.id.btnLogin);
        signUpButton = (Button)findViewById(R.id.btnRegist);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.passText);

        private FirebaseAuth mAuth;
// ...
        mAuth = FirebaseAuth.getInstance();

    }
}
