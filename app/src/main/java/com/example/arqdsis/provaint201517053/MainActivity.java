package com.example.arqdsis.provaint201517053;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * @Autor:  Rafael Vasconcelos dos Santos - 201517053
 */
public class MainActivity extends Activity {


    public static final String TABUADA = "com.example.arqdsis.provaint201517053.TABUADA";
    public static final String TABUADA_ATE = "com.example.arqdsis.provaint201517053.TABUADA_ATE";

    /**
     * @Autor:  Rafael Vasconcelos dos Santos - 201517053
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @Autor:  Rafael Vasconcelos dos Santos - 201517053
     * @param view
     */
    public void calcular(View view) {
        //Pega os valores dos campos
        EditText txt_tabuada = (EditText)findViewById(R.id.edt_tabuada);
        EditText txt_ate = (EditText)findViewById(R.id.edt_ate);
        String qualtabuada = txt_tabuada.getText().toString();
        String ate_tabuada = txt_ate.getText().toString();
        //Monta o Intent para mandar para outra Tela
        Intent intent = new Intent(this, CalculoActivity.class);
        intent.putExtra(TABUADA,qualtabuada);
        intent.putExtra(TABUADA_ATE,ate_tabuada);
        startActivity(intent);

    }
}
