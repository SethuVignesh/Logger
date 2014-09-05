package com.example.testlog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

	final String myTag = "DocsUpload";
	String col1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(myTag, "OnCreate()");

		try {
			int a = 0 / 0;
		} catch (Exception e) {

			Intent intent = new Intent(MainActivity.this, RemoteLogger.class);
			intent.putExtra("className", this.getClass().toString());
			Toast.makeText(getApplicationContext(), this.getClass().toString(),
					0).show();
			intent.putExtra("error", e.toString());
			startService(intent);
			
		}
	}

}