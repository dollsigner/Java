/**
 * String类练习
 * 1.字符串常量池与JVM内存区域元空间永久代的概念及 new String("");  =""; String.intern()在jvm内存中的影响
 * 2. ==与equals()的区别，==比较的是引用，更苛刻，equals()比较的是内容，没有那么苛刻。
 * 3.字符串拼接的几种方式：
 * 语法糖+，concat: 创建新的字符串变量返回; StringBuilder.append(),String.join():数组扩容返回,不创造新对象; 创造新的字符串变量返回
 * 4.字符串分割方式:
 *
 */
public class StringDemo {
    public static void main(String[] args){
        System.out.println("Hello,World!");
    }
}

/**
 * 重写equals类
 */
/*class Equals {
    public Boolean equalss(Object anObject){
        // == 判等条件更苛刻，优先级更高
        if(this == anObject){
            return true;
        }
        if(anObject instanceof String){
            String thisString = (String) this;
            String aString = (String) anObject;
            for(int i = 0; i < aString.length; i++){
                if(this[i] != aString[i])
            }
        }
    }
}*/

