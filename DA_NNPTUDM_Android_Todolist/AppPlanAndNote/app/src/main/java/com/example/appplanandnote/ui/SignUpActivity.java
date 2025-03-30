package com.example.appplanandnote.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.appplanandnote.R;
import com.example.appplanandnote.dao.AccountDAO;
import com.example.appplanandnote.model.AppUser;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText etxtUserNameRegister = findViewById(R.id.etxtUserNameRegister);

        EditText etxtEmailRegister = findViewById(R.id.etxtEmailRegister);
        EditText etxtPasswordRegister = findViewById(R.id.etxtPasswordRegister);
        EditText etxtConfirmPasswordRegister = findViewById(R.id.etxtConfirmPasswordRegister);
        Button btnSignUp = findViewById(R.id.btnSignup);
        Button btnBackToLogin = findViewById(R.id.btnBackToLogin);

        Spinner spinnerRole = findViewById(R.id.spn_Role);

        // Dữ liệu cho Spinner
        String[] roles = {"admin", "user", "publisher"};

        // Tạo Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, roles);

        // Thiết lập kiểu dropdown
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Thiết lập Adapter cho Spinner
        spinnerRole.setAdapter(adapter);

        //Xử lý sự kiện đăng kí tài khoản - DONE
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    if(etxtEmailRegister.getText().toString().isEmpty() || etxtPasswordRegister.getText().toString().isEmpty())
                        throw new Exception("Email hoặc Password không được để trống");
                    if(!etxtPasswordRegister.getText().toString().equals(etxtConfirmPasswordRegister.getText().toString()))
                        throw new Exception("Xác nhận Password không giống nhau");

                    AppUser newUser = new AppUser(etxtUserNameRegister.getText().toString(), etxtPasswordRegister.getText().toString(), null, etxtEmailRegister.getText().toString(),
                            null, "Nam", 1,spinnerRole.getSelectedItem().toString());

                    AccountDAO temp = new AccountDAO(SignUpActivity.this);
                    temp.RegisterAccount(newUser);



                }
                catch (Exception ex){
                    new AlertDialog.Builder(SignUpActivity.this)
                            .setMessage(ex.getMessage())
                            .setPositiveButton("OK", null)
                            .show();
                }
            }
        });

        //Xử lý sự kiện quay về Login Activity
        btnBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}