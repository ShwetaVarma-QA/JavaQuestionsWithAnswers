package org.example.difficultQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CodilityDemoSolution {
    /*
        This is a demo task.
    Write a function:
    class Solution { public int solution(int[] A); }
    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    [1,2,3,4,6]
    Given A = [1, 2, 3], the function should return 4.
    Given A = [−1, −3], the function should return 1.
    Write an efficient algorithm for the following assumptions:
    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].
    {-1, -3, -8}
    {1, 2, 3}
    {-1, 0, 1,2, 3, 4, 5,6}
    {0}
    {-5, -4, -9, -100, 0, 1 , 1,2, 3, 4, 5,6, 10, 1000}
    0, 0, 0, 0
    -10, 10, 11, 15
    -10, 10
    -1, 0, 11,-1,-2, -3, -5,-6
    -1, 0, 2, 3

        *
        */
    public static void main(String[] args) {
        int[] ints = {-1000000, 1000000};
        System.out.println(solution(ints));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int solution = 1;
        if (A.length>0){
        if (A[0]>0){
            solution=A[0];
        }
        for (int i=0;i<A.length;i++){
            if (A[i]>=1){
                if (solution == A[i]) {
                    solution = A[i];
                    solution++;
                }
            }
        }}
        else {}
        return solution;
    }
}

