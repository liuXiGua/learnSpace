/**
 * @ProjectName: learnSpace
 * @Package: PACKAGE_NAME
 * @ClassName: Person
 * @Description: java类作用描述
 * @Author: liuXiGua
 * @Date: 2019/11/3 18:10
 */
public class Person {

    private String name;

    public static void main(String[] args) {
        // 定义数组，存储3个元素
        int[] arr = new int[3];
        //数组索引进行赋值
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        //输出3个索引上的元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //定义数组变量arr2，将arr的地址赋值给arr2
        int[] arr2 = arr;
        arr2[1] = 9;
        System.out.println(arr[1]);
    }

}
