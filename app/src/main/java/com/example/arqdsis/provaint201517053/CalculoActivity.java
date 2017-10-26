package com.example.arqdsis.provaint201517053;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * @Autor:  Rafael Vasconcelos dos Santos - 201517053
 */
public class CalculoActivity extends Activity {

    /**
     * @Autor:  Rafael Vasconcelos dos Santos - 201517053
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        //Get Intent e valores
        Intent intent = getIntent();
        String sTabuada = intent.getStringExtra(MainActivity.TABUADA);
        String sAte = intent.getStringExtra(MainActivity.TABUADA_ATE);

        //Monta ListView
        ListView lst = (ListView)findViewById(R.id.lst_calculo);
        ArrayAdapter<String> adapter = montaTabuada(sTabuada, sAte);
        lst.setAdapter(adapter);

    }
    /**
     * @Autor:  Rafael Vasconcelos dos Santos - 201517053
     */
    private ArrayAdapter<String> montaTabuada(String sTabuada, String sAte){
        int iTabuada = Integer.parseInt(sTabuada);
        int iAte = Integer.parseInt(sAte);
        ArrayList<String> listaCalculo = new ArrayList<String>();

        for (int i = 0; i <= iAte; i++){
            listaCalculo.add(iTabuada + "x" + i +" = " + (i * iTabuada));
        }

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, listaCalculo);

        return adapter;
    }
}
