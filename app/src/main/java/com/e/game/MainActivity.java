package com.e.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2;
    private TextView tvoutput;

//    int random = (int)(Math.random() * 100 + 1);
//    int random2 = (int)(Math.random() * 100 + 1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tvoutput = findViewById(R.id.tvoutput);

        final GameActivity gm = new GameActivity();

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               int num1 = gm.ramdom();
               int num2 = gm.ramdom2();
                btn1.setText(Integer.toString(num1));
                btn2.setText(Integer.toString(num2));

                int b = Integer.parseInt(tvoutput.getText().toString());


                if(num1>num2) {
                    int sum = b+1;
                    tvoutput.setText(Integer.toString(sum));

                }
                else
                {
                    int sub = b-1;
                    tvoutput.setText(Integer.toString(sub));
                    return;
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = gm.ramdom();
                int num2 = gm.ramdom2();
                btn1.setText(Integer.toString(num1));
                btn2.setText(Integer.toString(num2));

                int b = Integer.parseInt(tvoutput.getText().toString());

                if(num2>num1) {
                    int sum = b+1;
                    tvoutput.setText(Integer.toString(sum));
                }
                else
                {
                    int sub = b-1;
                    tvoutput.setText(Integer.toString(sub));
                    return;
                }
            }
        });


    }
}
