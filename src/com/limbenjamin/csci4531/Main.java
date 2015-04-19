package com.limbenjamin.csci4531;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void launchBackgroundInstallDemo(View v) {
		startService(new Intent(BackgroundInstallerService.class.getName()));
	}

}
