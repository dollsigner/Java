
public class Main {
    public int[][] oddNumbers = { {1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23} };
    public static void main(String[] args) {
        Max maxObj = new Max();
        System.out.println("Hello world!");
        Main newObj = new Main();
        System.out.printf("这是oddNumbers的三行一列元素：%d", newObj.oddNumbers[2][0]);
    }
}

/**
 * 这是一个比较类，其中封装有比较方法
 */
class Max {
    public static int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 3;
        System.out.println(max(num1, num2));
    }
}


