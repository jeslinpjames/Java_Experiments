/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SORT;

/**
 *
 * @author jeslin
 */
public class sort {
    public void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void selectionSOrt(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j])
                    min =j;
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public void BubbleSort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }public void InsersionSort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j= i-1;
            while(temp<arr[j]&& j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public void mergeSort(int arr[]){
        int n = arr.length;
        if(n<=1){
            return;
        }
        int middle = n/2;
        int larr[] = new int [middle];
        int rarr[] = new int [n-middle];
        int k=0,l=0;
        for(int i=0;i<n;i++){
            if(i<middle){
                larr[k++]=arr[i];
            }
            else
                rarr[l++]= arr[i];
        }
        mergeSort(larr);
        mergeSort(rarr);
        merge(larr, rarr, arr);
    }
    public void merge(int larr[], int[] rarr,int [] arr){
    int ls= larr.length;
    int rs =rarr.length;
    int i=0,j=0,k=0;
    while(i<ls&&j<rs){
        if(larr[i]<rarr[j]){
            arr[k++]=larr[i++];
        }
        else
            arr[k++]=rarr[j++];        
        }
        while(i<ls){
            arr[k++]=larr[i++];
        }
        while(j<rs){
            arr[k++]=rarr[j++];
        }
    }
    public void QuickSort(int arr[],int start,int end){
        if(end<start)
            return;
        int piv =partition(arr,start,end);
        QuickSort(arr, start, piv-1);
        QuickSort(arr, piv+1, end);       
    }
    public int partition(int arr[],int start,int end){
        int piv =arr[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if(arr[j]<piv){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[end];
            arr[end] = temp;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr [] ={99,78,69,96,11,35,86,66,77,44,55,39};
        sort ob = new sort();
        ob.print(arr);
        ob.selectionSOrt(arr);
        ob.print(arr);
        int arr1 [] ={99,78,69,96,11,35,86,66,77,44,55,39};
        ob.BubbleSort(arr1);
        ob.print(arr1);
        int arr2 [] ={99,78,69,96,11,35,86,66,77,44,55,39};
//        ob.InsersionSort(arr2);
//        ob.print(arr2);
        int arr3 [] ={99,78,69,96,11,35,86,66,77,44,55,39};
        ob.QuickSort(arr3,0,arr3.length-1);
        ob.print(arr3);
    }
}
