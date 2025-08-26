import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = in.nextLine();
        System.out.println("Enter number of repetitions:");
        int n = in.nextInt();

        String[] words = text.split(" ");
        ArrayList<String> repetitiveWords = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            int counter = 0;
            for(int j = i; j < words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    counter++;
                }
            }
            if(counter == n){
                repetitiveWords.add(words[i]);
            }
        }

        System.out.println("Repetitive words:");
        for(String word: repetitiveWords){
            System.out.println(word);
        }

    }
}