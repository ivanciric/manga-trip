package rs.mangatrip.android;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.*;

public class MangaTripMainActivity extends DroidGap {

    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.manga_trip_main, menu);
//        return true;
//    }
    
}
