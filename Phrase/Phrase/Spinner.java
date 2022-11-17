package Phrase;
//the code below was an attempt at making a money based point system, however
//there was not enough time to trouble shoot the error of earning points from
//typing the same letters
public class Spinner {
    public int x;
    public int y;
    public Spinner(){
        x = (int)(Math.random()*20)*5; 
        y = (int)(Math.random()*20)*5;
    }
    public int Bankrupt(){
        int z = (int)(Math.random()*100);
        return z;
    }
}