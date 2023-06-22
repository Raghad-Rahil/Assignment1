package com.example.assignment1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button start;
    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.button);
        img = (ImageView) findViewById(R.id.img);
        txt = (TextView) findViewById(R.id.textView);

        //

        Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
        img.startAnimation(anim);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setVisibility(View.GONE);
                txt.setText("lets start...");
            }
        } , 8000);


        //

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, OptionsActivity.class);
                MainActivity.this.startActivity(intent);
                finish();


            }
        });
    }

}