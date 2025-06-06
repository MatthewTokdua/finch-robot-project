package com.thirteen;

import com.birdbrain.Finch;

public class Danze {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        boolean flag = true;
        String dir = "";
        double degree = 0;
        double speed = 0;
        int count = 0;

        while (count < 10){
            double rnd = Math.random();
            if (rnd > 0.5){
                dir = "R";
            }else{
                dir = "L";
            }
            degree = rnd * 350;
            speed = rnd * 90;
            myFinch.setTurn(dir,degree,speed);
            myFinch.setBeak((int)(Math.random()*88)+1,(int)(Math.random()*88)+1,(int)(Math.random()*88)+1);
            count++;
        }

        myFinch.setBeak(0,0,0);
        myFinch.stopAll();
        myFinch.disconnect();
    }
}