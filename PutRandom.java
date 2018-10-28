import java.util.Random;

public class PutRandom {
    public static void main(String[] args) {
        int[] a = new int[7];
        int i = 0;
        int k = 0;
        int tag = 0;
        Random ran = new Random();
        for (int x = 0; x < a.length; x++) {
            int s = ran.nextInt(33) + 1;
            a[x] = s;
        }
        while (true) {
            for (i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        a[j] = ran.nextInt(33) + 1;
                        i = 0;
                        j = 0;
                    }
                }
            }
            break;
        }
        for (int y = 0; y < a.length; y++) {
            System.out.print(a[y] + "  ");
        }
    }
}


/*

import java.util.Arrays;
import java.util.Random;

public class PutRandom {
    public static void main(String[] args) {
        int arr[] = new int[7];
        int i = 0;
        while (i < 7) {
            int flag = 0;
            Random r = new Random();
            int x = r.nextInt(33) + 1;
            for (int j = 0; j <= i; j++) {
                if (arr[j] == x) {
                    flag++;
                }
            }
            if (flag == 0) {
                arr[i] = x;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
*/
