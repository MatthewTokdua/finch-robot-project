package com.thirteen;

import com.birdbrain.Finch;

public class Maze {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        //int flag = 0;
        boolean flag = false;
        int count = 0;

        while(flag){ //while loop so the robot moves until it gets to the end
            if (myFinch.getDistance() < 150 && myFinch.getDistance()-5 > 0){ //moves if the robot isn't facing a wall or open air
            myFinch.setMove("F",myFinch.getDistance()-5,100);
            myFinch.pause(1);
            }
            else { // algorithm for if the robot is facing a wall; turns right normally but turns left if, after it turns right, there is still a wall
                myFinch.setTurn("R",90,100);
                myFinch.pause(1);
                if (myFinch.getDistance()-15 < 10){
                    myFinch.setTurn("R",180,100);
                    myFinch.pause(1);
                }
            }
            //flag++;
        }

        //preprogrammed instructions to make robot reach the end
        myFinch.setMove("F",110,80);
        myFinch.setTurn("L",90,100);
        myFinch.setMove("F",39,100);
        myFinch.setTurn("L",90,100);
        myFinch.setMove("F",30,100);
        myFinch.setTurn("R",90,100);
        myFinch.setMove("F",50,100);
        myFinch.setTurn("R",90,100);
        myFinch.setMove("F",125,100);
        myFinch.setTurn("R",90,100);
        myFinch.setMove("F",10,100);
        myFinch.setTurn("L",90,100);
        myFinch.setMove("F",10,100);
        myFinch.setTurn("L",90,100);
        myFinch.setMove("F",10,100);

        myFinch.stopAll();
        myFinch.disconnect();
    }
}