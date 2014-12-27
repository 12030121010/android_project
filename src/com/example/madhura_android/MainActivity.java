package com.example.madhura_android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	private static final String TAG="ACTIVITY LIFECYCLE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG,"inside onCreate");
	}

	protected void onStart(){
		super.onStart();
		Log.e(TAG,"inside onStart");
		
	}
	
	protected void onRestart(){
		super.onRestart();
		Log.w(TAG,"inside onRestart");
		
	}
	
	protected void onResume(){
		super.onResume();
		Log.d(TAG,"inside onStart");
		
	}
	
	protected void onPause(){
		super.onPause();
		Log.v(TAG,"inside onStart");
		
	}
	
	protected void onStop(){
		super.onStop();
		Log.w(TAG,"inside onStart");
		
	}
	
	protected void onDestroy(){
		super.onDestroy();
		Log.d(TAG,"inside onStart");
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
