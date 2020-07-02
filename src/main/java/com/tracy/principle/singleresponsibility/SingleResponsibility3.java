package com.tracy.principle.singleresponsibility;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/30 10:01
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("飞机");
        vehicle2.runRoad("汽车");
        vehicle2.runWater("船");
    }
}
//方式3的分析
//1.这种修改方法没有对原来的类做大的修改，只是增加方法
//2.这种方案虽然在类的级别并没有遵守单一职责原则，但在方法级别上，仍然是遵守单一职责
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空运行");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水里运行");
    }
}
