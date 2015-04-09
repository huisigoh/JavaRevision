/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HuiSiGoh
 */
public class SortingAlgorithms {

    int[] testArray = new int[]{10000, 1002, 83, 12, 58, 72, 66, 65, 75648, 90, 23, 37, 41, 66, 0, 3100, 55555, 1, 67};
    int[] testArray1 = new int[]{10,9,8,7,6,5,4,3,2,1};
    
    public SortingAlgorithms() {
//        InsertionSort(testArray);
//        SelectionSort(testArray);
//        MergeSort(testArray);
        HeapSort(testArray);
    }
    
    public void PrintBefore(String name, int[] nums)
    {
        System.out.print(name + " Before  : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
    }
    
    public void PrintAfter(String name, int[] nums)
    {
        System.out.print(name + " After   : ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
    }

    public int[] InsertionSort(int[] nums) {

        PrintBefore("InsertionSort", nums);

        int temp = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        PrintAfter("InsertionSort", nums);

        return nums;
    }

    public int[] SelectionSort(int[] nums)
    {
        PrintBefore("SelectionSort", nums);
        
        int temp = 0;
        
        for(int i = 0; i < nums.length-1; i ++)
        {
            int min = i;
            
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[j] < nums[min])
                {
                    min = j;
                }
            }
            
            if(i != min)
            {
                temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        
        PrintAfter("SelectionSort", nums);
        
        return nums;
    }
    
    public int[] MergeSort(int[] nums)
    {
        PrintBefore("MergeSort", nums);
        
        int[] temp = new int[nums.length]; 
        
        MergeSort_Split(nums, temp, 0, nums.length);
        
        PrintAfter("MergeSort", nums);
        
        return nums;
    }
    
    public void MergeSort_Split(int[] A, int[] B, int start, int end)
    {
        if(end-start < 2) return;
        
        int mid = (end + start)/2;
        
        MergeSort_Split(A, B, start, mid);
        MergeSort_Split(A, B, mid, end);
        MergeSort_Merge(A, B, start, mid, end);
        //System.out.println(start + "    " + mid + "    " + end);
        MergeSort_CopyArray(A, B, start, end);
    }
    
    public void MergeSort_Merge(int[] A, int[] B, int start, int mid, int end)
    {
        int blk0 = start;
        int blk1 = mid;

        for(int i = start; i < end; i++)
        {
            if(blk0 < mid && (blk1 >= end || A[blk0] <= A[blk1]))
            {
                B[i] = A[blk0];
                ++blk0;
            }
            else
            {
                B[i] = A[blk1];
                ++blk1;
            }
        } 
    }
    
    public void MergeSort_CopyArray(int[] A, int[] B, int start, int end)
    {
        for(int i = start; i < end; i++)
        {
            A[i] = B[i];
        }
    }
    
    public int[] HeapSort(int[] nums)
    {
        PrintBefore("HeapSort", nums);
        
        int length = nums.length;
        
        int parentPtr = (length-2)/2; //This retrieves the index of last parent
        
        int end = length-1;
        int temp = 0;
        
        while(parentPtr >= 0)
        {
            SiftDown(nums, parentPtr, length-1); 
            --parentPtr;
        }

        while(end > 0)
        {
            temp = nums[0];
            nums[0] = nums[end];
            nums[end] = temp;
            
            end -= 1;
            
            SiftDown(nums, 0, end); 
        }
        
        PrintAfter("HeapSort", nums);
        
        return nums;
    }
    
    /**
     * note that parameter end is just used to check if left/right child 
     * exists within array limits
     */
    public void SiftDown(int[] nums, int start, int end)
    {
        int root = start;
        
        while(root*2+1 <= end)
        {
            int child = root*2+1; //left child
            int swap = root; 

            int temp = 0;

            if(nums[swap] < nums[child])    //compare root with left child
            {
                swap = child;
            }

            if(child+1 <= end && nums[swap] < nums[child+1])  //compare root with right child
            {
                swap = child+1;
            }

            if(swap == root) 
                return;
            else
            {
                temp  = nums[root];
                nums[root] = nums[swap];
                nums[swap] = temp;
            }   root = swap;
        }
    }
    
//    public int[] QuickSort(int[] nums)
//    {
//        
//    }
//    
//    public int[] BubbleSort(int[] nums)
//    {
//        
//    }
//    
//    public int[] ShellSort(int[] nums)
//    {
//        
//    }
//    
//    public int[] CombSort(int[] nums)
//    {
//        
//    }
//    
//    public int[] CountingSort(int[] nums)
//    {
//        
//    }
//    public int[] BucketSort(int[] nums)
//    {
//        
//    }
//    
//    public int[] RadixSort(int[] nums)
//    {
//        
//    }
}
