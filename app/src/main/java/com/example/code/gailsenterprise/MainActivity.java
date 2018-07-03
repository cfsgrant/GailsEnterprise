package com.example.code.gailsenterprise;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TEXT_KEY = "text_key";

    Intent intent;
    private Button mButton;
    private Button mButton1;
    private TextView mEmail;
    private TextView mPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // bind variables on UI




        mButton = findViewById(R.id.newActivityButton);
        mButton1 = findViewById(R.id.crtButton);
        mEmail = findViewById(R.id.emailTextField);
        mPass = findViewById(R.id.passTextField);



        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final User user = new User(mEmail.getText().toString(),
                        mEmail.getText().toString());
                intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra(TEXT_KEY, user);
                startActivity(intent);
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(getApplicationContext(),Main4Activity.class);

                startActivity(intent);
            }
        });
    }
}
