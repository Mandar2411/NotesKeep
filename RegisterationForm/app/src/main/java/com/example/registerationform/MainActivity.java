package com.example.registerationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick(View view){
        TextView txtFirstName = findViewById(R.id.textView1);
        TextView txtLastName = findViewById(R.id.textView2);
        TextView txtEmail = findViewById(R.id.textView3);

        EditText edtTxtFirstName = findViewById(R.id.editTxtFirstName) ;
        EditText edtTxtLastName = findViewById(R.id.editTxtLastName) ;
        EditText edtTxtEmail = findViewById(R.id.editTxtEmailId) ;

        txtFirstName.setText("First Name : "+ edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name : "+ edtTxtLastName.getText().toString());
        txtEmail.setText("Email Id : "+ edtTxtEmail.getText().toString());

    }
}