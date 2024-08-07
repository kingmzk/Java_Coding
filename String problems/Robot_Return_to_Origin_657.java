import java.util.ArrayList;

public class Robot_Return_to_Origin_657 {
    public static boolean judgeCircle(String moves){
        /*
        ArrayList<Character> list = new ArrayList<>();
        int len = moves.length() - 1;
        int i = 0;
        while( i <= len ){
            char current = moves.charAt(i);
            if(current == 'U' && list.contains('D')){
                list.remove((Character)'D');
            }
            else if(current == 'D' && list.contains('U')){
                list.remove((Character)'U');
            }
            else if(current == 'L' && list.contains('R')){
                list.remove((Character)'R');
            }
            else if(current == 'R' && list.contains('L')){
                list.remove((Character)'L');
            }
            else{
                list.add(current);
            }
            i++;
        }
        return list.isEmpty();
        */

        /*
        int len = moves.length() - 1;
        int i = 0;
        int left = 0, up = 0;
        while( i <= len ){
            if(moves.charAt(i) == 'U') up++;
            else if(moves.charAt(i) == 'D') up--;
            else if(moves.charAt(i) == 'L') left++;
            else if (moves.charAt(i) == 'R') left--;
            i++;
        }
        return (left == 0 && up == 0);
        */


        char[] ch = moves.toCharArray();
        int len = ch.length;
        int left = 0, up = 0;
        for(int i = 0; i < len; i++){
            switch(ch[i]){
                case 'L' : left++; break;
                case 'R' : left--; break;
                case 'U' : up++; break;
                case 'D' : up--; break;
            }
        }
        return (left == 0 && up == 0 );


    }
    public static void main(String[] args) {
        String s = "UDLR";
        System.out.print(judgeCircle(s));
    }
}
