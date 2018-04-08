package com.joker.henry.molefromhole;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import model.GridSoil;
import model.HinhanhAdapter;
import model.Hole;

public class MainActivity extends AppCompatActivity {

    GridView grvBan;


    /*ArrayList<Hole> listhole;*/
    GridSoil gridSoil=new GridSoil( 10, 8 );
    HinhanhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* listhole =new ArrayList<>();*/


        grvBan=(GridView) findViewById(R.id.grid);
        VeManHinh();
    }

    public void VeManHinh()
    {


        grvBan.setNumColumns(gridSoil.getmWidthOfLand());

        gridSoil.Init(9);



        for(int i=0; i< gridSoil.getmHeightOfLand()*gridSoil.getmWidthOfLand(); i++){

            if(gridSoil.ishole(i)==true)
            {
                gridSoil.listhole.set(i,  new Hole(R.drawable.chuotlone));
            }
            else
                gridSoil.listhole.set(i,  new Hole(R.drawable.lo));

        }


        adapter=new HinhanhAdapter(this, R.layout.hinh_anh,gridSoil.listhole );
        grvBan.setAdapter(adapter);
    }
}
