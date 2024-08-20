import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int numberFound = 0;
        int numOfPatterns;
        
        System.out.print("Enter the value of N: ");
        numOfPatterns = scan.nextInt();
        scan.nextLine();
        
        String[] patterns = new String[numOfPatterns];
        
        System.out.printf("Enter %d patterns: %n", numOfPatterns);
        
        for(int i = 0; i < numOfPatterns; i++){
            patterns[i] = scan.nextLine();
        }

        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        for(int i = 0; i < numOfPatterns; i++){
            if(word.indexOf(patterns[i]) != -1){
                numberFound++;
            }
        }
        
        System.out.printf("Number: %d", numberFound);
        scan.close();
    }
}