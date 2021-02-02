package com.example.cs408lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button helpButton;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] help = getResources().getStringArray(R.array.help);
        helpButton = (Button) findViewById(R.id.helpButton);
        output = (TextView) findViewById(R.id.output);

        helpButton.setOnClickListener(help);
    }
    public void onClick(View view){
        txtView.setText(help);
    }
}