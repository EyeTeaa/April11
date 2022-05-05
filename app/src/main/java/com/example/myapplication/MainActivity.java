package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int numDucks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void upClick (View v)
    {
        Toast.makeText(this, "hhlkjhljhlkhkljh", Toast.LENGTH_SHORT).show();
        Log.i("info", "DOEAA WLKJR LKJ");
        numDucks++;
        TextView countTextView = (TextView) findViewById(R.id.countLabelView);
        countTextView.setText("Number of Burnt Toast: " + numDucks);
    }

    public void downCLick (View v)
    {
        Toast.makeText(this, "asdf;ajs", Toast.LENGTH_SHORT).show();
        numDucks--;
        TextView countTextView = (TextView) findViewById(R.id.countLabelView);
        countTextView.setText("Number of EagleDUCKS " + numDucks);
        Log.i("info", "dkjf");
    }


}