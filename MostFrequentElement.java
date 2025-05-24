import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};
        findMostFrequent(arr);
    }

    public static void findMostFrequent(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            if (freqMap.get(num) > maxCount) {
                maxCount = freqMap.get(num);
                mostFrequent = num;
            }
        }

        System.out.println("Most frequent element: " + mostFrequent + " (appears " + maxCount + " times)");
    }
}
