package app.com.demologapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.com.talogger.TALog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TALog.debug("Demo Log");
    }
}
