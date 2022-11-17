package Phrase;
import java.util.Scanner;
import java.io.File;
public class Board{
Phrase phrase = new Phrase();
Scanner sc = new Scanner(System.in);
private String idiom = phrase.loadPhrase();
private int spaces = idiom.length();
private String guess = "";
private String lettersGuessed = "";
private String enter = "";
  public Board()
  {
    System.out.println("Welcome to the Monotonous Hangman Game. This is a two-player game. When you think you know the phrase, take a guess. \nKeep in mind that in order to win, you must type out the entire phrase! Press enter to continue");
    enter = sc.nextLine();
    Player player = new Player();
    boolean p1 = true;
    System.out.println(Blank(" "));
    
    while (!(guess.equals(idiom))){
      while (p1==true){
        System.out.println("Letters guessed: "+lettersGuessed);
        System.out.println(player.getP1()+"'s guess: ");
        guess = sc.nextLine();
        if(guess.equals(idiom)){
          break;
        }
        else if (idiom.indexOf(guess)>=0){
          System.out.println("The letter " + guess +" exists\n");
          System.out.println(Blank(guess));
        }
        else{
          if (guess.length()<=1){
            System.out.println("The letter " +guess + " does not exist\n");
            System.out.println(Blank(guess));
          }
          else {
            System.out.println("The letter " +guess + " does not exist\n");
            System.out.print(Blank(guess));
          }
          p1=false;
        }
      }
      while (p1==false){
        System.out.println("Letters Guessed: "+lettersGuessed);
        System.out.println(player.getP2()+"'s guess: ");
        guess = sc.nextLine();
        if(guess.equals(idiom)){
          break;
        }
        else if (idiom.indexOf(guess)>=0){
          System.out.println("The letter " + guess +" exists\n");
          System.out.println(Blank(guess));
        }
        else{
          if (guess.length()<=1){
            System.out.println("The letter " +guess + " does not exist\n");
            System.out.println(Blank(guess));
          }
          else {
            System.out.println("The letter " +guess + " does not exist\n");
            System.out.print(Blank(guess));
          }
          p1=true;
        }
      }
    }
    if (p1==true){
      System.out.println(player.getP1()+" won!");
    }
    else if (p1==false){
      System.out.println(player.getP2()+" won!");
    }
  }

  //this code below helps print out underscores for the unguessed letters and the 
  //corresponding letter for the guessed letter
  public String Blank(String g){
    String blank = "";
    if (g.length()<=1){
      if (lettersGuessed.contains(g)){
        System.out.println("You've already guessed this letter");
      }
      else{
        lettersGuessed +=g;
        for (int i = 0; i<spaces;i++){
          if(lettersGuessed.contains(idiom.substring(i,i+1))){
            blank+=idiom.substring(i,i+1);
          }
          else if (idiom.substring(i,i+1).equals(" ")){
            blank+=" ";
          }
          else{
            blank+="_";
          }
        } 
      }
    }
    else{
      System.out.println("Only guess one letter at a time\n");
      System.out.println(Blank(""));
    }
    return blank;
  }
}