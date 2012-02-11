package com.swapnil;

import android.app.Activity;
import android.os.Bundle;

public class FirstActivity extends Activity {
	private static final int LOGIN = 0;
	private static final String TAG = FirstActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		
		
	}
}
