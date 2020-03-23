package com.example.footballscore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int leftInd= 0;
    private int rightInd= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        updateLeftText();
        updateRightText();
    }

    public void IncrementOnLeftBy(View view) {
        switch (view.getId()){
            case R.id.leftButton3:
                leftInd+=3;
                break;
            case R.id.leftButton2:
                leftInd+=2;
                break;
            case R.id.leftButton1:
                leftInd+=1;
                break;
        }
        updateLeftText();

    }

    private void updateLeftText() {
        TextView leftText = findViewById(R.id.leftScoreBoard);
        leftText.setText(String.valueOf(leftInd));
    }

    public void IncrementOfRightBy(View view) {
        switch (view.getId()){
            case R.id.rightButton3:
                rightInd+=3;
                break;
            case R.id.rightButton2:
                rightInd+=2;
                break;
            case R.id.rightButton1:
                rightInd+=1;
                break;
        }
        updateRightText();
    }

    private void updateRightText() {
        TextView rightText = findViewById(R.id.rightScoreBoard);
        rightText.setText(String.valueOf(rightInd));
    }
}
