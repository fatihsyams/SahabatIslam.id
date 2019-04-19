package com.fatihsyams.sahabatislamiid.ceramah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fatihsyams.sahabatislamiid.R;

public class HomeCeramah extends AppCompatActivity {

    RecyclerView recMain;
    MainAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ceramah);

        setInit();

    }

    private void setInit() {
        recMain = findViewById(R.id.rec_main);
        adapter = new MainAdapter(this);
        recMain.setLayoutManager(new LinearLayoutManager(this));
        recMain.setAdapter(adapter);
    }
}
