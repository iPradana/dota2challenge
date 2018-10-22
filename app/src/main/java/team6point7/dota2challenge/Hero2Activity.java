package team6point7.dota2challenge;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Hero2Activity extends AppCompatActivity {

    ImageView img;
    image_list imageList = new image_list();
    Bundle extras;
    int idnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero2);

        img = (ImageView) findViewById(R.id.imgHero);
        extras = getIntent().getExtras();
        idnya = extras.getInt("idnya");
        img.setImageResource(imageList.getList(idnya));
    }

    public void btnNext(View view){
        if(idnya>116){
            Toast.makeText(this,"This is the last hero",Toast.LENGTH_LONG).show();
        }else{
            Intent i = new Intent(this, Hero2Activity.class);
            int x = view.getId();
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
            int x = view.getId();
            x++;
            i.putExtra("idnya",x);
            startActivity(i);
            finish();
        }
    }
}
