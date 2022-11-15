package com.example.okapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText firstname;
    private EditText lastname;
    private EditText email;
    private EditText password;
    private EditText repeatpassword;

    private Button login;

/*    public class MyDialogFragment extends DialogFragment {
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("Важное сообщение!")
                    .setMessage("Покормите кота!")
                    .setPositiveButton("ОК, иду на кухню", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // Закрываем диалоговое окно
                            dialog.cancel();
                        }
                    });
            return builder.create();
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = (EditText) findViewById(R.id.edit_firstname);
        lastname = (EditText) findViewById(R.id.edit_lastname);
        email = (EditText) findViewById(R.id.edit_email);
        password = (EditText) findViewById(R.id.edit_password);
        repeatpassword = (EditText) findViewById(R.id.edit_repeatpassword);


    }

    public AlertDialog SignUp(View view) {
        AlertDialog.Builder builder1 = new  AlertDialog.Builder(this);
        AlertDialog alertDialog = builder1.create();
        if (firstname.getText().toString().length() > 0 &&
                lastname.getText().toString().length() > 0 &&
                email.getText().toString().length() > 0 &&
                password.getText().toString().length() > 0 &&
                repeatpassword.getText().toString().length() > 0) {
            Toast.makeText(getApplicationContext(), "Регистрация выполнена!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SignIn.class);
            startActivity(intent);
        } else {
            builder1.setTitle("Error");
            builder1.setMessage("Данные введены не полностью.");
            builder1.setPositiveButton("ОК", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                            // Закрываем диалоговое окно
                            dialog.cancel();
                        }
                    });
            builder1.create().show();
            /*            Toast.makeText(getApplicationContext(), "Данные введены неверно.", Toast.LENGTH_SHORT).show();*/
        }
        return null;
    }
    public void GoToLogin(View view) {
        Intent intent = new Intent(MainActivity.this, SignIn.class);
        startActivity(intent);
    }
}