package Phrase;
import java.util.Scanner;
public class Player {
    private String player1;
    private String player2;
    private int score1 = 0;
    private int score2 = 0;
    Scanner sc = new Scanner(System.in);
    public Player(){
        Player1();
        Player2();
    }
    public void Player1(){
        System.out.println("What is the name of player 1?");
        player1 = sc.nextLine();
    }
    public void Player2(){
        System.out.println("What is the name of player 2?");
        player2 = sc.nextLine();
    }
    public String getP1(){
        return player1;
    }
    public String getP2(){
        return player2;
    }
    public void Score1(){
        Spinner pts = new Spinner();
        if (pts.Bankrupt()>10){
            score1 = score1 + pts.y;
        }
        else{
            score1=0;
            System.out.println("You were too greedy and went bankrupt");
        }
    }
    public void Score2(){
        Spinner pts = new Spinner();
        if (pts.Bankrupt()>10){
            score2 = score2 + pts.y;
        }
        else{
            score2=0;
            System.out.println("You were too greedy and went bankrupt");
        }
    }
    public void getScore1(){
        System.out.println(player1+"'s money earned: "+ score1);
    }
    public void getScore2(){
        System.out.println(player2+"'s money earned: "+ score2);
    }
}
