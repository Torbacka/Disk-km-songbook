package se.ahlvik.sangbok;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

public class SangActivity extends Activity {
	Song song;
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.single);
		
		Bundle extras = getIntent().getExtras();
		/*
		((TextView)findViewById(R.id.title)).setText(extras.getString("title"));
		((TextView)findViewById(R.id.author)).setText(extras.getString("author"));
		((TextView)findViewById(R.id.melody)).setText(extras.getString("melody"));
		((TextView)findViewById(R.id.text)).setText(extras.getString("text"));
		*/
		
		song = (Song)extras.getSerializable("song");
		((TextView)findViewById(R.id.title)).setText(song.title);
		((TextView)findViewById(R.id.author)).setText(song.author);
		((TextView)findViewById(R.id.melody)).setText(song.melody);
		((TextView)findViewById(R.id.text)).setText(song.text);
		//((TextView)findViewById(R.id.note)).setText(song.note);
	}
}
