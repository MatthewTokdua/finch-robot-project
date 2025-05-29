package com.thirteen;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.playNote(60,0.5);

        for (int i = 0; i < 4; i++) {
            myFinch.setTail(i+1,255,0,0);
            myFinch.setBeak(255, 100, 100);
            myFinch.pause(1);
            myFinch.setBeak(0, 0, 0);
            myFinch.setTail(i+1,0,0,0);
            myFinch.pause(1);
        }

        myFinch.setTurn("L",90,100);
        myFinch.setMove("F",20,100);



        myFinch.stopAll();
        myFinch.disconnect();
    }
}