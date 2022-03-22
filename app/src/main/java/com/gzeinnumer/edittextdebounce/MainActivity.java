package com.gzeinnumer.edittextdebounce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.ed);

        EditTextDebounce.create(editText)
                .watch(result -> {
                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                }, 1000);
    }
}