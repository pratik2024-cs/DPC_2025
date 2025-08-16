public class MissingOneNumber {
    public static int findMissingNum(int[] arr) {
        int n = arr.length + 1; // total numbers
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissingNum(arr)); 
    }
}
