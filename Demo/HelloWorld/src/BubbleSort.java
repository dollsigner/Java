/***
 * 这是一个实现冒泡排序的类
 */
public class BubbleSort {
    public static void main(String[] args){
        System.out.println("This is BubbleSort!");
        double[] numbers1 = {13.2, 14,2, 22,4, 55.6};
        double max1 = bubbleSort(numbers1);
        System.out.println("This is the max in numbers1: " + max1);
        System.out.println("This is the max in numbers2: " + bubbleSort(29.3, 22,3, 10.4, 45.5));

    }
    public static double bubbleSort(double...numbers){
        double result = numbers[0];
        for(double element: numbers){
            if(result < element){
                result = element;
            }
        }
        return result;
    }
}
