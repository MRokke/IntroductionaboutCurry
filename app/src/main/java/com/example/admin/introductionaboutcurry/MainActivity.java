package com.example.admin.introductionaboutcurry;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        RelativeLayout name = (RelativeLayout) findViewById(
                R.id.relativelayout);
        name.setBackgroundColor(Color.WHITE);
        invisible("startbutton");
        visible("scrollview");
        visible("links");
        visible("nbabutton");
        visible("wikibutton");
        visible("youtubebutton");
        visible("pic");

    }

    public void nba(View view) {
        openWebPage("http://www.nba.com/playerfile/stephen_curry/");
    }

    public void wikipedia(View view) {
        openWebPage("https://en.wikipedia.org/wiki/Curry");
    }


    public void youtube(View view) {
        openWebPage("https://www.youtube.com/results?sp=SBTqAwA%253D&q=Curry");
    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void visible(String idname) {
        int resID = getResources().getIdentifier(idname,
                "id", getPackageName());
        findViewById(resID).setVisibility(View.VISIBLE);
    }

    public void invisible(String idname) {
        int resID = getResources().getIdentifier(idname,
                "id", getPackageName());
        findViewById(resID).setVisibility(View.INVISIBLE);
    }


}
