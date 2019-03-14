package com.example.lambdaexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFirst = findViewById(R.id.btn_first);
        Button btnSecond = findViewById(R.id.btn_second);

        EditText edtFirst = findViewById(R.id.edt_first);
        EditText edtSecond = findViewById(R.id.edt_second);


//         Without Lambda Expressions
//        btnFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//              Toast.makeText(MainActivity.this, "First Button Clicked", Toast.LENGTH_SHORT).show()
//            }
//        });

        // With Lambda Expressions
        btnFirst.setOnClickListener(view -> Toast.makeText(MainActivity.this, "First Button Clicked", Toast.LENGTH_SHORT).show());

        // Lambda Expressions example with Functional Interface
        ToastInterface toastInterface = (email, password) -> Toast.makeText(MainActivity.this, email, Toast.LENGTH_SHORT).show();

        btnSecond.setOnClickListener(view -> {
            Log.d("MainActivity", "Second Button Clicked");
            toastInterface.createToast(edtFirst.getText().toString(), edtSecond.getText().toString());
        });

        // -------------- First method --------------- //
//        btnSecond.setOnClickListener(view -> handleClick(view));

        // -------------- Second Method ------------- //
//        btnSecond.setOnClickListener(this::handleClick);

    }

    public void handleClick(View view) {
        Toast.makeText(MainActivity.this, "Second Button Clicked", Toast.LENGTH_SHORT).show();
    }

}

interface ToastInterface {
    void createToast(String email, String password);
}
