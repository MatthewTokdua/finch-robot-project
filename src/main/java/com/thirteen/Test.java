package com.thirteen;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        //int flag = 0;
        boolean flag = true;

        while(flag){ //while loop so the robot moves until it gets to the end
            if (myFinch.getDistance() < 150 && myFinch.getDistance()-5 > 0){ //moves if the robot isn't facing a wall or open air
            myFinch.setMove("F",myFinch.getDistance()-5,100);
            myFinch.pause(1);
            }
            else { // algorithm for if the robot is facing a wall; turns right normally but turns left if, after it turns right, there is still a wall
                myFinch.setTurn("R",90,100);
                myFinch.pause(1);
                if (myFinch.getDistance()-15 < 10){
                    myFinch.setTurn("L",180,100);
                    myFinch.pause(1);
                }
            }
            //flag++;
        }




        myFinch.stopAll();
        myFinch.disconnect();
    }
}