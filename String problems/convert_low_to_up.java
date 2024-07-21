public class convert_low_to_up
{
    public static void main(String[] args)
    {
        String S = "welcome to orchard";
        S =  S.replaceAll("\\s" , " ");
        System.out.println(S);

        StringBuffer Sb = new StringBuffer(S);

        for(int i = 0 ; i<S.length() ; i++)
        if(Character.isLowerCase(S.charAt(i)))
        {
            Sb.setCharAt(i, Character.toUpperCase(S.charAt(i)));
        }
        else if(Character.isUpperCase(S.charAt(i)))
        {
              Sb.setCharAt( i , Character.toLowerCase(S.charAt(i)));
        }

        System.out.println("String after conversion is : " + Sb);

        /*

        s.toString();

          StringBuilder sb = new StringBuilder();
       for(char c : s.toCharArray()){
            if(c >= 65 && c <=90){
                c = (char) (c + 32);
            }
            sb.append(c);
       }
       return sb.toString();


         char[] ch = s.toCharArray();
      for(int i = 0; i<ch.length; i++){
        if(ch[i] >=65 && ch[i] <= 90){
            ch[i] = (char) (ch[i] + 32);
        }
      }
      return String.valueOf(ch);
         */

    }
}
