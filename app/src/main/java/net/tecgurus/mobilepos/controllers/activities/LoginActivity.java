package net.tecgurus.mobilepos.controllers.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.tecgurus.mobilepos.R;
import net.tecgurus.mobilepos.controllers.request.LoguinRequest;
import net.tecgurus.mobilepos.models.request.LoginRequestModel;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity {

    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private Button btnLogin;
    private Activity currentActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        currentActivity= this;
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);


        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mPasswordView = (EditText) findViewById(R.id.password);
        btnLogin=findViewById(R.id.email_sign_in_button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                  final LoginRequestModel loginRequestModel = new LoginRequestModel();
                  loginRequestModel.setUser(mEmailView.getText().toString().trim());
                  loginRequestModel.setPassword(mPasswordView.getText().toString().trim());

                  final LoguinRequest loginRequest= new LoguinRequest();
                  loginRequest.setLoginRequestModel(loginRequestModel);
                  loginRequest.setOnResult(new LoguinRequest.OnResult() {
                                               @Override
                                               public void onLoginSuccess() {

                                                   final Intent intent=new Intent(currentActivity,MainMenuActivity.class);
                                                   startActivity(intent);


                                               }

                                               @Override
                                               public void onInvalidLoin() {

                                                   Toast.makeText(currentActivity,getString(R.string.Login_invalido),
                                                           Toast.LENGTH_SHORT).show();

                                               }
                                           });
                          loginRequest.execute();
            }catch ( Exception e){
                     e.printStackTrace();
                }
            }
              });

                }
            }
