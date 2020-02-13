package com.chungbella.lab02_texts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button submit_button;
    TextView name_display;
    TextView message;
    EditText entered_name;
    int msg_index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_button = findViewById(R.id.edit_button);
        name_display = findViewById(R.id.name_display);
        message = findViewById(R.id.message);
        entered_name = findViewById(R.id.enter_name);

        Resources res = getResources();
        final String[] messages = res.getStringArray(R.array.messages);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = entered_name.getText().toString().toUpperCase();
                Log.i("submit_button", name);
                name_display.setText(name);

                String msg = messages[msg_index];
                message.setText(msg);
                msg_index += 1;
                if(msg_index >= messages.length){
                    msg_index = 0;
                }
            }
        });
    }
}
