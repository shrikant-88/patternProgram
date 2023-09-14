import java.util.Scanner;

public class square_star {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("enter no of rows : ");
            int rows = scan.nextInt();
            System.out.print("enter no of column : ");
            int column = scan.nextInt();
            for(int i = 1; i<=rows ; i++){
                for(int j = 1; j<=column;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
