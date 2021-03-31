/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author FlameWarlock
 */

import java.util.Scanner;

public class JavaApplication1 {

    public static void nhap(int[] a, int i, int n) {
        Scanner sc = new Scanner(System.in);
        if (i >= n) {
            return;
        }
        System.out.println("Nhập phần tử thứ " + i + " :");
        a[i] = sc.nextInt();
        nhap(a, i + 1, n);
    }

    public static void in(int[] a, int i, int n) {
        if (i >= n) {
            return;
        }
        System.out.print(a[i] + " ");
        in(a, i + 1, n);
    }

    public static int tong(int[] a, int i, int n, int sum) {
        if (i >= n) {
            return sum;
        }
        return tong(a, i + 1, n, sum + a[i]);
    }

    public static int tich(int[] a, int i, int n, int mul) {
        if (i >= n) {
            return mul;
        }
        return tich(a, i + 1, n, mul * a[i]);
    }

    public static int max(int[] a, int i, int n, int max) {
        if (i >= n) {
            return max;
        }
        if (a[i] > max) {
            return max(a, i + 1, n, a[i]);
        }
        return max(a, i + 1, n, max);
    }

    public static int min(int[] a, int i, int n, int min) {
        if (i >= n) {
            return min;
        }
        if (a[i] < min) {
            return min(a, i + 1, n, a[i]);
        }
        return min(a, i + 1, n, min);
    }
   
    public static float min(float[] a, int i, int n, float min){
        if (i >= n) {
            return min;
        }
        if (a[i] < min) {
            return min(a, i + 1, n, a[i]);
        }
        return min(a, i + 1, n, min);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int n;
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        nhap(a, 0, n);
        System.out.println("Dãy số: ");
        in(a, 0, n);
        System.out.println();
        System.out.println("Tổng: " + tong(a, 0, n, 0));
        System.out.println("Tích: " + tich(a, 0, n, 1));
        System.out.println("Max: " + max(a, 0, n, a[0]));
        System.out.println("Min: " + min(a, 0, n, a[0]));
    }
    
}
