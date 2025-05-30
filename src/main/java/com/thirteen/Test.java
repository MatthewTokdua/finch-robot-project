package com.thirteen;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        int flag = 0;

        while(flag < 5){
            myFinch.setMove("F",myFinch.getDistance()-1,10);
            flag++;
            myFinch.pause(1);
        }




        myFinch.stopAll();
        myFinch.disconnect();
    }
}