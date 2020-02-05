package com.example.myapplication7887;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int x1 = 2;
    int x2 = 5;
    int x3 = 8;
    int x4 = 5;
    int x0 = 0;
    int y1 = 4;
    int y2 = 1;
    int y3 = 4;
    int y4 = 7;
    int y0 = 0;
    TextView textView;
    TextView coordinateX;
    TextView coordinateY;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.calc);

        View.OnClickListener  listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coordinateX = (EditText) findViewById(R.id.coordinateX);
                coordinateY = (EditText) findViewById(R.id.coordinateY);
                final TextView textView = (TextView) findViewById(R.id.answer);
                x0 = Integer.parseInt(coordinateX.getText().toString());
                y0 = Integer.parseInt(coordinateY.getText().toString());
                if (y0<7&&y0>1&&x0<8&&x0>2) {
                    textView.setText("Попададает");
                } else {
                    textView.setText("Не попададает");

                }

            }

        };
        button.setOnClickListener(listener);

    }
}
