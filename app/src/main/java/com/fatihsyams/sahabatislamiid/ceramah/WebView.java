package com.fatihsyams.sahabatislamiid.ceramah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fatihsyams.sahabatislamiid.R;

import static com.fatihsyams.sahabatislamiid.R.*;

public class WebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        setInit();

    }

}
