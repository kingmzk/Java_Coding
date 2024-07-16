class swap_num {

//with using 3 rd variable
    public static void main(String[] args) {
        int a = 400;
        int b = 100;
        int c;

        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

        //without using 3rd variable

        int e = 4 ;
        int d = 5;

        e = e + d;
        d = e - d;
        e = e - d;

        System.out.println(e);
        System.out.println(d);
    }
}