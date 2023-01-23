package dsp;
import java.util.HashMap;
import java.util.Scanner;


public class Restarent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int maxDishes = 0;
        for (int key : map.keySet()) {
            int value = map.get(key);
            int dishes = value;
            while (value >= 2) {
                dishes += value / 2;
                value = value / 2;
            }
            maxDishes = Math.max(maxDishes, dishes);
        }
        System.out.println(maxDishes);
    }
}
// solution is wrong
/**
Problem statement: Your friend knows that there are exactly N dishes in the restaurant. The type of the dishes is described by an array Arr. This means that if two elements of array have the same value, then they are from the same type. Your friend wants to eat as many dishes as possible. However, your friend will never der more than one serving of a particular dish. It is given that the restaurant will not let you order the dishes of the same type more than once. Moreover, if you order A dishes in the restaurant your next order must contain (2A) dishes. It is also given that the restaurant does not accept orders containing more than one type of dishes in the same order. Your friend can start eating with any number of dishes. Find the maximum number of dishes that your friend can eat. 
input format: The first line contains an integer, N, denoting the number of elements in array Each line i of the N subsequent lines (where 0 < i<N) contains an integer descending array[i].
sample input 1: 5 1 2 4 2 3
expected output 1:3
explanation 1: N=5 array=[1,2,4,2,3] For example, start with type 1 or 4, then double the amount by eating two of type 2 dishes.
sample input 2: 7 2 2 1 1 1 1 1
expected output: 6
explanation 2: N=7 array=[2,2,1,1,1,1,1] Start with eating two dishes of type 2, then eat four dishes of type 1. Note that you can't start with one dish of type one, then two dishes of type 2, and get back to eat to a dish of size 1 again, your friend cannot eat the same type of dishes multiple times.
*/