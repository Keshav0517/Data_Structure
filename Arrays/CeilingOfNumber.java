package com.ClassRoom.Arrays;

public class CeilingOfNumber {
    //Ceiling=Smallest no greater or equal to target
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int res=ceilingOfNumber(arr,target);
        System.out.println("Ceiling of a given number at index:"+res);


    }

    public static int ceilingOfNumber(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        if (target > arr[end]){
            return -1;
        }

        while (start <= end){
            int mid=start+(end-start)/2;
            if (target >arr[mid]){
                start=mid+1;
            }
            else if (target < arr[mid]){
                end=mid-1;
            }
            else
                return mid;
        }
        return start;           //Ceiling value start:-index value,arr[start]:-actual value
    }
}