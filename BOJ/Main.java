package BOJ;

import java.util.*;
// 백준 11단계 - 브루트포스 - 블랙잭(2798번) -실패

//첫째 줄에 카드의 개수 N(3<= N <= 100)과 M(10<= M <= 300,000)
//둘째 줄에는 카드에 쓰여있는 수 < 100, 000
//합이 M을 넘지 않은 카드 3장을 찾을 수 있는 경우만 입력 

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];

        

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            int c1, c2, c3 = 0;
            int sum = 0;
            int result = 0;

            for(int i =0; i <n-2; i++) {
                c1 = a[i];

                if(c1 > m) {
                    continue;
                }

                for(int j= i+1; j< n-1; j++) {
                    c2 = a[j];
    
                    if(c2 > m) {
                        continue;
                    }

                    
                for (int k = i+1; k < n-2; k++) {
                    c3 = a[k];

                    sum = c1 + c2 + c3;

                    if(sum == m) {
                        result = sum;
                        break;
                    }

                    if(sum < m && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    
    }
}
    