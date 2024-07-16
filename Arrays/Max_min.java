class Max_min {
    public static void main(String[] args) {

        int[] n = { 3, 4, 5, 6, 2, 7, 100, 24, 50, 50, };
        int max = n[0];
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
            if (min > n[i]) {
                min = n[i];
            }
        }
        System.out.println("biggest number in an array is " + max);
        System.out.println("Smallest number in an array is " + min);
    }
}