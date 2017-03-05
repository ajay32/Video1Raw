package com.hackingbuzz.video1raw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoview = (VideoView) findViewById(R.id.video_view);

        videoview.setVideoPath("android.resource://" + getPackageName()+ "/" +R.raw.ishq);

        MediaController mediaController = new MediaController(this);  // creating to have control of video

        mediaController.setAnchorView(videoview);  // telling media controller where its going to attach

        videoview.setMediaController(mediaController);  // now setting media controller to our video

        videoview.start();
    }
}
