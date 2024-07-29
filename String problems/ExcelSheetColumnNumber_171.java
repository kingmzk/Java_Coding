public class ExcelSheetColumnNumber_171 {
    private static int titleToNumber(String columnTitle) {
        int result =  0;
        char[] ch = columnTitle.toCharArray();
        int n = ch.length;

        for(int i = 0; i < n; i++) {
            int num = ch[i] - 65 + 1;
            result = result * 26 + num;
        }
        return result;
    }
    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println((titleToNumber(columnTitle)));
    }
}
