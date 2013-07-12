package com.chandran.chandranhwk6app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {
	
	int MANAGE_ASSIGNMENTS_REQUEST_CODE = 1, CONFIGURE_PREFERENCES_REQUEST_CODE = 2, GET_JOBS_LIST_REQUEST_CODE = 3;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        
    
	// Observing Configure button click  -- 1st button
	final Button configurepreferencesbutton = (Button) findViewById(R.id.configurepreferences);
	configurepreferencesbutton.setOnClickListener( new Button.OnClickListener() {
		public void onClick(View v) {
			try {
				startActivityForResult(new Intent(v.getContext(), ConfPref.class),
				MANAGE_ASSIGNMENTS_REQUEST_CODE);
			} catch (Exception e) {
			}
		}
	} ) ;
	
	
	
	
	// Observing Retrieve Assignment button click  -- 2st button
		final Button retreiveassignmentbutton = (Button) findViewById(R.id.retreiveassignment);
		retreiveassignmentbutton.setOnClickListener( new Button.OnClickListener() {
			public void onClick(View v) {
				try {
					startActivityForResult(new Intent(v.getContext(), ConfPref.class),
					MANAGE_ASSIGNMENTS_REQUEST_CODE);
				} catch (Exception e) {
				}
			}
		} ) ;
	
		
		// Observing Manage Assignment button click  -- 3st button
				final Button manageassignmentsbutton = (Button) findViewById(R.id.manageassignments);
				manageassignmentsbutton.setOnClickListener( new Button.OnClickListener() {
					public void onClick(View v) {
						try {
							startActivityForResult(new Intent(v.getContext(), ConfPref.class),
							MANAGE_ASSIGNMENTS_REQUEST_CODE);
						} catch (Exception e) {
						}
					}
				} ) ;
	
	
	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		/* Demonstration */
		AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
		switch (resultCode){
			case Activity.RESULT_OK:
				dlgAlert.setMessage("Email and URL fields saved!!");
			break;
			case Activity.RESULT_CANCELED:
				dlgAlert.setMessage("Empty Email/URL field(s). Data not saved.");
			break;
		}
		dlgAlert.setTitle("onActivityResult Demo");
		dlgAlert.setPositiveButton("OK", null);
		dlgAlert.setCancelable(true);
		dlgAlert.create().show();
	}
	
	
}
