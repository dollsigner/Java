import java.util.Scanner;

/**
 * 这是对java数组的练习
 */
public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("This is ArrayDemo!");
        YanghuiTriangle.yanghuiTriangle();
    }
}

/**
 * 打印杨辉三角
 */
class YanghuiTriangle {
    public static void yanghuiTriangle() {
        System.out.println("请输入要打印的行数：");
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        int[][] triangle = new int[n][n];
        for(int i = 0; i < n; i++){
            //开头与结尾的数字皆为1
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            //注意边界情况，实际有i+1行，但除去开头结尾，本循环执行i-1次
            for(int j = 1; j < i; j++){
                //除开头结尾外其它元素为上一行前一列的数字加上上一行本列的数字
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        for(int i = 0; i < n; i++){
            //边界情况，该次循环全需打印，故j <= i 且j从0开始遍历
            for(int j = 0; j <= i; j++){
                //除开头结尾外其它元素为上一行前一列的数字加上上一行本列的数字
                System.out.print(triangle[i][j]);
            }
            //添加换行符
            System.out.println();
        }
    }
}