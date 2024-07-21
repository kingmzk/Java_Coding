public class CountTheWords {
    public static void main(String[] args) {
        String str = " Geek for Geeks coding ninja ";
        String[] words = str.trim().split(" ");
        System.out.println("the number of words are " + words.length);
    }
}
