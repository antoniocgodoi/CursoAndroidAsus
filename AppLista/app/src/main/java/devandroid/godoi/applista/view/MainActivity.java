package devandroid.godoi.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.godoi.applista.R;

import devandroid.godoi.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa1, pessoa2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa1 = new Pessoa("Antônio", "Godoi", "Android", 967631234);
        pessoa2 = new Pessoa("José", "Feliciano", "Android", 1178847577);

        String dadosPessoa1 = pessoa1.dadosPessoa();
        String dadosPessoa2 = pessoa2.dadosPessoa();

    }
}