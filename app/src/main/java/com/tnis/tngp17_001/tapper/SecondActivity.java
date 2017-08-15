package com.tnis.tngp17_001.tapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int val = 0;
    int count = 0;
    private ImageButton btnCoin;
    private TextView   tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvNumber = (TextView) findViewById(R.id.tvNumber);
        btnCoin = (ImageButton) findViewById(R.id.btnCoin);




        Intent intent = getIntent();
        val = intent.getIntExtra("result",0);

        tvNumber.setText(count+"");

        btnCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (count >= val-1){
                    Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                    startActivity(intent);
                }

                if (val != 0)
                count += 1;
                tvNumber.setText(count+"");

            }
        });

    }
}
