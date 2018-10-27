package team6point7.dota2challenge;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Hero2Activity extends AppCompatActivity {

    ImageView img;
    image_list imageList = new image_list();
    Bundle extras;
    int idnya;
    Button btnA, btnB, btnC, btnD, btnHint, btnHide, btnAnswer;
    opsi_hero oh = new opsi_hero();
    String answerx, answer;
    String AA, AB, AC, AD;
    TextView tvHint, tv50, tvAnswer;
    DatabaseHelper myDb;
    String koin,idkoin;
    int koin2;
    String idpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero2);

        myDb = new DatabaseHelper(this);

        Cursor res = myDb.getDataKoin();
        if(res.getCount() == 0){
            //showMessage("ERROR", "NOTHING FOUND");
            myDb.insertData1("100");
            Toast.makeText(this, "Current Coins 100", Toast.LENGTH_LONG).show();
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()){
            idkoin = res.getString(0);
            koin = res.getString(1);
        }

        img = (ImageView) findViewById(R.id.imgHero);
        extras = getIntent().getExtras();
        idnya = extras.getInt("idnya");
        img.setImageResource(imageList.getList(idnya));

        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);

        btnAnswer = (Button) findViewById(R.id.btnAnswer);

        btnA.setText(oh.getA(idnya));
        btnB.setText(oh.getB(idnya));
        btnC.setText(oh.getC(idnya));
        btnD.setText(oh.getD(idnya));
        answer = oh.getX(idnya);

        res = myDb.getDataHero(idnya);
        if(res.getCount() == 0){
            //showMessage("ERROR", "NOTHING FOUND");
            Toast.makeText(this, "Application Error", Toast.LENGTH_LONG).show();
            return;
        }
        buffer = new StringBuffer();
        while (res.moveToNext()){
            switch(res.getString(1)){
                case "0": break;
                case "1": btnA.setBackgroundColor(Color.RED); btnA.setEnabled(false); break;
                case "2": btnA.setBackgroundColor(Color.GREEN);
                            btnA.setEnabled(false);
                            btnB.setEnabled(false);
                            btnC.setEnabled(false);
                            btnD.setEnabled(false); break;
            }
            switch(res.getString(2)){
                case "0": break;
                case "1": btnB.setBackgroundColor(Color.RED); btnB.setEnabled(false); break;
                case "2": btnB.setBackgroundColor(Color.GREEN);
                    btnA.setEnabled(false);
                    btnB.setEnabled(false);
                    btnC.setEnabled(false);
                    btnD.setEnabled(false); break;
            }
            switch(res.getString(3)){
                case "0": break;
                case "1": btnC.setBackgroundColor(Color.RED); btnC.setEnabled(false); break;
                case "2": btnC.setBackgroundColor(Color.GREEN);
                    btnA.setEnabled(false);
                    btnB.setEnabled(false);
                    btnC.setEnabled(false);
                    btnD.setEnabled(false); break;
            }
            switch(res.getString(4)){
                case "0": break;
                case "1": btnD.setBackgroundColor(Color.RED); btnD.setEnabled(false); break;
                case "2": btnD.setBackgroundColor(Color.GREEN);
                    btnA.setEnabled(false);
                    btnB.setEnabled(false);
                    btnC.setEnabled(false);
                    btnD.setEnabled(false); break;
            }
            switch(res.getString(5)){
                case "0": break;
                case "1": btnAnswer.setText(answer); btnAnswer.setEnabled(false); break;
            }
        }

        btnHint = (Button) findViewById(R.id.btnHint);
        btnHint.setText(koin);
    }

    public void btnNext(View view){
        if(idnya>116){
            Toast.makeText(this,"This is the last hero",Toast.LENGTH_LONG).show();
        }else{
            Intent i = new Intent(this, Hero2Activity.class);
            int x = idnya;
            x++;
            i.putExtra("idnya",x);
            startActivity(i);
            finish();
        }
    }

    public void btnPrevious(View view){
        if(idnya==0){
            Toast.makeText(this,"This is the first hero",Toast.LENGTH_LONG).show();
        }else{
            Intent i = new Intent(this, Hero2Activity.class);
            int x = idnya;
            x--;
            i.putExtra("idnya",x);
            startActivity(i);
            finish();
        }
    }

    public void tryAnswer(View view){
        koin2 = Integer.parseInt(koin);
        if(koin2<20){
            Toast.makeText(this,"You need more coins to answer (20 coins to answer)",Toast.LENGTH_LONG).show();
        }else{
            btnAnswer = (Button) findViewById(view.getId());
            answerx = btnAnswer.getText().toString();
            switch(view.getId()){
                case R.id.btnA : idpress="NAME1"; break;
                case R.id.btnB : idpress="NAME2"; break;
                case R.id.btnC : idpress="NAME3"; break;
                case R.id.btnD : idpress="NAME4"; break;
            }

            if(answer.equalsIgnoreCase(answerx)){
                btnAnswer.setBackgroundColor(Color.GREEN);
                koin2=koin2+10;
                myDb.updateData2(Integer.toString(idnya),idpress,"2");
                btnA.setEnabled(false);
                btnB.setEnabled(false);
                btnC.setEnabled(false);
                btnD.setEnabled(false);
            }else{
                btnAnswer.setBackgroundColor(Color.RED);
                btnAnswer.setEnabled(false);
                myDb.updateData2(Integer.toString(idnya),idpress,"1");
                koin2=koin2-20;
            }
            koin = Integer.toString(koin2);
            myDb.updateData1(idkoin,koin);

            btnHint.setText(koin);
        }
    }

    public void setHero(View view){
        Cursor res = myDb.getDataKoin();
        if(res.getCount() == 0){
            //showMessage("ERROR", "NOTHING FOUND");
            myDb.insertData1("100");
            Toast.makeText(this, "Current Coins 100", Toast.LENGTH_LONG).show();
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()){
            idkoin = res.getString(0);
            koin = res.getString(1);
        }
        koin2 = Integer.parseInt(koin);
        koin2 = koin2 + 10;
        koin = Integer.toString(koin2);
        myDb.updateData1(idkoin,koin);

    }

    public void hide1(View view){
        koin2 = Integer.parseInt(koin);
        if(koin2<50){
            Toast.makeText(this,"you need at least 50 coins to open",Toast.LENGTH_LONG).show();
        }else{
            btnAnswer = (Button) findViewById(view.getId());
            btnAnswer.setText(answer);

            koin2=koin2-50;
            koin=Integer.toString(koin2);
            myDb.updateData1(idkoin,koin);
            myDb.updateData2(Integer.toString(idnya),"NAME5","1");
        }
    }
}
