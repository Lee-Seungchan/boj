import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0; // 개수
        int n = 0; // 행 수
        
        while(true) {
            n++;
            cnt += n;
            if(cnt >= a) {
                if(n%2==0) {
                    System.out.println(a-cnt+n+"/"+(cnt-a+1));
                    }
                else {
                    System.out.println((cnt-a+1)+"/"+(a-cnt+n));
                    }
                break;
                }
            }
        }
    }