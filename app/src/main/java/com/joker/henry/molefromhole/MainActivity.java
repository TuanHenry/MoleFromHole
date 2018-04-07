package com.joker.henry.molefromhole;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

import model.HinhanhAdapter;
import model.GridSoil;
import model.HinhAnh;

public class MainActivity extends AppCompatActivity {

    GridView grvBan;
    GridSoil gridSoil=new GridSoil(10, 8);

    ArrayList<HinhAnh> listHinhAnh;

    HinhanhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listHinhAnh =new ArrayList<>();


        grvBan=(GridView) findViewById(R.id.grid);
        VeManHinh();
    }

    public void VeManHinh()
    {


        grvBan.setNumColumns(gridSoil.getmWidthOfLand());

        gridSoil.Init(9);



        for(int i=0; i< gridSoil.getmHeightOfLand()*gridSoil.getmWidthOfLand(); i++){

            if(gridSoil.getArraySoil(i)==1)
            {
                listHinhAnh.add(new HinhAnh(R.drawable.chuotlone));
            }
            else
                listHinhAnh.add(new HinhAnh(R.drawable.lo));

        }


        adapter=new HinhanhAdapter(this, R.layout.hinh_anh,listHinhAnh );
        grvBan.setAdapter(adapter);
    }
}
