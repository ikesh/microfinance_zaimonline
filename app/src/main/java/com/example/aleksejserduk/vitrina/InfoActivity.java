package com.example.aleksejserduk.vitrina;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.microfinance.zaimonline.R;
import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity{

    Context context = this;

    String url_land;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        TextView label = findViewById(R.id.label);
        label.setText(getIntent().getExtras().getString("name"));

        String url_logo = getIntent().getExtras().getString("url_logo");
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        Picasso.with(context).load(url_logo).into(imageView);

        TextView tv_descriptions = findViewById(R.id.tv_descriptions);
        tv_descriptions.setText(getIntent().getExtras().getString("descriptions"));

        TextView descriptions_plus = findViewById(R.id.tv_descriptions_plus);
        descriptions_plus.setText(getIntent().getExtras().getString("descriptions_plus"));

        TextView documents = findViewById(R.id.tv_documents);
        documents.setText(getIntent().getExtras().getString("documents"));

        TextView rate = findViewById(R.id.tv_rate);
        rate.setText(getIntent().getExtras().getString("rate"));

        String rating = getIntent().getExtras().getString("rating");
        TextView tv_rating = findViewById(R.id.tv_rating);

        TextView time = findViewById(R.id.tv_time);
        time.setText(getIntent().getExtras().getString("time"));

        if (rating.equals("4")){
            tv_rating.setText("* * * *");
        } else {
            tv_rating.setText("* * * * *");
        }

        TextView summ = findViewById(R.id.tv_summ);
        summ.setText(getIntent().getExtras().getString("summ"));

        TextView term = findViewById(R.id.tv_term);
        term.setText(getIntent().getExtras().getString("term"));

        url_land = getIntent().getExtras().getString("url_land");

    }

    public void onClick(View v){
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        v.startAnimation(animAlpha);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_land));
        startActivity(browserIntent);
    }

    public void onBack(View view){
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        view.startAnimation(animAlpha);
        super.onBackPressed();
        finish();
    }
    protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
    }
    protected void onRestoreInstanceState (Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
    }
}
