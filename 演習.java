public class 演習{
    public static String greet (String name) {
        String result = "こんにちは、\n" +name+ " さん！";
        return result;
    }
    public static int sum (int a,int b) {
        int result = a+b;
        return result;
    }
    public static double calculateCircleArea (double r) {
        double result = r*r*3.14;
        return result;
    }
    public static String checkEvenOdd (int a) {
        String result;
        if (a%2==0){
            result = "even";
        }
        else{
            result = "odd";
        }
        return result;
    }
    public static String repeat(String str, int count) {
        return str.repeat(count);
    }
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static int calculateArea (int a) {
        int result = a * a;
        return result;
    }
    public static int calculateArea (int a,int b) {
        int result = a * b;
        return result;
    }
    public static double calculateArea (int a,int b) {
        double result = a * b / 2;
        return result;
    }
    public static double[] calculateStats(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        return new double[] { sum, average };
    }
    
}

    // [アクセス修飾子] [static] 戻り値の型 メソッド名(引数リスト) {
    //     メソッドの処理（メソッドブロック）
    //     [return  戻り値;]
    // }