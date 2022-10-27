package br.ulbra.folhadepgto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edNome, edSalario, edFilhos;
    TextView resultNome, resultInss, resultRenda, resultSLiquido;
    Button btCalcular;
    RadioGroup radioGroup;
    RadioButton radMasculino, radfeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}