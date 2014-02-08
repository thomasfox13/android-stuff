package com.example.sudoku;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class Sudoku extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
    
        // Set up click listeners gor all the buttons
        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(this);
        View newButton = findViewById(R.id.new_button);
        newButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
    }
    
    public void onClick(View v) {
    	switch (v.getId()) {
    	case R.id.about_button:
    		Intent i = new Intent(this, About.class);
    		startActivity(i);
    		break;
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sudoku, menu);
        return true;
    }
    
}
