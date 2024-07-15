class binarysort {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 55, 60, 70, 80, 90, 100 };

        int li = 0;
        int hi = a.length - 1;
        int sea = 10;

        int mi = (li + hi) / 2;

        while (li <= hi) {
            if (a[mi] == sea) {
                System.out.println("it is located at " + mi + " index position");
                break;
            } else if (a[mi] < sea) {
                li = mi + 1;
            } else if(a[mi]>sea){
                hi = mi - 1;
            }
            mi = (li+hi)/2;
        }

        if(li>hi)
        {
            System.out.println("it is not there or it is not sorted");
        }

    }
}