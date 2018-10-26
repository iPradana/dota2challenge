package team6point7.dota2challenge;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    Button btnK;
    String koin="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper(this);

        Cursor res = myDb.getDataKoin();
        if(res.getCount() == 0){
            //showMessage("ERROR", "NOTHING FOUND");
            myDb.insertData1("100");
            resethero();
            Toast.makeText(MainActivity.this, "Current Coins 100", Toast.LENGTH_LONG).show();
            return;
        }

        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()){
            koin = res.getString(1);
        }

        btnK = (Button) findViewById(R.id.btnC);
        btnK.setText(koin);
        //showMessage("Data Mahasiswa",buffer.toString());
    }

    public void btnPlay(View view){
        Intent i = new Intent(this,PlayActivity.class);
        startActivity(i);
    }

    public void resethero(){
        Cursor rs =myDb.getDataHero1();
        if(rs.getCount() == 0){
            for(int abc=0; abc<116; abc++){
                myDb.insertData2(abc);
            }
        }
    }
}
