/* Program that takes an array and Find Second largest element in an array */
import java.util.Scanner;

public class SecondLargest {
    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args){
        int n, max;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second Largest: "+getSecondLargest(arr,n));
    }
}
