package com.chandran.chandranhwk6app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {
	
	int MANAGE_ASSIGNMENTS_REQUEST_CODE = 1, CONFIGURE_PREFERENCES_REQUEST_CODE = 2, GET_JOBS_LIST_REQUEST_CODE = 3;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.splash_screen);
        setContentView(R.layout.homescreen);
        
    
	// Observing Configure button click  -- 1st button
	final Button configurepreferencesbutton = (Button) findViewById(R.id.configurepreferences);
	// assuming that the id of the button is assignments, by the XML layout
	configurepreferencesbutton.setOnClickListener( new Button.OnClickListener() {
		public void onClick(View v) {
			try {
				startActivityForResult(new Intent(v.getContext(), ConfPref.class),
				MANAGE_ASSIGNMENTS_REQUEST_CODE);
				// setContentView(R.layout.confpref);
			} catch (Exception e) {
			}
		}
	} ) ;
	
	
	
	
	// Observing Retrieve Assignment button click  -- 2st button
		final Button retreiveassignmentbutton = (Button) findViewById(R.id.retreiveassignment);
		// assuming that the id of the button is assignments, by the XML layout
		retreiveassignmentbutton.setOnClickListener( new Button.OnClickListener() {
			public void onClick(View v) {
				try {
					startActivityForResult(new Intent(v.getContext(), ConfPref.class),
					MANAGE_ASSIGNMENTS_REQUEST_CODE);
					// setContentView(R.layout.confpref);
				} catch (Exception e) {
				}
			}
		} ) ;
	
		
		// Observing Manage Assignment button click  -- 3st button
				final Button manageassignmentsbutton = (Button) findViewById(R.id.manageassignments);
				// assuming that the id of the button is assignments, by the XML layout
				manageassignmentsbutton.setOnClickListener( new Button.OnClickListener() {
					public void onClick(View v) {
						try {
							startActivityForResult(new Intent(v.getContext(), ConfPref.class),
							MANAGE_ASSIGNMENTS_REQUEST_CODE);
							// setContentView(R.layout.confpref);
						} catch (Exception e) {
						}
					}
				} ) ;
	
	
	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		/*	case MANAGE_ASSIGNMENTS_REQUEST_CODE :
			//….
			break;
			case CONFIGURE_PREFERENCES_REQUEST_CODE:
			// ….
			break;
			case GET_JOBS_LIST_REQUEST_CODE:
			// ….
			break; */
			// ………….
		}
	}
	
	
}
