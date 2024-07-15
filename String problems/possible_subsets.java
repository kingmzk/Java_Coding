package spring_Pract;

public class possible_subsets
{
    public static void main(String[] args)
    {
        String s = "khan";
        int n = s.length();
        int temp = 0;

        String[] st = new String[n*(n+1)/2];

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                st[temp] = s.substring(i , j+1);
                temp++;
            }
        }

        System.out.println("total number of possibe subsets are  ");

        for(int k = 0;k<st.length;k++)
        {
            System.out.println(st[k]);
        }

    }
}
