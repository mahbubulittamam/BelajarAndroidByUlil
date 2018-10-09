package com.ulil0031.example.belajarandroidbyulil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

import com.ulil0031.example.belajarandroidbyulil.util.PreferencesHelper;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;

    EditText txtUsername, txtPassword;


    PreferencesHelper session;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("LOGIN");
        setContentView(R.layout.activity_login);



        session = new PreferencesHelper(getApplicationContext());


        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

        Toast.makeText(getApplicationContext(),
                "User Login Status: " + session.isUserLoggedIn(),
                Toast.LENGTH_LONG).show();



        btnLogin = (Button) findViewById(R.id.btnLogin);



        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();


                if(username.trim().length() > 0 && password.trim().length() > 0){



                    if(username.equals("Ulil") && password.equals("Ulil")){


                        session.createUserLoginSession("Mahbub Ulit Tamam",
                                "MahubUlitTamam@email.com");


                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);


                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(i);

                        finish();

                    }else{


                        Toast.makeText(getApplicationContext(),
                                "Username or Password Wrong",
                                Toast.LENGTH_LONG).show();

                    }
                }else{


                    Toast.makeText(getApplicationContext(),
                            "Please Input Username and Password",
                            Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}
