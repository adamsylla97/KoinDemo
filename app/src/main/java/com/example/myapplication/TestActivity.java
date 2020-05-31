package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static org.koin.java.KoinJavaComponent.get;


public class TestActivity extends AppCompatActivity {

    TestPresenter testPresenter = get(TestPresenter.class);
    TestPresenterInJava testPresenterInJava = get(TestPresenterInJava.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        TextView textView1 = findViewById(R.id.t1);
        TextView textView2 = findViewById(R.id.t2);

        textView1.setText(testPresenter.text());
        textView2.setText(testPresenterInJava.text());

    }
}
