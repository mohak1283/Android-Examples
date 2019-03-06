package com.example.espressoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail, edtPassword;
    Button btnLogin;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_pass);
        tvResult = findViewById(R.id.tv_result);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtEmail.getText().toString().equalsIgnoreCase("mohak123@gmail.com")
                && edtPassword.getText().toString().equalsIgnoreCase("mohak1234")) {
                    tvResult.setText("LOGIN SUCCESS!");
                } else {
                    tvResult.setText("LOGIN FAILED");
                }

            }
        });
    }
}
