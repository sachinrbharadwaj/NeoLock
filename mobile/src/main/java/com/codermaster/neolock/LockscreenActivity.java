package com.codermaster.neolock;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.codermaster.neolock.model.KeyData;

import java.util.Date;


public class LockscreenActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lockscreen);

        final KeyData keyData = new KeyData();
        Button redButton = (Button) findViewById(R.id.buttonRed);
        Button blueButton = (Button) findViewById(R.id.buttonBlue);
        Button greenButton = (Button) findViewById(R.id.buttonGreen);
        Button yellowButton = (Button) findViewById(R.id.buttonYellow);
        Button clearButton = (Button) findViewById(R.id.buttonClear);
        final TextView displayText = (TextView) findViewById(R.id.displayText);

        final String key = "bbrrg";

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey(keyData.getUncodedKey()+"r");
                if(keyData.getUncodedKey().equalsIgnoreCase(key))
                    displayText.setText("SUCCESS.....");
                else
                    displayText.setText(keyData.getUncodedKey());
            }
        });
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey(keyData.getUncodedKey()+"b");
                if(keyData.getUncodedKey().equalsIgnoreCase(key))
                    displayText.setText("SUCCESS.....");
                else
                    displayText.setText(keyData.getUncodedKey());
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey(keyData.getUncodedKey()+"g");
                if(keyData.getUncodedKey().equalsIgnoreCase(key))
                    displayText.setText("SUCCESS.....");
                else
                    displayText.setText(keyData.getUncodedKey());
            }
        });
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey(keyData.getUncodedKey()+"y");
                if(keyData.getUncodedKey().equalsIgnoreCase(key))
                    displayText.setText("SUCCESS.....");
                else
                    displayText.setText(keyData.getUncodedKey());
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyData.setUncodedKey("");
                displayText.setText(keyData.getUncodedKey());
            }
        });

    }

}
