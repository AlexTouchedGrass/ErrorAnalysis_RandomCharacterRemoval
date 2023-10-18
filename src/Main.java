import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean cont = true;
        String contYN;
        String word;
        int random = 0;

        System.out.println("Enter a word or phrase:");
        word = scan.nextLine();


        if(word.length() > 1) {
            do {
                random = (int)(Math.random()*word.length());
                word = word.substring(0,random) + word.substring(random + 1);
                System.out.println("Your new word/phrase is: " + word);
                if (word.length() > 1) {
                    System.out.println("Again? [Y/N]");
                    contYN = scan.nextLine();
                    if(contYN.equalsIgnoreCase("N")){
                        cont = false;
                    }
                } else {
                    System.out.println("Your word/phrase can't be smaller.");
                }
                System.out.println("Your word/phrase is too small to continue.");
            }while (cont);

        } else {
            System.out.println("Your word/phrase is too small to continue.");
        }




    }




}