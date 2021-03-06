package com.arworld.przanyatie_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button switchToGreen;
    private Button switchToRed;
    private Button switchToBlue;
    private Button switchToYellow;
    private Button switchToJPG;
    private LinearLayout screenLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchToBlue = (Button) findViewById(R.id.switchBlue);
        switchToGreen = (Button) findViewById(R.id.switchGreen);
        switchToRed = (Button) findViewById(R.id.switchRed);
        switchToYellow = (Button) findViewById(R.id.switchYellow);
        switchToJPG = (Button) findViewById(R.id.switchJPG);
        screenLayout = (LinearLayout) findViewById(R.id.screenLayout);

        switchToBlue.setOnClickListener(this);
        switchToRed.setOnClickListener(this);
        switchToGreen.setOnClickListener(this);
        switchToYellow.setOnClickListener(this);
        switchToJPG.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (switchToBlue.equals(view)) {
            screenLayout.setBackgroundColor(Color.BLUE);
        } else if (switchToRed.equals(view)) {
            screenLayout.setBackgroundColor(Color.RED);
        } else if (switchToGreen.equals(view)) {
            screenLayout.setBackgroundColor(Color.GREEN);
        } else if (switchToYellow.equals(view)){
            screenLayout.setBackgroundColor(Color.YELLOW);
        } else if (switchToJPG.equals(view)) {
            screenLayout.setBackground(getDrawable(R.drawable.background));
        }

    }

}
