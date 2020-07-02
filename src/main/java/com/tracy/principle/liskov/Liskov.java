package com.tracy.principle.liskov;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/2 14:13
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("1 - 2 =" + a.func1(1,2));
    }
}
//A类
class A{
    //返回两个数的差
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

//B类继承了A
//
class B extends A{
    public int func1(int num1,int num2){
        return num1 + num2;
    }
    public int func2(int num1,int num2){
        return num1 + num2 + 9;
    }
}
