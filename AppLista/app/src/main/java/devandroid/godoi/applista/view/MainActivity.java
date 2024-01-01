package devandroid.godoi.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.godoi.applista.R;

import devandroid.godoi.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    EditText editTextPrimeiroNome;
    EditText editTextSobrenome;
    EditText editTextCurso;
    EditText editTextTelefone;

    Button botaoSalvar;
    Button botaoLimpar;
    Button botaoFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        editTextPrimeiroNome = findViewById(R.id.editTextPrimeiroNome);
        editTextSobrenome = findViewById(R.id.editTextSobrenome);
        editTextCurso = findViewById(R.id.editTextCurso);
        editTextTelefone = findViewById(R.id.editTextTelefone);

        botaoLimpar = findViewById(R.id.botaoLimpar);
        botaoSalvar = findViewById(R.id.botaoSalvar);
        botaoFinalizar = findViewById(R.id.botaoFinalizar);

        botaoLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextPrimeiroNome.setText("");
                editTextSobrenome.setText("");
                editTextCurso.setText("");
                editTextTelefone.setText("");
            }
        });

        botaoFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextPrimeiroNome.getText().toString().equals("")
                        && !editTextSobrenome.getText().toString().equals("")
                        && !editTextTelefone.getText().toString().equals("")
                        && !editTextCurso.getText().toString().equals("")) {
                    pessoa.setNome(editTextPrimeiroNome.getText().toString());
                    pessoa.setSobrenome(editTextSobrenome.getText().toString());
                    pessoa.setCurso(editTextCurso.getText().toString());
                    pessoa.setTelefone(Integer.parseInt(editTextTelefone.getText().toString()));

                    Toast.makeText(MainActivity.this, "Salvo: " + pessoa.toString(), Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(MainActivity.this, "Erro: Preencha Todos os Campos Primeiro", Toast.LENGTH_SHORT).show();
            }

        });

        Log.i("Pessoa", pessoa.toString());
    }
}