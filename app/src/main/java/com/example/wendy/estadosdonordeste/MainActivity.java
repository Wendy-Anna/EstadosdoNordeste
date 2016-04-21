package com.example.wendy.estadosdonordeste;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
public class MainActivity extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context contexto = getApplicationContext();
        String texto = "Seja bem-vindo ao Nordeste";
        int duracao = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.show();
        Button one = (Button) findViewById(R.id.botao1);
        one.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.botao2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.botao3);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.botao4);
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.botao5);
        five.setOnClickListener(this);
    }
    public void onClick(View v){

        switch (v.getId()) {

            case R.id.botao1:
                TextView view = (TextView) findViewById(R.id.textView1);
                if (view.getVisibility() == View.GONE) {
                    view.setVisibility(View.VISIBLE);
                } else {
                    view.setVisibility(View.GONE);
                }


                break;

            case R.id.botao2:
                TextView view2 = (TextView) findViewById(R.id.textView2);
                if (view2.getVisibility() == View.GONE) {
                    view2.setVisibility(View.VISIBLE);
                } else {
                    view2.setVisibility(View.GONE);
                }

                break;

            case R.id.botao3:
                TextView view3 = (TextView) findViewById(R.id.textView3);
                if (view3.getVisibility() == View.GONE) {
                    view3.setVisibility(View.VISIBLE);
                } else {
                    view3.setVisibility(View.GONE);
                }

                break;

            case R.id.botao4:
                TextView view4 = (TextView) findViewById(R.id.textView4);
                if (view4.getVisibility() == View.GONE) {
                    view4.setVisibility(View.VISIBLE);
                } else {
                    view4.setVisibility(View.GONE);
                }
                break;

            case R.id.botao5:
                TextView view5 = (TextView) findViewById(R.id.textView5);
                if (view5.getVisibility() == View.GONE) {
                    view5.setVisibility(View.VISIBLE);
                } else {
                    view5.setVisibility(View.GONE);
                }
                break;

            default:
                break;


        }
    }
}