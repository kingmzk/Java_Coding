import java.util.HashSet;

public class duplicate 
{
    public static void main(String[] args) {
        int a[] = {24,3,4,546,542,343,42,34,3,423,4324324,324,324,443,243,43,24,3,43,4,54,65365};

        HashSet<Integer> hs = new HashSet<>();
        for(int as : a)
        {
            if(hs.add(as) == false)
            {
                System.out.println("no is " + as);
            }
        }
    }
    
}
