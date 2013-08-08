package com.example.test_example;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Getting a reference to the controls of the interface
        final EditText txtName = (EditText)findViewById(R.id.TxtNombre);
        final Button cmdGretting = (Button)findViewById(R.id.BtnHola);
        cmdGretting.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Creating the intent
				Intent intent = new Intent(MainActivity.this, frmGretting.class);
				
				//creating the parameters to send to the other window
				Bundle b = new Bundle();
				b.putString("NOMBRE", txtName.getText().toString());
				
				//adding the information to the intent
				intent.putExtras(b);
				
				//starting the new activity
				startActivity(intent);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
