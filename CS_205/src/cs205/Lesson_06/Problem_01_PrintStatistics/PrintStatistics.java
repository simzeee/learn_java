package cs205.Lesson_06.Problem_01_PrintStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class PrintStatistics {

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int nums[];
        int count;

        // Step 0: Input array values
        count = scnr.nextInt();
        nums = new int[count];
        for (int i = 0; i < count; ++i) {
            nums[i] = scnr.nextInt();
        }

        // Step 1: Find and output minimum and maximum values
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Step 2: Calculate and output mean
        /* Type your code here */
        double mean = 0;
        for (int num : nums) {
            mean = mean + num;
        }
        mean = mean / nums.length;
        System.out.printf("Mean: %.1f\n", mean);

        // Step 3: Check if palindrome
        int j = nums.length - 1;
        boolean isPal = false;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == nums[j]) {
                // System.out.print(j);
                // System.out.print(nums[j]);
                j = j - 1;
                isPal = true;
                if (i == j) {
                    break;
                }
            } else {
                isPal = false;
                break;
            }
        }
        if (isPal) {
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Palindrome: false");
        }
        // Sort array elements in ascending order
        Arrays.sort(nums);

        // Step 4: Find and output median
        double median = 0;
        if (nums.length % 2 != 0) {
            // 2 2 2 3 3 4 5 
            median = nums[nums.length / 2];
        } else {
            // Otherwise, the median is the average of the middle two values.
            // 2 2 2 3 3 4
            double firstMiddle = nums[nums.length / 2];
            double secondMiddle = nums[nums.length / 2 - 1];
            median = (firstMiddle + secondMiddle) / 2;
        }
        System.out.printf("Median: %.1f\n", median);

        // Step 5: Find and output mode
        /* Type your code here */
        int modeCount = 0;
        int countCompare = 0;
        int mode = nums[0];
        int current = nums[0];
        // 1 1 2 2 2 3 3 
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == current) {
                if (nums[i] == mode) {
                    modeCount = modeCount + 1;
                }
                countCompare = countCompare + 1;
                if (countCompare > modeCount) {
                    mode = nums[i];
                    modeCount = modeCount + 1;
                }
            } else {
                countCompare = 1;
                current = nums[i];
            }
        }
        System.out.println("Mode: " + mode);

    }
}
