package com.chandran.chandranhwk6app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfPref extends Activity {
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confpref);
        
        
        	// Observing save button click  
     		final Button savebutton = (Button) findViewById(R.id.save);
     		savebutton.setOnClickListener( new Button.OnClickListener() {
     			public void onClick(View v) {
     				try {
     					//Intent data= new Intent();
     					EditText email = (EditText)findViewById(R.id.email);
     					//data.setData(Uri.parse(email.getText().toString()));
     					EditText URL  = (EditText)findViewById(R.id.URL);
     					//data.setData(Uri.parse(URL.getText().toString()));
     					if(!email.getText().toString().isEmpty() && !URL.getText().toString().isEmpty())
     						setResult(Activity.RESULT_OK);
     					else
     						setResult(Activity.RESULT_CANCELED);
     					finish();
     				} catch (Exception e) {
     				}
     			}
     		} ) ;
        
        
        
	}
	
	

}
