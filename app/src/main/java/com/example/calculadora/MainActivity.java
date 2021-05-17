package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";
    private double resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("NewCalculadora");
        display = findViewById(R.id.TvDisplay);
    }

    /*Metodo para atualizar os botões clicados.*/

    private void atualizarDisplay(String texto) {

        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);

    }

    private void atualizarNumero(String numero) {
        if (operacao.isEmpty()) {
            primeiroNumero = primeiroNumero + numero;
        } else {
            segundoNumero = segundoNumero + numero;
        }
    }
    /* Fim!*/

    /* Metodos para os cliques no botão.*/

    public void onClickBotao1(View v) {
        atualizarNumero("1");
        atualizarDisplay("1");
    }

    public void onClickBotao2(View v) {
        atualizarNumero("2");
        atualizarDisplay("2");
    }

    public void onClickBotao3(View v) {
        atualizarNumero("3");
        atualizarDisplay("3");

    }

    public void onClickBotao4(View v) {
        atualizarNumero("4");
        atualizarDisplay("4");
    }

    public void onClickBotao5(View v) {
        atualizarNumero("5");
        atualizarDisplay("5");

    }

    public void onClickBotao6(View v) {
        atualizarNumero("6");
        atualizarDisplay("6");
    }

    public void onClickBotao7(View v) {
        atualizarNumero("7");
        atualizarDisplay("7");

    }

    public void onClickBotao8(View v) {
        atualizarNumero("8");
        atualizarDisplay("8");
    }

    public void onClickBotao9(View v) {
        atualizarNumero("9");
        atualizarDisplay("9");

    }

    public void onClickBotao0(View v) {
        atualizarNumero("0");
        atualizarDisplay("0");
    }
    /*Fim!*/

    /* Metodos e suas operações lógicas para as operações. */
    public void onClickAdicao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "Digite um número", Toast.LENGTH_LONG).show();
        }

    }

    public void onClickSubtracao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "-";
            atualizarDisplay("-");
        } else {
            Toast.makeText(MainActivity.this, "Digite um número", Toast.LENGTH_LONG).show();
        }

    }

    public void onClickMultiplicar(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "*";
            atualizarDisplay("*");
        } else {
            Toast.makeText(MainActivity.this, "Digite um número", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickDivisao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "/";
            atualizarDisplay("/");
        } else {
            Toast.makeText(MainActivity.this, "Digite um número", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickLimpar(View v) {
        operacao = "";
        primeiroNumero = "";
        segundoNumero = "";
        resultado = 0;
        display.setText("");
    }

    /* Fim!*/


    /* Metodo para junção de dos números das operações. */
    public void onClickIgual(View v) {

        if (!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()) {

            double numero1 = Integer.parseInt(primeiroNumero);
            double numero2 = Integer.parseInt(segundoNumero);


            if (operacao.equals("+")) {
                resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }

            if (operacao.equals("-")) {
                resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }

            if (operacao.equals("*")) {
                resultado = numero1 * numero2;
                display.setText((String.valueOf(resultado)));
            }

            if (operacao.equals("/")) {
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    display.setText(String.valueOf(resultado));
                } else {
                    Toast.makeText(MainActivity.this, "Não se pode multiplicar por 0", Toast.LENGTH_LONG).show();
                }
            }

        } else {
            Toast.makeText(MainActivity.this, "Digite um número", Toast.LENGTH_LONG).show();
        }
    }
    /* Fim!*/

}