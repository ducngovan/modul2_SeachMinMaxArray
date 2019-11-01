package com.codegym;

import sun.security.jgss.GSSCaller;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckArray checkArray = new CheckArray();
        checkArray.getData();
        checkArray.getResult();
    }
}
class CheckArray{
    private Integer[] arr = new Integer[5];
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("nhap phan t thu "+i);
            arr[i] = scanner.nextInt();
//          System.out.println(arr[i]);
        }
        for(int j : arr){
            System.out.print("[ "+j+" ]");
        }

    }
    public void getResult(){
        int max = (int) Collections.max(Arrays.asList(arr));
        int min = (int) Collections.min(Arrays.asList(arr));
        System.out.println();
        System.out.println("so lon nhat la "+max);
        System.out.println("so nho nhat la "+min);
    }

}