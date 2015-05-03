package com.codermaster.neolock;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import com.codermaster.neolock.model.KeyData;

import java.util.Date;


public class LockscreenActivity extends ActionBarActivity {

    final KeyData keyData = new KeyData();
    Button redButton = (Button) findViewById(R.id.buttonRed);
    Button blueButton = (Button) findViewById(R.id.buttonBlue);
    Button greenButton = (Button) findViewById(R.id.buttonGreen);
    Button yellowButton = (Button) findViewById(R.id.buttonYellow);
    final TextView displayText = (TextView) findViewById(R.id.headingText);
    final String key = "rbgy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lockscreen);

        redButton.setBackgroundColor(-65536);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            keyData.setUncodedKey(keyData.getUncodedKey() + "r");
                compareKeyAlterDisplayText();

            }
        });
        blueButton.setBackgroundColor(-16776961);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey(keyData.getUncodedKey() + "b");
                compareKeyAlterDisplayText();
            }
        });
        greenButton.setBackgroundColor(-16711936);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey(keyData.getUncodedKey() + "g");
                compareKeyAlterDisplayText();
            }
        });
        yellowButton.setBackgroundColor(-256);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey(keyData.getUncodedKey()+"y");
                compareKeyAlterDisplayText();
            }
        });

    }

    private void compareKeyAlterDisplayText(){
        if(keyData.getUncodedKey().equalsIgnoreCase(key)) {
            displayText.setText("SUCCESS.....");
            keyData.setUncodedKey("");
        } else {
            displayText.setText(keyData.getUncodedKey());
        }
    }

}
