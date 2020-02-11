package com.chungbella.lab02_texts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button submit_button;
    TextView name_display;
    EditText entered_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_button = findViewById(R.id.edit_button);
        name_display = findViewById(R.id.name_display);
        entered_name = findViewById(R.id.enter_name);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = entered_name.getText().toString().toUpperCase();
                Log.i("submit_button", name);
                name_display.setText(name);
            }
        });
    }
}
