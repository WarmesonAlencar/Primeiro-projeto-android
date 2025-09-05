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
        EditText nota3 = findViewById(R.id.editTextNota3);
        Button calcular = findViewById(R.id.buttonCalcular);
        TextView resultado = findViewById(R.id.textViewNotaFinal);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nota1Str = nota1.getText().toString();
                String nota2Str = nota2.getText().toString();
                String nota3Str = nota3.getText().toString();


                float nota1Float = Float.parseFloat(nota1Str);
                float nota2Float = Float.parseFloat(nota2Str);
                float nota3Float = Float.parseFloat(nota3Str);

                float notaFinal = ((nota1Float * 3)+ (nota2Float * 3) + (nota3Float * 4 )) / 10;
                resultado.setText("A nota final do aluno foi: "+ notaFinal);

            }
        });
    }
}
