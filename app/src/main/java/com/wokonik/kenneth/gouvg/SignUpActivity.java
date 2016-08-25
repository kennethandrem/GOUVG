package com.wokonik.kenneth.gouvg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private Button loginButton;
    private Button signUpButton;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void click(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.link_login:
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
        }

    }
}
