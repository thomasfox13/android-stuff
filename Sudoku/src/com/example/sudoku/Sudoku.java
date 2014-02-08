package com.example.sudoku;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class Sudoku extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
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
    	Class<?> which_class = null;
    	switch (v.getId()) {
     	case R.id.continue_button:
    		break;
    	case R.id.new_button:
    		which_class = NewGame.class;
    		break;
    	case R.id.about_button:
    		which_class = About.class;
    		break;
    	case R.id.exit_button:
    		finish();
    	}
    	if (which_class != null) {
        	Intent i = new Intent(this, which_class);
        	startActivity(i);
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.settings:
    		startActivity(new Intent(this, Prefs.class));
    		return true;
    	}
    	return false;
    }
    
}
