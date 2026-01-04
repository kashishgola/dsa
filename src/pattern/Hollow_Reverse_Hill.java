package pattern;

public class Hollow_Reverse_Hill {
    public static void main(String[] args){
        int n = 5;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("  ");
        }
        for(int k = i; k < n; k++){
            if(k == i || i == 1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

        }
        for(int l = i; l <= n; l++){
            if(l == n || i == 1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

        }
        System.out.println();
    }
  }
 }

