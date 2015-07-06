package it.app.tcare_serial;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class Test1Service extends Service {
	private static final String TAG = "TCARE_SERIAL";

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	public void onDestroy() {
		Toast.makeText(this, "My Service Stopped", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onDestroy");
	}

	@Override
	public void onStart(Intent intent, int startid) {
		Intent intents = new Intent(getBaseContext(), Main_Activity.class);
		intents.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intents);
		Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStart");
	}
}