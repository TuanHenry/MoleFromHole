package model;


import java.util.ArrayList;
import java.util.Random;
/**
 * Created by Henry on 4/6/2018.
 */

public class GridSoil {
    public boolean ishole(int x) {
        return listhole.get(x).isSoil ;
    }

    public void setishole(int index, boolean x) {
        this.listhole.get(index).isSoil=x ;
    }






    public static ArrayList<Hole> listhole=new  ArrayList<>();;// true co ho, false k co ho



    public GridSoil(int mWidthOfLand, int mHeightOfLand) {
        this.mWidthOfLand = mWidthOfLand;
        this.mHeightOfLand = mHeightOfLand;
    }



    private int mWidthOfLand;   //columns được truyền vào




    public int getmWidthOfLand() {
        return mWidthOfLand;
    }

    public void setmWidthOfLand(int mWidthOfLand) {
        this.mWidthOfLand = mWidthOfLand;
    }

    public int getmHeightOfLand() {
        return mHeightOfLand;
    }

    public void setmHeightOfLand(int mHeightOfLand) {
        this.mHeightOfLand = mHeightOfLand;
    }

    private int mHeightOfLand;  //rows được truyền vào


    //tạo ra lưới chứa các hole theo số lượng được truyền vào
    public  void Init(int holes)
    {
        int s=0;
        for(int i=0; i< getmHeightOfLand()*getmWidthOfLand(); i++){


            this.listhole.add(new Hole(false));

        }
        Random rd = new Random();
        int dem=0;
        int x;
        while(dem<holes)
        {
            x = rd.nextInt(getmHeightOfLand()*getmWidthOfLand());

            if (this.listhole.get(x).isSoil == false)
            {
                this.listhole.get(x).isSoil=true;
                dem++;

            }
        }

    }


    // add lưới vào grid_map(GridView trong file mainactivity.xml

    //test riêng từng phần kiểm tra hiển thị đúng yêu cầu

    //có thể để giá trị imgHole là hình bất kì với kích thước bất kì để test

    //hình ảnh
//    https://drive.google.com/drive/folders/16MRcTjyD1BF4NKF-d6nVMcCjY14zmJhQ?usp=sharing

}
