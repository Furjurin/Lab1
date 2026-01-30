package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим поля ввода и кнопку
        EditText editEmail = findViewById(R.id.editTextEmail);
        EditText editPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        // Нажатие на кнопку "Войти"
        buttonLogin.setOnClickListener(v -> {
            String email = editEmail.getText().toString();
            String password = editPassword.getText().toString();

            // Создаем Intent для перехода на MainActivity2
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            // Передаем введенные данные во второе Activity
            intent.putExtra("email", email);
            intent.putExtra("password", password);

            // Запускаем второе Activity
            startActivity(intent);
        });
    }
}
