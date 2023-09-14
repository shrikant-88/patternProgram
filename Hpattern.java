import java.util.Scanner;

public class Hpattern {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter no of rows : ");
            int n = scan.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(n%2==0){
                        if(j==1||j==n||i==n/2){
                            System.out.print(" * ");
                        }
                        else{
                            System.out.print("   ");
                        }
                        }
                        else{
                            if(j==1||j==n||i==(n+1)/2){
                                System.out.print(" * ");
                            }
                            else{
                                System.out.print("   ");
                            }
                        }
                    }
                    System.out.println();
                }
        }
        }
    }

