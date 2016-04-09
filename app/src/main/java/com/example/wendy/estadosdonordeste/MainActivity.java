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
                view.setText("A história da Bahia é um domínio de estudos de história que, canonicamente, se estende desde a chegada dos portugueses, em Porto Seguro, em 1500, até os dias atuais.");
                view.setTextSize(25);
                break;
            case R.id.botao2:
                TextView view2 = (TextView) findViewById(R.id.textView2);
                view2.setText( "O Ceará foi formado por indígenas catequizados e aculturados ,após grande resistência à colonização de negros e mulatos que viviam como trabalhadores livres ou como escravos.");
                view2.setTextSize(25);
                break;
            case R.id.botao3:
                TextView view3 = (TextView) findViewById(R.id.textView3);
                view3.setText("Na Paraíba grupos étnicos indígenas dividiam-se em dois no momento da chegada dos europeus: os Tupis e os Cariris também chamados de Tapuias. Os Tupis se dividiam em Tabajaras e Potiguaras, que eram inimigos entre si.");
                view3.setTextSize(25);
                ;
                break;
            case R.id.botao4:
                TextView view4 = (TextView) findViewById(R.id.textView4);
                view4.setText("A História de Pernambuco começa antes do descobrimento do Brasil, quando o atual território do estado era povoado pelos índios tabajaras." + "\n");
                view4.setTextSize(25);
                break;
            case R.id.botao5:
                TextView view5 = (TextView) findViewById(R.id.textView5);
                view5.setText("\n" +
                        "A História do estado do Rio Grande do Norte, inicia-se a partir do povoamento do território brasileiro, quando houve uma onda de migrações para os Andes, depois para o Planalto do Brasil, a região Nordeste, até chegarem ao Rio Grande do Norte. ");
                view5.setTextSize(25);
                break;
            default:
                break;
        }
    }
}