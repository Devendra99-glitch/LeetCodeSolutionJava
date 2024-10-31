package BinarySearch704;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args){


        int[] newArray = {2,5,7,11,46,75};
        int[] newArray2 = {99,82,65,32,12,1};
        System.out.println(binarySearchOrderAgnostic(newArray, 46));
        System.out.println(binarySearchOrderAgnostic(newArray2,32));
    }

    // this method is created to check whether the array is ordered in ascending or descending order.
    public static int binarySearchOrderAgnostic(int[] array, int target){
        int start = 0;                  // initialize start at 0 index.
        int end = array.length -1;      // initialize end at last index of array
        if(array[start] <= array[end]){     // check if element at starting index of array is less than or equal to the last element of the array.
            int element = binarySearch(array, target);  // if that is true, that means the array is sorted in ascending order. and we call the binary search for ascending order.
            return element;     // anD return the element (index number) returned from the method call.
        }else{                  // else the array is sorted in descending order
            int element = binarySearchDescending(array, target);    // we call the binary search for descending order.
            return element;                 // and return the index number as element that was returned from the method call.
        }

    }

    // method for binary search for array sorted in ascending order.
    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        while(start <=end){
            int mid = start + (end - start) /2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // method for binary search for array sorted in descending order.
    public static int binarySearchDescending(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
