package com.tav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = { -43, -21, -12, 30, 41, 43, 61, 64, 87, 900, 4000, 10020, 70000, 80000, 100000 };
        int target = new Scanner(System.in).nextInt();
        int leftLimit = 0;
        int rightLimit = arr.length - 1;
        int mid;
        while (leftLimit <= rightLimit) {
            mid = (leftLimit + rightLimit) / 2;
            if (target < arr[mid]) {
                rightLimit = mid - 1;
            } else if (target > arr[mid]) {
                leftLimit = mid + 1;
            } else {
                System.out.println("The target was found at index: " + mid);
                return;
            }
        }
        System.out.println("Couldn't find " + target);
    }
}
