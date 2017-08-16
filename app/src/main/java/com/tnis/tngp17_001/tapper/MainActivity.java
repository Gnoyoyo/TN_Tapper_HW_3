package com.tnis.tngp17_001.tapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private ImageButton btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = 0;

                try {
                    val = Integer.parseInt(editText1.getText().toString());
                } catch (NumberFormatException e) {
                }
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("result", val);
                startActivity(intent);
            }
        });


    }
}
