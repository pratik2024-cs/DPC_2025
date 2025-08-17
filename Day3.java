public class FindDuplicate {

    public int findDuplicate(int[] arr) {
        // Find the intersection point of the two pointers
        int a = arr[0];
        int b = arr[0];
        
        do {
            a = arr[a];
            b = arr[arr[b]];
        } while (a != b);
        
        //  Find the entry point of the cycle
        int ptr1 = arr[0];
        int ptr2 = a;
        
        while (ptr1 != ptr2) {
            ptr1 = arr[ptr1];
            ptr2 = arr[ptr2];
        }
        
        return ptr1;
    }
    
    public static void main(String[] args) {
        FindDuplicate solution = new FindDuplicate();
        int[] arr = {3, 1, 3, 4, 2};
        int duplicate = solution.findDuplicate(arr);
        System.out.println("The duplicate number is: " + duplicate); // Output: 3
    }
}
