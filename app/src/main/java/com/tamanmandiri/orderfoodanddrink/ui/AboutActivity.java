package com.tamanmandiri.orderfoodanddrink.ui;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.tamanmandiri.orderfoodanddrink.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(R.string.about);
        }

    }
}