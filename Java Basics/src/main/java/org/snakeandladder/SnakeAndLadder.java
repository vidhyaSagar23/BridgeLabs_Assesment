package org.snakeandladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {

        Random random=new Random();
        int player1=0;
        int player2=0;
        int chance=1;
        int ladder[]={8,22,45,56,67,88};

        int snake[]={17,43,58,63,87,95};

        List<Integer> p1=new ArrayList<>();

        List<Integer> p2=new ArrayList<>();

        List<Integer> throws1=new ArrayList<>();

        List<Integer> throws2=new ArrayList<>();

        while(true){
            int value=random.nextInt(1,7);
            if(chance%2!=0){
                throws1.add(value);
                if(player1 + value<=100) {
                    player1 = player1 + value;
                    for(int i=0;i<ladder.length;i++){
                        if (player1==ladder[i]){
                            player1= player1 + 5;
                            break;
                        }
                    }
                    for (int i=0;i< snake.length;i++){
                        if(player1==snake[i]){
                            player1 = player1 - 5;
                            break;
                        }
                    }
                }
                p1.add(player1);
            }
            else{
                throws2.add(value);
                if (player2 + value<=100) {
                    player2 = player2 + value;
                    for(int i=0;i<ladder.length;i++){
                        if (player1==ladder[i]){
                            player1= player1 + 5;
                            break;
                        }
                    }
                    for (int i=0;i< snake.length;i++){
                        if(player1==snake[i]){
                            player1 = player1 - 5;
                            break;
                        }
                    }
                }
                p2.add(player2);
            }
            if (player1==100){
                System.out.println("Thrown1 : "+throws1+"\nPlayer1 : "+p1+
                        "\n--------------------------------------------------------------------------------------------------"
                        +"\nThrown2 :"+throws2+"\nPlayer2 : "+p2);
                System.out.println("Player1 Wins");
                break;
            }
            else if (player2==100){
                System.out.println("Thrown1 : "+throws1+"\nPlayer1 : "+p1+
                        "\n--------------------------------------------------------------------------------------------------"
                        +"\nThrown2 :"+throws2+"\nPlayer2 : "+p2);
                System.out.println("Player2 Wins");
                break;
            }
            chance++;
        }
    }
}
