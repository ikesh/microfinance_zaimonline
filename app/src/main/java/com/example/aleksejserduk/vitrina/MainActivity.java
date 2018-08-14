package com.example.aleksejserduk.vitrina;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.microfinance.zaimonline.R;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    String[][] array = new String[13][11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, BannerActivity.class);
                startActivity(i);
            }
            }, SPLASH_TIME_OUT);
        Context context = this;
        String answer = getIntent().getExtras().getString("answer");
        try {
            JSONObject obj = new JSONObject(answer);
            String offers = obj.getString("offers");
            for (int x = 1; x < 13; x++) {
                String ID = "id" + x;
                JSONObject offersObj = new JSONObject(offers);
                String id = offersObj.getString(ID);
                JSONObject objID = new JSONObject(id);
                array[x][0] = objID.getString("descriptions");
                array[x][1] = objID.getString("descriptions_plus");
                array[x][2] = objID.getString("documents");
                array[x][3] = objID.getString("name");
                array[x][4] = objID.getString("rate");
                array[x][5] = objID.getString("rating");
                array[x][6] = objID.getString("summ");
                array[x][7] = objID.getString("term");
                array[x][8] = objID.getString("time");
                array[x][9] = objID.getString("url_land");
                array[x][10] = objID.getString("url_logo");
            }
            TextView offer1_textInfo1 = findViewById(R.id.offer1_textInfo1);
            offer1_textInfo1.setText(array[1][6]);
            TextView offer1_textInfo2 = findViewById(R.id.offer1_textInfo2);
            offer1_textInfo2.setText(array[1][4]);
            TextView offer1_textInfo3 = findViewById(R.id.offer1_textInfo3);
            offer1_textInfo3.setText(array[1][7]);
            TextView offer1_textInfo4 = findViewById(R.id.offer1_textInfo4);
            offer1_textInfo4.setText(array[1][8]);
            TextView offer1_textInfo5 = findViewById(R.id.offer1_textInfo5);
            offer1_textInfo5.setText(array[1][2]);
            Button offer1_action = (Button) findViewById(R.id.offer1_action);
            offer1_action.setContentDescription(array[1][9]);
            ImageView imageView = (ImageView) findViewById(R.id.offer1_logo);
            Picasso.with(context).load(array[1][10]).into(imageView);
            TextView stars1 = findViewById(R.id.stars1);
            if (array[1][5].equals("4")){
                stars1.setText("* * * *");
            } else {
                stars1.setText("* * * * *");
            }
            // -------------------------------------------------------------------offer2
            TextView offer2_textInfo1 = findViewById(R.id.offer2_textInfo1);
            offer2_textInfo1.setText(array[2][6]);
            TextView offer2_textInfo2 = findViewById(R.id.offer2_textInfo2);
            offer2_textInfo2.setText(array[2][4]);
            TextView offer2_textInfo3 = findViewById(R.id.offer2_textInfo3);
            offer2_textInfo3.setText(array[2][7]);
            TextView offer2_textInfo4 = findViewById(R.id.offer2_textInfo4);
            offer2_textInfo4.setText(array[2][8]);
            TextView offer2_textInfo5 = findViewById(R.id.offer2_textInfo5);
            offer2_textInfo5.setText(array[2][2]);
            Button offer2_action = (Button) findViewById(R.id.offer2_action);
            offer2_action.setContentDescription(array[2][9]);
            ImageView imageView2 = (ImageView) findViewById(R.id.offer2_logo);
            Picasso.with(context).load(array[2][10]).into(imageView2);
            TextView stars2 = findViewById(R.id.stars2);
            if (array[2][5].equals("4")){
                stars2.setText("* * * *");
            } else {
                stars2.setText("* * * * *");
            }
            // -------------------------------------------------------------------offer3
            TextView offer3_textInfo1 = findViewById(R.id.offer3_textInfo1);
            offer3_textInfo1.setText(array[3][6]);
            TextView offer3_textInfo2 = findViewById(R.id.offer3_textInfo2);
            offer3_textInfo2.setText(array[3][4]);
            TextView offer3_textInfo3 = findViewById(R.id.offer3_textInfo3);
            offer3_textInfo3.setText(array[3][7]);
            TextView offer3_textInfo4 = findViewById(R.id.offer3_textInfo4);
            offer3_textInfo4.setText(array[3][8]);
            TextView offer3_textInfo5 = findViewById(R.id.offer3_textInfo5);
            offer3_textInfo5.setText(array[3][2]);
            Button offer3_action = (Button) findViewById(R.id.offer3_action);
            offer3_action.setContentDescription(array[3][9]);
            ImageView imageView3 = (ImageView) findViewById(R.id.offer3_logo);
            Picasso.with(context).load(array[3][10]).into(imageView3);
            TextView stars3 = findViewById(R.id.stars3);
            if (array[3][5].equals("4")){
                stars3.setText("* * * *");
            } else {
                stars3.setText("* * * * *");
            }
            // -------------------------------------------------------------------offer4
            TextView offer4_textInfo1 = findViewById(R.id.offer4_textInfo1);
            offer4_textInfo1.setText(array[4][6]);
            TextView offer4_textInfo2 = findViewById(R.id.offer4_textInfo2);
            offer4_textInfo2.setText(array[4][4]);
            TextView offer4_textInfo3 = findViewById(R.id.offer4_textInfo3);
            offer4_textInfo3.setText(array[4][7]);
            TextView offer4_textInfo4 = findViewById(R.id.offer4_textInfo4);
            offer4_textInfo4.setText(array[4][8]);
            TextView offer4_textInfo5 = findViewById(R.id.offer4_textInfo5);
            offer4_textInfo5.setText(array[4][2]);
            Button offer4_action = (Button) findViewById(R.id.offer4_action);
            offer4_action.setContentDescription(array[4][9]);
            ImageView imageView4 = (ImageView) findViewById(R.id.offer4_logo);
            Picasso.with(context).load(array[4][10]).into(imageView4);
            TextView stars4 = findViewById(R.id.stars4);
            if (array[4][5].equals("4")){
                stars4.setText("* * * *");
            } else {
                stars4.setText("* * * * *");
            }
            // -------------------------------------------------------------------offer5
            TextView offer5_textInfo1 = findViewById(R.id.offer5_textInfo1);
            offer5_textInfo1.setText(array[5][6]);
            TextView offer5_textInfo2 = findViewById(R.id.offer5_textInfo2);
            offer5_textInfo2.setText(array[5][4]);
            TextView offer5_textInfo3 = findViewById(R.id.offer5_textInfo3);
            offer5_textInfo3.setText(array[5][7]);
            TextView offer5_textInfo4 = findViewById(R.id.offer5_textInfo4);
            offer5_textInfo4.setText(array[5][8]);
            TextView offer5_textInfo5 = findViewById(R.id.offer5_textInfo5);
            offer5_textInfo5.setText(array[5][2]);
            Button offer5_action = (Button) findViewById(R.id.offer5_action);
            offer5_action.setContentDescription(array[5][9]);
            ImageView imageView5 = (ImageView) findViewById(R.id.offer5_logo);
            Picasso.with(context).load(array[5][10]).into(imageView5);
            TextView stars5 = findViewById(R.id.stars5);
            if (array[5][5].equals("4")){
                stars5.setText("* * * *");
            } else {
                stars5.setText("* * * * *");
            }
            // -------------------------------------------------------------------offer6
            TextView offer6_textInfo1 = findViewById(R.id.offer6_textInfo1);
            offer6_textInfo1.setText(array[6][6]);
            TextView offer6_textInfo2 = findViewById(R.id.offer6_textInfo2);
            offer6_textInfo2.setText(array[6][4]);
            TextView offer6_textInfo3 = findViewById(R.id.offer6_textInfo3);
            offer6_textInfo3.setText(array[6][7]);
            TextView offer6_textInfo4 = findViewById(R.id.offer6_textInfo4);
            offer6_textInfo4.setText(array[6][8]);
            TextView offer6_textInfo5 = findViewById(R.id.offer6_textInfo5);
            offer6_textInfo5.setText(array[6][2]);
            Button offer6_action = (Button) findViewById(R.id.offer6_action);
            offer6_action.setContentDescription(array[6][9]);
            ImageView imageView6 = (ImageView) findViewById(R.id.offer6_logo);
            Picasso.with(context).load(array[6][10]).into(imageView6);
            TextView stars6 = findViewById(R.id.stars6);
            if (array[6][5].equals("4")){
                stars6.setText("* * * *");
            } else {
                stars6.setText("* * * * *");
            }

            // -------------------------------------------------------------------offer7
            TextView offer7_textInfo1 = findViewById(R.id.offer7_textInfo1);
            offer7_textInfo1.setText(array[7][6]);
            TextView offer7_textInfo2 = findViewById(R.id.offer7_textInfo2);
            offer7_textInfo2.setText(array[7][4]);
            TextView offer7_textInfo3 = findViewById(R.id.offer7_textInfo3);
            offer7_textInfo3.setText(array[7][7]);
            TextView offer7_textInfo4 = findViewById(R.id.offer7_textInfo4);
            offer7_textInfo4.setText(array[7][8]);
            TextView offer7_textInfo5 = findViewById(R.id.offer7_textInfo5);
            offer7_textInfo5.setText(array[7][2]);
            Button offer7_action = (Button) findViewById(R.id.offer7_action);
            offer7_action.setContentDescription(array[7][9]);
            ImageView imageView7 = (ImageView) findViewById(R.id.offer7_logo);
            Picasso.with(context).load(array[7][10]).into(imageView7);
            TextView stars7 = findViewById(R.id.stars7);
            if (array[7][5].equals("4")){
                stars7.setText("* * * *");
            } else {
                stars7.setText("* * * * *");
            }

            // -------------------------------------------------------------------offer8
            TextView offer8_textInfo1 = findViewById(R.id.offer8_textInfo1);
            offer8_textInfo1.setText(array[8][6]);
            TextView offer8_textInfo2 = findViewById(R.id.offer8_textInfo2);
            offer8_textInfo2.setText(array[8][4]);
            TextView offer8_textInfo3 = findViewById(R.id.offer8_textInfo3);
            offer8_textInfo3.setText(array[8][7]);
            TextView offer8_textInfo4 = findViewById(R.id.offer8_textInfo4);
            offer8_textInfo4.setText(array[8][8]);
            TextView offer8_textInfo5 = findViewById(R.id.offer8_textInfo5);
            offer8_textInfo5.setText(array[8][2]);
            Button offer8_action = (Button) findViewById(R.id.offer8_action);
            offer8_action.setContentDescription(array[8][9]);
            ImageView offer8_logo = (ImageView) findViewById(R.id.offer8_logo);
            Picasso.with(context).load(array[8][10]).into(offer8_logo);
            TextView stars8 = findViewById(R.id.stars8);
            if (array[8][5].equals("4")){
                stars8.setText("* * * *");
            } else {
                stars8.setText("* * * * *");
            }

            // -------------------------------------------------------------------offer9
            TextView offer9_textInfo1 = findViewById(R.id.offer9_textInfo1);
            offer9_textInfo1.setText(array[9][6]);
            TextView offer9_textInfo2 = findViewById(R.id.offer9_textInfo2);
            offer9_textInfo2.setText(array[9][4]);
            TextView offer9_textInfo3 = findViewById(R.id.offer9_textInfo3);
            offer9_textInfo3.setText(array[9][7]);
            TextView offer9_textInfo4 = findViewById(R.id.offer9_textInfo4);
            offer9_textInfo4.setText(array[9][8]);
            TextView offer9_textInfo5 = findViewById(R.id.offer9_textInfo5);
            offer9_textInfo5.setText(array[9][2]);
            Button offer9_action = (Button) findViewById(R.id.offer9_action);
            offer9_action.setContentDescription(array[9][9]);
            ImageView offer9_logo = (ImageView) findViewById(R.id.offer9_logo);
            Picasso.with(context).load(array[9][10]).into(offer9_logo);
            TextView stars9 = findViewById(R.id.stars9);
            if (array[9][5].equals("4")){
                stars9.setText("* * * *");
            } else {
                stars9.setText("* * * * *");
            }

            // -------------------------------------------------------------------offer10
            TextView offer10_textInfo1 = findViewById(R.id.offer10_textInfo1);
            offer10_textInfo1.setText(array[10][6]);
            TextView offer10_textInfo2 = findViewById(R.id.offer10_textInfo2);
            offer10_textInfo2.setText(array[10][4]);
            TextView offer10_textInfo3 = findViewById(R.id.offer10_textInfo3);
            offer10_textInfo3.setText(array[10][7]);
            TextView offer10_textInfo4 = findViewById(R.id.offer10_textInfo4);
            offer10_textInfo4.setText(array[10][8]);
            TextView offer10_textInfo5 = findViewById(R.id.offer10_textInfo5);
            offer10_textInfo5.setText(array[10][2]);
            Button offer10_action = (Button) findViewById(R.id.offer10_action);
            offer10_action.setContentDescription(array[10][9]);
            ImageView offer10_logo = (ImageView) findViewById(R.id.offer10_logo);
            Picasso.with(context).load(array[10][10]).into(offer10_logo);
            TextView stars10 = findViewById(R.id.stars10);
            if (array[10][5].equals("4")){
                stars10.setText("* * * *");
            } else {
                stars10.setText("* * * * *");
            }

            // -------------------------------------------------------------------offer11
            TextView offer11_textInfo1 = findViewById(R.id.offer11_textInfo1);
            offer11_textInfo1.setText(array[11][6]);
            TextView offer11_textInfo2 = findViewById(R.id.offer11_textInfo2);
            offer11_textInfo2.setText(array[11][4]);
            TextView offer11_textInfo3 = findViewById(R.id.offer11_textInfo3);
            offer11_textInfo3.setText(array[11][7]);
            TextView offer11_textInfo4 = findViewById(R.id.offer11_textInfo4);
            offer11_textInfo4.setText(array[11][8]);
            TextView offer11_textInfo5 = findViewById(R.id.offer11_textInfo5);
            offer11_textInfo5.setText(array[11][2]);
            Button offer11_action = (Button) findViewById(R.id.offer11_action);
            offer11_action.setContentDescription(array[11][9]);
            ImageView offer11_logo = (ImageView) findViewById(R.id.offer11_logo);
            Picasso.with(context).load(array[11][10]).into(offer11_logo);
            TextView stars11 = findViewById(R.id.stars11);
            if (array[11][5].equals("4")){
                stars11.setText("* * * *");
            } else {
                stars11.setText("* * * * *");
            }

            // -------------------------------------------------------------------offer12
            TextView offer12_textInfo1 = findViewById(R.id.offer12_textInfo1);
            offer12_textInfo1.setText(array[12][6]);
            TextView offer12_textInfo2 = findViewById(R.id.offer12_textInfo2);
            offer12_textInfo2.setText(array[12][4]);
            TextView offer12_textInfo3 = findViewById(R.id.offer12_textInfo3);
            offer12_textInfo3.setText(array[12][7]);
            TextView offer12_textInfo4 = findViewById(R.id.offer12_textInfo4);
            offer12_textInfo4.setText(array[12][8]);
            TextView offer12_textInfo5 = findViewById(R.id.offer12_textInfo5);
            offer12_textInfo5.setText(array[12][2]);
            Button offer12_action = (Button) findViewById(R.id.offer12_action);
            offer12_action.setContentDescription(array[12][9]);
            ImageView offer12_logo = (ImageView) findViewById(R.id.offer12_logo);
            Picasso.with(context).load(array[12][10]).into(offer12_logo);
            TextView stars12 = findViewById(R.id.stars12);
            if (array[12][5].equals("4")){
                stars12.setText("* * * *");
            } else {
                stars12.setText("* * * * *");
            }


        } catch (Throwable t) {
            Log.e("My App", "Could not parse malformed JSON: \"" + answer + "\"");
        }
    }
    public void onClick(View v){
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        v.startAnimation(animAlpha);
        String url = v.getContentDescription().toString();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void nextPage(View v){
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        v.startAnimation(animAlpha);
        String ID = v.getContentDescription().toString();
        int i = Integer.parseInt(ID);
        Intent infoIntent = new Intent(MainActivity.this, InfoActivity.class);
        infoIntent.putExtra("descriptions", array[i][0]);
        infoIntent.putExtra("descriptions", array[i][1]);
        infoIntent.putExtra("documents", array[i][2]);
        infoIntent.putExtra("name", array[i][3]);
        infoIntent.putExtra("rate", array[i][4]);
        infoIntent.putExtra("rating", array[i][5]);
        infoIntent.putExtra("summ", array[i][6]);
        infoIntent.putExtra("term", array[i][7]);
        infoIntent.putExtra("time", array[i][8]);
        infoIntent.putExtra("url_land", array[i][9]);
        infoIntent.putExtra("url_logo", array[i][10]);
        startActivity(infoIntent);
    }
    protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
    }
    protected void onRestoreInstanceState (Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
    }
}
