package mstemmle.beachvolleysound;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class BeachvolleysoundActivity extends Activity {
    /** Called when the activity is first created. */
    public MediaPlayer mp;  
	Button audio1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        audio1 = (Button) findViewById(R.id.bOle);    
  
        audio1.setOnClickListener(new OnClickListener()  {  
			@Override
			public void onClick(View v) {
				mp = MediaPlayer.create(getApplicationContext(), R.raw.ole);  
                mp.start(); 				
			}
        });
    }
}    