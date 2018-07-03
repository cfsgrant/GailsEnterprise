package com.example.code.gailsenterprise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main5Activity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView mTextViewFirstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ButterKnife.bind(this);
        Intent intent=getIntent();
        mTextViewFirstName.setText(intent.getStringExtra("FirstName"));
    }
}
