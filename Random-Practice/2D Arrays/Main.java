import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int my2DArray[][] = new int[3][10];
        int y=0, z = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i<=9; i++){
            int enteredNum = Integer.parseInt(br.readLine());
            my2DArray[0][i] = enteredNum;
            int temp = enteredNum %2 == 0 ? (my2DArray[1][y++] = enteredNum) : (my2DArray[2][z++] = enteredNum);
        }

        //clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Entered numbers: ");
        for (int j = 0; j<=9; j++){
            System.out.print(my2DArray[0][j] + " ");
        }

        System.out.println();

        if(y == 10){
            System.out.println("All numbers are even.");
        }else if(z == 10){
            System.out.println("All numbers are odd.");
        }else{

            System.out.println("___________________________________________________\n");
            System.out.println("Even Numbers ");
            System.out.print("List: ");

            for(int k = 0; k < y; k++){ 
                System.out.print(my2DArray[1][k] + " ");
            }
            System.out.println();
            System.out.println("Count: " + y);

            System.out.println("___________________________________________________\n");
            System.out.println("Odd Numbers ");
            System.out.print("List: ");

            for(int l = 0; l < z; l++){       
                System.out.print(my2DArray[2][l] + " ");
            }
            System.out.println();
            System.out.println("Count: " + z);

        }

    }
}
