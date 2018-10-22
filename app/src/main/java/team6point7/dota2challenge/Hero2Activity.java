package team6point7.dota2challenge;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Hero2Activity extends AppCompatActivity {

    ImageView img;
    image_list imageList = new image_list();
    Bundle extras;
    int idnya;
    Button btnA, btnB, btnC, btnD, btnHide;
    opsi_hero oh = new opsi_hero();
    String answer;
    TextView tvHint, tv50, tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero2);

        img = (ImageView) findViewById(R.id.imgHero);
        extras = getIntent().getExtras();
        idnya = extras.getInt("idnya");
        img.setImageResource(imageList.getList(idnya));

        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);

        tvHint = (TextView) findViewById(R.id.txtHint);
        tv50 = (TextView) findViewById(R.id.txt50);
        tvAnswer = (TextView) findViewById(R.id.txtAnswer);

        btnA.setText(oh.getA(idnya));
        btnB.setText(oh.getB(idnya));
        btnC.setText(oh.getC(idnya));
        btnD.setText(oh.getD(idnya));
        answer = oh.getX(idnya);

        tvHint.setVisibility(View.INVISIBLE);
        tv50.setVisibility(View.INVISIBLE);
        tvAnswer.setVisibility(View.INVISIBLE);

        tvAnswer.setText(answer);
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

    public void hide1(View view){
        btnHide = (Button) findViewById(view.getId());
        btnHide.setVisibility(View.INVISIBLE);
        tvHint.setVisibility(View.VISIBLE);
    }
    public void hide2(View view){
        btnHide = (Button) findViewById(view.getId());
        btnHide.setVisibility(View.INVISIBLE);
        tv50.setVisibility(View.VISIBLE);
    }
    public void hide3(View view){
        btnHide = (Button) findViewById(view.getId());
        btnHide.setVisibility(View.INVISIBLE);
        tvAnswer.setVisibility(View.VISIBLE);
    }
}
