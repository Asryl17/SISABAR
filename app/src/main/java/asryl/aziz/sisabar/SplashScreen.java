package asryl.aziz.sisabar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        tv =(TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation splash = AnimationUtils.loadAnimation(this,R.anim.splashtransition);
        tv.startAnimation(splash);
        iv.startAnimation(splash);

        final Intent i = new Intent(this,MainActivity1.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);

                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }

        };

        timer.start();
    }
}
