import java.util.Scanner;
public class Lpattern {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("enter no. of rows :  ");
            int n = scan.nextInt();
            System.out.print("enter no. of column :  ");
            int m = scan.nextInt();
            for(int i = 1;i<=n;i++){
              for(int j = 1; j<=m;j++){
                if(j==1||i==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
              }
              System.out.println();
            }
        }
        
        
    }
}
