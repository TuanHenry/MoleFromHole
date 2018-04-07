package model;


import java.util.Random;

/**
 * Created by Henry on 4/6/2018.
 */

public class GridSoil {
    private int arraySoil[] = new int[150];// trống 1: đất có hố quét mảng truyền vào để tạo lưới ô đất

    public int getArraySoil(int x) {
        return arraySoil[x];
    }

    public void setArraySoil(int index, int number) {
        this.arraySoil[index] = number;
    }

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
        for(int i=1; i< getmHeightOfLand()*getmWidthOfLand(); i++){


            this.arraySoil[i] = 0;

        }
        Random rd = new Random();
        int dem=0;
        int x;
        while(dem<holes)
        {
            x = rd.nextInt(getmHeightOfLand()*getmWidthOfLand());

            if (arraySoil[x] == 0)
            {
                arraySoil[x]=1;
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
