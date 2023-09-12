package com.ClassRoom.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr={1,2,14,58,96,32,45,78};
        System.out.println("Max value:"+max(arr));
        System.out.println("Max value in Range:"+maxRange(arr,1,5));
    }

    public static int maxRange(int[] arr,int start,int end){
        if (end>start){
            return -1;
        }

        if (arr==null){
            return -1;
        }

        int max=arr[start];
        for (int i=start;i<=end;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int max(int[] arr){
        if (arr.length==0){
            return -1;
        }

        int maxVal=arr[0];
        for (int i=1;i<arr.length;i++){
            if(maxVal<arr[i]){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
