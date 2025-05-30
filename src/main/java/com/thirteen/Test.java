package com.thirteen;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        int flag = 0;

        while(flag < 5){
            myFinch.setMove(myFinch.getDistance()-1);
            flag++;
            myFinch.pause(1);
        }




        myFinch.stopAll();
        myFinch.disconnect();
    }
}