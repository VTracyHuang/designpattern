package com.tracy.principle.segregation;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/30 10:22
 */
public class Segregation1 {
}

interface Interface1{

    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B实现了Operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了Operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了Operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了Operation4");

    }

    @Override
    public void operation5() {
        System.out.println("B实现了Operation5");

    }
}
class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D实现了Operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了Operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了Operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了Operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了Operation5");
    }
}
class A{  //A类通过接口Interface1依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}
class C{  //C类通过接口Interface1依赖（使用）B类，但是只会用到1,4,5方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}