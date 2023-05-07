package com.learnJava.interview;

public class FindValue {

    public static void main(String[] args){
        int arr[] = {1, 2, 4, 11, 6, 7};
        int k = 2;
        int n = arr.length;
        System.out.println(findValue(arr,n,k));
    }

    static int findValue(int arr[], int n, int k){
        for (int i =0; i <n ; i++)
            if(arr[i] == k)
                k *= 2;
        return k;
  }
}
