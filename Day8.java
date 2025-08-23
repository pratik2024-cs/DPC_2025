public class ReverseWords {
    public static String reverseWords(String s) {
        // Remove extra spaces at the start and end
        s = s.trim();
        
        // Split by one or more spaces
        String[] words = s.split("\\s+");
        
        // Build the reversed string
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i > 0) {
                result += " ";
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String input = "the sky is blue";
        String output = reverseWords(input);
        System.out.println(output); // Output: "blue is sky the"
    }
}
