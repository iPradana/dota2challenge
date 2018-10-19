package team6point7.dota2challenge;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HeroesActivity extends AppCompatActivity {

    image_list imageList = new image_list();
    Button btnHero;
    LinearLayout L2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        LinearLayout linearLayout = findViewById(R.id.h1);

        // Create Button Dynamically
        /*Button btnShow = new Button(this);
        Button btnShow2 = new Button(this);
        btnShow.setBackgroundResource(R.drawable.hero1);
        btnShow2.setBackgroundResource(R.drawable.hero2);
        btnShow.setLayoutParams(new LinearLayout.LayoutParams(500, LinearLayout.LayoutParams.WRAP_CONTENT));
        btnShow2.setLayoutParams(new LinearLayout.LayoutParams(600, LinearLayout.LayoutParams.WRAP_CONTENT));
        */

        for(int i=0;i<116;i++){
            L2 = new LinearLayout(this);
            L2.setOrientation(LinearLayout.HORIZONTAL);
            L2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));

            linearLayout.addView(L2);
            for(int z=0;z<2;z++){
                btnHero = new Button(this);
                btnHero.setBackgroundResource(imageList.getList(i));
                //btnHero.setLayoutParams(new LinearLayout.LayoutParams(400, 300));
                LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(500,300);
                p.setMargins(20,20,20,20);
                btnHero.setLayoutParams(p);

                L2.addView(btnHero);
                i++;
            }
            i--;
        }

/*
        Button btn = new Button(this);

        ConstraintLayout L1 = (ConstraintLayout) findViewById(R.id.herolayout);
        ConstraintLayout.LayoutParams Lp = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
        L1.addView(btn,Lp);*/
    }
}
