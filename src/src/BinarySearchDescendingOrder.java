// BINARY SEARCH (Alternative)
// In this we try to solve a problem where in the array is sorted in descending order.
// Binary search is fast.


public class BinarySearchDescendingOrder {
    public static void main(String[] args){

        System.out.println(binarySearch(new int[]{5,4,3,2,1},2));   // we call the method and pass arguments to the method, and print out the result.
    }

    // this method is created to perform the binary search on an array in descending order.
    public static int binarySearch(int[] array, int target){
        int start = 0;          // one pointer at the starting index of the array
        int end = array.length -1;  // another pointer at the last index of the array
        while(start <= end){            // the while loop will continue till the start pointer is at a lower or equal index to the end pointer. once they cross each other, the loop fails.
            int mid = start + (end- start)/2;       // find the mid-element using the formula.
            if(array[mid] == target){           // if the array element at middle index is equal to the target,
                return mid;                     // then we return the middle index.
            }else if(array[mid] < target){      // if not then we check if the array[mid] value is less than the target value.
                end = mid -1;                   // then in descending order array, the element greater than the mid will lie in the first half of the array.
                                                // and therefore, we move the end pointer to the index mid -1
            }else{                              // if not that then the array[mid] value is greater than the target value, and in descending order array, we will find it in the right half of the array.
                start = mid + 1;                // so we move the start pointer to the index mid + 1;
            }
        }
        return -1;              // if the element is not found then we return -1;
    }
}
