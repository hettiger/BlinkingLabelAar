package com.hettiger.blinkinglabel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private boolean isBlinking = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button toggleButton = findViewById(R.id.toggleButton);
        final BlinkingLabel blinkingLabel = findViewById(R.id.blinkingLabel);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBlinking) {
                    blinkingLabel.stopBlinking();
                } else {
                    blinkingLabel.startBlinking();
                }
                isBlinking = !isBlinking;
            }
        });
    }
}
