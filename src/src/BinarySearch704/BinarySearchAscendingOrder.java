package BinarySearch704;// 704. BINARY SEARCH
// The data structure should always be sorted for binary search to work.
// Binary search is fast.
// This is a binary search problem when the array is already sorted.

public class BinarySearchAscendingOrder {
    public static void main(String[] args){

        System.out.println(binarySearch(new int[]{1,2,3,4,5},3)); // we simply call the method of binary search in a print statement to print the index of the target.
    }

    // This method is created to perform binary search on the passed array to find the target value in O(logn)
    private static int binarySearch(int[] array, int target) {
        int start = 0;                          // create a pointer variable for start index
        int end = array.length - 1;             // create another pointer variable for end index.
        while(start <= end){                    // now while the start is less than end, the loop shall run.
                                                // for edge case where the array has only one element, we use start <= end
            int mid = start + (end - start)/2;  // we calculate the mid and to prevent integer overflow, we use this formula.
                                                // this is because, if say the highest possible integer is 100 and the start and end point to the same integer value 100,
                                                // then by simple doing start + end / 2 will result in overflow.
                                                // so we simply add and subtract start from the formula of Start + end / 2. and on simplification we get this start + (end - start) /2;
            if(array[mid] == target){           // now that we have the mid-value with us, we can check whether the array middle element is what we are looking for.
                return mid;                     // if array[mid] == target value then we return mid (index value)
            }else if(array[mid] < target){      // if not that case, then we check if array[mid] value is less than target value.
                start = mid + 1;                // if that is the case, then we will find the number on the right hand side of the mid-element and hence we move the start pointer to mid + 1 index
            }else{                              // if that is also not the case, then we check if array[mid] > target value,
                end = mid -1;                   // if that is true, then we move the end pointer to mid -1, as we will find the number on the left side of the array.
            }
        }
        return -1;                              // if the element is not found then we return -1
    }
}
