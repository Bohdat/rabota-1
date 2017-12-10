package sv.skr.biksm16.laba1;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton tb = findViewById(R.id.toggleButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tb.isChecked()){
                    mp.pause();
                    mp.seekTo(0);
                }
                else {
                    mp.start();
                    mp.setLooping(true);
                }
            }
        });
    }
}
