import java.util.*;
public class Apattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(i==(n/2+1)||j==1&&i>1||i==1&&j>1&&j<m||j==m&&i>1){
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
