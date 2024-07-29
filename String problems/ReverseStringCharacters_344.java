public class ReverseStringCharacters_344 {
    public static void main(String[] args) {
        Character arr[] = {'a', 'b', 'c', 'd', 'e'};
        int i = 0;
        int j = arr.length-1;
        char temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
