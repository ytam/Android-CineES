package brusk.com.hm22;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    Spinner  spinner;
    ListView  listView;
    Bundle myStateInfo;

    String[] names={"Abluka","Açlık Oyunları ve Alaycı Kuş", "Ali Baba ve 7 Cüceler","Gizemli Gerçek","Hayatın Kıyısında","Peanuts"};
    String[] languages ={"Türkçe Dublaj","Türkçe Altyazılı","Türkçe Altyazılı","Türkçe Dublaj","Türkçe Dublaj","Türkçe Altyazılı"};
    int[] images ={R.drawable.abluka,R.drawable.aclik_oyunlari,R.drawable.ali_baba,R.drawable.gizemli_gercek,R.drawable.hayatin_kiyisinda,R.drawable.peanuts};

    String[] names1={"Gizemli Gerçek","Açlık Oyunları ve Alaycı Kuş", "Ali Baba ve 7 Cüceler","Abluka","Spectre"};
    String[] languages1 ={"Türkçe Dublaj","Türkçe Altyazılı","Türkçe Altyazılı","Türkçe Dublaj","Türkçe Dublaj"};
    int[] images1 ={R.drawable.gizemli_gercek,R.drawable.aclik_oyunlari,R.drawable.ali_baba,R.drawable.abluka,R.drawable.spectre};

    String[] names2={ "Ali Baba ve 7 Cüceler","Açlık Oyunları ve Alaycı Kuş","Abluka","Gizemli Gerçek","Peanuts","Spectre"};
    String[] languages2 ={"Türkçe Dublaj","Türkçe Altyazılı","Türkçe Altyazılı","Türkçe Dublaj","Türkçe Altyazılı","Türkçe Dublaj"};
    int[] images2 ={R.drawable.ali_baba,R.drawable.aclik_oyunlari,R.drawable.abluka,R.drawable.gizemli_gercek,R.drawable.peanuts,R.drawable.spectre};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapterSpinner =ArrayAdapter.createFromResource(this,R.array.sinema , android.R.layout.simple_spinner_item);

        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                switch (position){



                    case 1:
                        Adapter adapter = new Adapter(MainActivity.this,names ,languages,images);
                        listView.setAdapter(adapter);

                        textView.setText("Espark Cinemaximun "); break;

                    case 3:
                        Adapter adapter1 = new Adapter(MainActivity.this,names1 ,languages1,images1);
                        listView.setAdapter(adapter1);

                        textView.setText("Kanatlı Cinema Pink");break;

                    case 2:
                        Adapter adapter2 = new Adapter(MainActivity.this,names2 ,languages2, images2);
                        listView.setAdapter(adapter2);

                        textView.setText("Özdilek CineTime");break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                listView.setBackgroundColor(Color.parseColor("#FFF"));

            }
        });





    }




}
