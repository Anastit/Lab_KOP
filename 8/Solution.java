package com.company;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    /*
     * ÐÐ°Ð½Ð¾: n - ÐºÐ¾Ð»Ð¸ÑÐµÑÑÐ²Ð¾ ÑÐ¸ÑÐµÐ» Ð² Ð¼Ð°ÑÑÐ¸Ð²Ðµ
     *		ar - Ð¼Ð°ÑÑÐ¸Ð² ÑÐ¸ÑÐµÐ»
     * 		0 < n < 100
     *		-100 <= ar[i] <= 100
     * ÐÑÑÐ¸ÑÐ»Ð¸ÑÑ Ð½Ð¾ÑÐ¼Ð°Ð»Ð¸Ð·Ð¾Ð²Ð°Ð½Ð½Ð¾Ðµ ÐºÐ¾Ð»Ð¸ÑÐµÑÑÐ²Ð¾ Ð¿Ð¾Ð»Ð¾Ð¶Ð¸ÑÐµÐ»ÑÐ½ÑÑ, Ð¾ÑÑÐ¸ÑÐ°ÑÐµÐ»ÑÐ½ÑÑ Ð¸ Ð½ÑÐ»ÐµÐ²ÑÑ ÑÐ»ÐµÐ¼ÐµÐ½ÑÐ¾Ð²
     * ÐÑÐ¸Ð¼ÐµÑ:
     *	6
     *	-4 3 -9 0 4 1
     *
     *	Output
     *	0.500000
     *	0.333333
     *	0.166667
     */
        static void func1(int[] arr) {
            int q = 0;
            int p = 0;
            int z = 0;
       for (int i = 0;i < arr.length; i++){
           if (arr[i]>0)
               q++;
           else if (arr[i]<0)
               p++;
           else
               z++;
       }
            System.out.println((float) q/arr.length);
            System.out.println((float) p/arr.length);
            System.out.println((float) z/arr.length);


        }

		 public static void main(String[] args) {
        System.out.println("Enter kol-vo n:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        System.out.println("Enter element mass:");
        String[] arrItems = scanner.nextLine().split(" ");
        System.out.println("Press Enter");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();


             func1(arr);


    }

       
   
    }


