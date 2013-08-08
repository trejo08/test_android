package com.example.test_example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class frmGretting extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_saludo);
		
		//locating the controls
		TextView txtGretting = (TextView)findViewById(R.id.TxtSaludo);
		
		Bundle bundle = this.getIntent().getExtras();		
		txtGretting.setText("Hola " + bundle.getString("NOMBRE"));
	}
}
