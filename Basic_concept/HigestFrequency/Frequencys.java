package HigestFrequency;


import java.util.Collection;
import java.util.HashMap;

public class Frequencys {
    
    // Creating the method to find the highest frequency
    public static int freuency(int[] arr) {
        
        // Using HashMap to store frequencies
        HashMap<Integer, Integer> fre = new HashMap<>(); 
        
        // Set/update the values in the HashMap
        for (int i = 0; i < arr.length; i++) {
            if (fre.containsKey(arr[i])) {
                fre.put(arr[i], fre.get(arr[i]) + 1); // ✅ corrected this line
            } else {
                fre.put(arr[i], 1);
            }
        }

        // Optional: print frequency map
        System.out.println("Frequencies:");
        for (Integer key : fre.keySet()) {
            System.out.println("Element " + key + " -> Frequency: " + fre.get(key));
        }
        
        // Now find the maximum frequency
        int maxFreq = 0;
        int mostFrequentElement = -1;

        for (Integer key : fre.keySet()) {
            if (fre.get(key) > maxFreq) {
                maxFreq = fre.get(key);
                mostFrequentElement = key;
            }
        }

        System.out.println("Most frequent element: " + mostFrequentElement + " with frequency: " + maxFreq);
        return mostFrequentElement;
    }

    // Main method
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 8, 6, 5, 4, 3, 2, 3, 4, 5, 6, 7, 8, 9, 78, 6, 5, 4, 4, 5, 6, 78, 8, 89, 7, 6, 4, 3, 2, 5, 6, 7, 8, 9};
        
        freuency(arr);
    }
}

