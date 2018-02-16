package com.example.astrology;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class NextPage extends AppCompatActivity {
    int a;
    ImageView simage;
    TextView about;
    TextView date;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_next);
        inital_setup();
        getWindow().setAllowEnterTransitionOverlap(false);
        Slide slide_up=new Slide();
        slide_up.setSlideEdge(Gravity.BOTTOM);
        slide_up.addTarget(R.id.scroll);
        Slide slide_down=new Slide();
        slide_down.setSlideEdge(Gravity.BOTTOM);
        slide_down.addTarget(R.id.scroll);
        getWindow().setEnterTransition(slide_up);
        getWindow().setExitTransition(slide_down);
    }
    void setparameters(String name,int imagecode,int barcolor,int aboutz,int datez){
        collapsingToolbarLayout.setTitle(name);
        simage.setImageDrawable(getDrawable(imagecode));
        collapsingToolbarLayout.setContentScrim(getDrawable(barcolor));
        about.setText(aboutz);
        date.setText(datez);
    }
    void inital_setup(){
        collapsingToolbarLayout=findViewById(R.id.col);
        simage=findViewById(R.id.simage);
        about=findViewById(R.id.text_about);
        date=findViewById(R.id.text_date);
        Intent intent=getIntent();
        a=intent.getIntExtra("zodiac",12);
        System.out.println(a);
        switch (a) {

            case 0:{
                setparameters("Aries",R.drawable.aries,R.color.aries_color,R.string.about_aries,R.string.date_aries);
                break;
            }
            case 1:{
                setparameters("Taurus",R.drawable.taurus,R.color.taurus_color,R.string.about_taurus,R.string.date_taurus);
                break;
            }
            case 2:{
                setparameters("Gemini",R.drawable.gemini,R.color.gemini_color,R.string.about_gemini,R.string.date_gemini);
                break;
            }
            case 3:{
                setparameters("Cancer",R.drawable.cancer,R.color.cancer_color,R.string.about_cancer,R.string.date_cancer);
                break;
            }
            case 4:{
                setparameters("Leo",R.drawable.leo,R.color.leo_color,R.string.about_leo,R.string.date_leo);
                break;
            }
            case 5:{
                setparameters("Virgo",R.drawable.virgo,R.color.virgo_color,R.string.about_virgo,R.string.date_virgo);
                break;
            }
            case 6:{
                setparameters("Libra",R.drawable.libra,R.color.libra_color,R.string.about_libra,R.string.date_libra);
                break;
            }
            case 7:{
                setparameters("Scorpio",R.drawable.scorpio,R.color.scorpio_color,R.string.about_scorpio,R.string.date_scorpio);
                break;
            }
            case 8:{
                setparameters("Sagittarius",R.drawable.sagittarius,R.color.sagittarius_color,R.string.about_sagittarius,R.string.date_sagittarius);
                break;
            }
            case 9:{
                setparameters("Capricorn",R.drawable.capricorn,R.color.capricorn_color,R.string.about_Capricorn,R.string.date_Capricorn);
                break;
            }
            case 10:{
                setparameters("Acquarius",R.drawable.acquarius,R.color.acquarius_color,R.string.about_aquarius,R.string.date_aquarius);
                break;
            }
            case 11:{
                setparameters("Pisces",R.drawable.pisces,R.color.pisces_color,R.string.about_pisces,R.string.date_pisces);
                break;
            }
            case 12:{
                System.out.println("No Code Selected");
            }
        }
    }

}
