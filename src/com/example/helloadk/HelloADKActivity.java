package com.example.helloadk;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HelloADKActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_adk);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_adk, menu);
		return true;
	}

}
