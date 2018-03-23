package com.example.rafiqul.thirdclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdClassActivity extends AppCompatActivity {


    EditText name;
    EditText password;
    Button login;
    Button create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_class);


        name=findViewById(R.id.edit_text_for_name);
        password =findViewById(R.id.edit_text_for_password);
        login=findViewById(R.id.login_button);
        create_account=findViewById(R.id.account_create);

        // login click

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(name.getText().toString().isEmpty()){
                    name.setError("please enter your user name");
                    return;
                }


                if(password.getText().toString().isEmpty()){
                    password.setError("please enter your valid password");
                    return;
                }



                Toast.makeText(ThirdClassActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();


//                System.out.println("Hello word");
            }
        });

        //navigate page

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                System.out.println("Tom and jerry");

                Toast.makeText(ThirdClassActivity.this, "kicu dekha", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ThirdClassActivity.this,SignUpActivity.class);
                startActivity(intent);


            }
        });



    }
}
