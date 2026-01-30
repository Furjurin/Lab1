package com.example.lab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewMessage = findViewById(R.id.textViewMessage);
        Button buttonBack = findViewById(R.id.buttonBack);

        // Получаем данные из первого Activity
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        // Проверяем правильность логина и пароля
        if(email.equals("admin@admin.ru") && password.equals("123")) {
            textViewMessage.setText(getString(R.string.message_greeting));
        } else {
            textViewMessage.setText(getString(R.string.message_error));
        }

        // Нажатие на кнопку "Назад"
        buttonBack.setOnClickListener(v -> finish());
    }
}