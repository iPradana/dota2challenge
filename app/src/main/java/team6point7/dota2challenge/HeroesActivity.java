package team6point7.dota2challenge;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HeroesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        LinearLayout linearLayout = findViewById(R.id.h1);

        // Create Button Dynamically
        Button btnShow = new Button(this);
        Button btnShow2 = new Button(this);
        btnShow.setText("123");
        btnShow2.setText("123");
        btnShow.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        btnShow2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        // Add Button to LinearLayout
        if (linearLayout != null) {
            linearLayout.addView(btnShow);
            linearLayout.addView(btnShow2);
        }

/*
        Button btn = new Button(this);

        ConstraintLayout L1 = (ConstraintLayout) findViewById(R.id.herolayout);
        ConstraintLayout.LayoutParams Lp = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
        L1.addView(btn,Lp);*/
    }
}
