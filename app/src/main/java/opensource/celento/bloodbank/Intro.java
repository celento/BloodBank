package opensource.celento.bloodbank;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;


public class Intro extends AppCompatActivity {
    Timer timer;
    TimerTask timerTask;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

    }
    @Override
    protected void onResume() {
        super.onResume();

        startTimer();
    }
    public void startTimer() {

        timer = new Timer();

        initializeTimerTask();

        timer.schedule(timerTask, 3000, 10000); //
    }

    public void stoptimertask(View v) {



        if (timer != null) {

            timer.cancel();

            timer = null;

        }

    }
    public void initializeTimerTask() {

        timerTask = new TimerTask() {
            public void run() {

                Intent blood=new Intent(Intro.this,Home.class);
                startActivity(blood);
                timer.cancel();
                finish();

            }
        };
    }


}
