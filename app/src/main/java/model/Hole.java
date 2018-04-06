package model;

import android.widget.ImageView;
import android.widget.RadioButton;

/**
 * Created by Henry on 4/6/2018.
 */

public class Hole {
    private ImageView imgHole;
    private int mSumTimer,mInterval;
    private int mWidth,mHeight;
    public RadioButton isMole;
    public boolean isSoil; // xét ô là đất thì k bắt sự kiện click vào hole và hình là soil

    public Hole() {
    }

    public Hole(ImageView imgHole, int mSumTimer, int mInterval, int mWidth, int mHeight, RadioButton isMole) {
        this.imgHole = imgHole;
        this.mSumTimer = mSumTimer;
        this.mInterval = mInterval;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.isMole = isMole;
    }

    public ImageView getImgHole() {
        return imgHole;
    }

    public void setImgHole(ImageView imgHole) {
        this.imgHole = imgHole;
    }

    public int getmSumTimer() {
        return mSumTimer;
    }

    public void setmSumTimer(int mSumTimer) {
        this.mSumTimer = mSumTimer;
    }

    public int getmInterval() {
        return mInterval;
    }

    public void setmInterval(int mInterval) {
        this.mInterval = mInterval;
    }

    public int getmWidth() {
        return mWidth;
    }

    public void setmWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public int getmHeight() {
        return mHeight;
    }

    public void setmHeight(int mHeight) {
        this.mHeight = mHeight;
    }

//    chuotXuatHien 'radioButton'{
//        khi thay doi gia tri(){ <!sử dụng thời gian và tốc độ nhập vào để set SumTime và Interval --!>
//                timer thay doi hinh anh(){
//            trong khi timer chay thay doi hinh anh;
//            ham on click image(){
//                dung timer thay lai anh;
//            }
//            -cuoi ham timer 'chua cham'{
//                thay  anh chet;
//            }
//            -ket thuc timer{
//                tru diem
//            }
//        }
//        }
//    }

    //test riêng bằng cách add 1 hole vào grid_map để xem code có chạy không
    //hình ảnh
//    https://drive.google.com/drive/folders/16MRcTjyD1BF4NKF-d6nVMcCjY14zmJhQ?usp=sharing

}
