import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int numOfPatterns;
        
        System.out.print("Enter the value of N: ");
        numOfPatterns = scan.nextInt();
        String[] patterns = new String[numOfPatterns];
        
        System.out.printf("Enter %d patterns: %n", numOfPatterns);
        for(int i = 0; i < numOfPatterns; i++){
            patterns[i] = scan.nextLine();
        }
        
        System.out.println(patterns);
        scan.close();
    }
}