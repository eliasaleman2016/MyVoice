package org.c0ders.myvoice;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {

	private static String TAG = "myvoice settings";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);	
		addPreferencesFromResource(R.xml.preferences);
	}
}