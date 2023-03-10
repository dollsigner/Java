import java.util.Scanner;

/**
 * 这是一个对scanner类的练习
 */
public class ScannerDemo {
    /**
     * 读取字符串实例化
     */
    static ScannerString readString = new ScannerString();
    static ScannerInteger readInt = new ScannerInteger();
    public static void main(String[] args){
        System.out.println("This is a ScannerDemo");
        readInt.scannerInteger();
    }
}

/**
 * 这是对scanner字符串流的练习
 */
class ScannerString {
    public void scannerString() {
        Scanner rd = new Scanner(System.in);
        System.out.println("现在请输入字符");
        if(rd.hasNext()){
            String str1 = rd.next();
            System.out.println("这是你输入的字符：" + str1);
        }
        rd.close();
    }
    public void scannerStringPlus() {
        Scanner rd = new Scanner(System.in);
        System.out.println("现在请输入字符（plus版）");
        if(rd.hasNextLine()){
            String str1 = rd.nextLine();
            System.out.println("这是你输入的字符（plus版）：" + str1);
        }
        rd.close();
    }
}

/**
 * scanner求平均数以及和
 */
class ScannerInteger {
    public void scannerInteger(){
        Scanner rd = new Scanner(System.in);
        System.out.println("请输入您即将求和求平均数的数据：(以end结尾)");
        int nums = 0, sum = 0;
        while(rd.hasNextInt()){
            sum += rd.nextInt();
            nums++;
        }
        System.out.println("这些数据之和为：" + sum);
        System.out.println("这些数据的平均数为：" + sum/nums);
        rd.close();
    }
}