package com.thirteen;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        int flag = 0;

        while(flag < 10){
            if (myFinch.getDistance()-5 < 100 && myFinch.getDistance()-5 > 0){
            myFinch.setMove("F",myFinch.getDistance()-5,10);
            myFinch.pause(1);
            }
            else {
                myFinch.setTurn("R",90,10);
                myFinch.pause(1);
                if (myFinch.getDistance()-15 < 10){
                    myFinch.setTurn("L",180,10);
                    myFinch.pause(1);
                }
            }
            flag++;
        }




        myFinch.stopAll();
        myFinch.disconnect();
    }
}