public class ReverseWord {
    public static void main(String[] args) {
        String input = "Bharath";
        String reversed = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        System.out.println("Reverse String: " + reversed);
    }
}
