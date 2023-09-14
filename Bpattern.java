import java.util.Scanner;

public class Bpattern {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter rows");
        int n = scan.nextInt();
        System.out.print("enter column");
        int m = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==1&&j<m||i==n&&j<m||i==n/2+1&&j<m||j==m&&i>1&&i<n/2+1||j==m&&i>n/2+1&&i<n){

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
