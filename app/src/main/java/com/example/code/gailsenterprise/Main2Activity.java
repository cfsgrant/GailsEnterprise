package com.example.code.gailsenterprise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends Activity {

    private TextView mtextView;
    private TextView mtextView2;
    private Button mButt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mButt = findViewById(R.id.Button2);

        mtextView = findViewById(R.id.textView);
        mtextView2 = findViewById(R.id.textView2);

        final Intent[] intent = {getIntent()};

        final User user = intent[0].getParcelableExtra(MainActivity.TEXT_KEY);

        mtextView.setText("Email: "+user.getmEmail());
        mtextView2.setText("Password: " + user.getmPass());

        mButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent[0] = new Intent(Main2Activity.this, MainActivity.class);

                startActivity(intent[0]);
            }
        });
    }

}


