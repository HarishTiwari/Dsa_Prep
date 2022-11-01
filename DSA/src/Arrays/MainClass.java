package Arrays;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 7 , 7};
        int key = 4;

        SecondLargest secLar = new SecondLargest();
        System.out.println("Second Largest element is " + secLar.findSecondLargestEfficient(arr));

//        ClosestNumber cNum = new ClosestNumber();
//        System.out.println(cNum.findClosestEfficient(arr,key));

//        FirstAndLastOccurenceOfX fAndLast = new FirstAndLastOccurenceOfX();
//
////        ArrayList<Long> result = fAndLast.firstAndLastOccurence(arr, key);
//        ArrayList<Long> result = fAndLast.firstAndLastOccurenceUsingBinarySearch(arr, key);
//        for (Long x : result)
//            System.out.print(x + " ");


//       BinarySearch binarySearch = new BinarySearch();
//
//        if(binarySearch.binarySearchUsingIterationMethod(arr , key)){
//            System.out.println("Element Found");
//        }else {
//            System.out.println("Element not found");
//        }
//        if(binarySearch.binarySearchUsingRecursion(arr , key)){
//            System.out.println("Element Found");
//        }else {
//            System.out.println("Element not found");
//        }


//        JumpArray jump = new JumpArray(arr,arr.length);
//        int ans = jump.minJumps();

//        FindDuplicate find = new FindDuplicate(arr,arr.length);
//        int ans = find.findDuplicateNumber();

//        SubarrayWithSum0 zeroSum = new SubarrayWithSum0(arr , arr.length);
//
//        boolean ans = zeroSum.findSum();

//        NextPermutation next = new NextPermutation(arr);
//        next.nextPermutation();
//
//        for(int x : arr)
//            System.out.println(x + " ");


//        System.out.println(ans);
    }


}
