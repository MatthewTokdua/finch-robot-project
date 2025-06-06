package com.thirteen;

import com.birdbrain.Finch;

public class Music {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        for (int i2=0;i2<5;i2++){
        for (int i=32;i<100;i++){
            myFinch.playNote(i,1);
        }
        }


        myFinch.stopAll();
        myFinch.disconnect();
    }
}