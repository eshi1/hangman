package Phrase;

public class Spinner {
    //private int points;
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
