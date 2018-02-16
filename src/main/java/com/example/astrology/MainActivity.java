package com.example.astrology;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageView aries;
    ImageView taurus;
    ImageView gemini;
    ImageView cancer;
    ImageView leo;
    ImageView virgo;
    ImageView libra;
    ImageView scorpio;
    ImageView sagittarius;
    ImageView capricorn;
    ImageView acquarius;
    ImageView pisces;
    View zodiac_view;
    int code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar=findViewById(R.id.firsttool);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setTitle("Astrology");

    }
    void firstsetup(){

        aries=findViewById(R.id.aries);
        taurus=findViewById(R.id.taurus);
        gemini=findViewById(R.id.gemini);
        cancer=findViewById(R.id.cancer);
        leo=findViewById(R.id.leo);
        virgo=findViewById(R.id.virgo);
        libra=findViewById(R.id.libra);
        scorpio=findViewById(R.id.scorpio);
        sagittarius=findViewById(R.id.sagittarius);
        capricorn=findViewById(R.id.capricorn);
        acquarius=findViewById(R.id.acquarius);
        pisces=findViewById(R.id.pisces);
                checkpstate(aries, 0);
                checkpstate(taurus, 1);
                checkpstate(gemini, 2);
                checkpstate(cancer, 3);
                checkpstate(leo, 4);
                checkpstate(virgo, 5);
                checkpstate(libra, 6);
                checkpstate(scorpio, 7);
                checkpstate(sagittarius, 8);
                checkpstate(capricorn, 9);
                checkpstate(acquarius, 10);
                checkpstate(pisces, 11);

    }
    void checkpstate(ImageView view,int code)
    {
        if(view.isPressed())
        {
            this.code=code;
            zodiac_view=view;
        }
    }

    void gonext(View view) {
        firstsetup();
        Intent intent = new Intent(this, NextPage.class);
        System.out.println(code);
        intent.putExtra("zodiac",code);
        Explode explode=new Explode();
        getWindow().setExitTransition(explode);
        getWindow().setAllowReturnTransitionOverlap(false);
        String sign=getString(R.string.zodiac);
        Bundle bundle= ActivityOptions.makeSceneTransitionAnimation(this,zodiac_view,sign).toBundle();
        startActivity(intent,bundle);
    }


    }
