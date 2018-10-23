package com.arworld.przanyatie_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button switchToGreen;
    private Button switchToRed;
    private Button switchToBlue;
    private Button switchToYellow;
    private Button switchToJPG;
    private LinearLayout screenLayout;
    private Toast informationToast;


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
        informationToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
    }

    public void onClick(View view) {
        if (switchToBlue.equals(view)) {
            screenLayout.setBackgroundColor(Color.BLUE);
            showToast("Hello blue");
        } else if (switchToRed.equals(view)) {
            screenLayout.setBackgroundColor(Color.RED);
            showToast("Hello red");
        } else if (switchToGreen.equals(view)) {
            screenLayout.setBackgroundColor(Color.GREEN);
            showToast("Hello green");
        } else if (switchToYellow.equals(view)){
            screenLayout.setBackgroundColor(Color.YELLOW);
            showToast("Hello yellow");
        } else if (switchToJPG.equals(view)) {
            screenLayout.setBackground(getDrawable(R.drawable.background));
            showToast("Hello JPG");
        }

    }

 	  private void showToast(String text) {
      	    informationToast.cancel();
      	    informationToast.setText(text);
       	    informationToast.show();
    }

}
