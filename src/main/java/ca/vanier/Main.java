package ca.vanier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your score ");
        double score= scan.nextDouble();
ScoreManager scoreManager=new ScoreManager();
        System.out.println(scoreManager.passscore(score));
    }
}
