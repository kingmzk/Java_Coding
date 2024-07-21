public class CountCharacterOccurance {
    public static void main(String[] args) {
//        String str = "  Geek for Geeks  ";
//        String cha = String.valueOf('s');
//        String word = str.replaceAll("\\s","");
//        int len = word.length();
//        String answer =  word.replaceAll(cha,"");
//        int len1 = answer.length();
//        int ans = len-len1;
//        System.out.println("the number of times the character "+ cha +" is "+ ans +" times");


        String s = "Geek for Geeks";
        char c = 'e';
        int characterOccurence = s.length() - (new String(s)).replace(c + "", "").length();
        System.out.println(characterOccurence);
    }
}
