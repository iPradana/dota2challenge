package team6point7.dota2challenge;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

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
}
