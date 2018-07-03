package com.example.code.gailsenterprise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Main4Activity extends AppCompatActivity {

    @BindView(R.id.firstNameTextView)
    EditText mEditTextFirstName;
    @BindView(R.id.lastNameTextView)
    EditText mEditTextLastName;
    @BindView(R.id.busAddTextView)
    EditText mEditTextBusAdd;
    @BindView(R.id.prodTextView)
    EditText mEditTextProd;
    @BindView(R.id.priceNumb)
    EditText mEditTextPrice;
    @BindView(R.id.shipTextView)
    EditText mEditTextShipTextView;

//bind all textedits



    @BindView(R.id.saveButton)
    Button mSaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ButterKnife.bind(this);




        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("FirstName",mEditTextFirstName.getText().toString());
                intent.putExtra("LastName",mEditTextLastName.getText().toString());
                intent.putExtra("Business Address",mEditTextBusAdd.getText().toString());
                intent.putExtra("Product",mEditTextProd.getText().toString());
                intent.putExtra("Price",mEditTextPrice.getText().toString());
                intent.putExtra("Shipping Address",mEditTextShipTextView.getText().toString());


                //enter all components here
                startActivity(intent);

            }
        });
    }
}
