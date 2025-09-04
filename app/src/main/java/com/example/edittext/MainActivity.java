package com.example.edittext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicialização dos componentes de tela
        EditText nota1 = findViewById(R.id.editTextNota1);
        EditText nota2 = findViewById(R.id.editTextNota2);
        Button calcular = findViewById(R.id.buttonCalcular);
        TextView resultado = findViewById(R.id.textViewNotaFinal);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nota1.getText()
            }
        });
    }
}
