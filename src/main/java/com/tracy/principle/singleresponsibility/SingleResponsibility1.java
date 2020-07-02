package com.tracy.principle.singleresponsibility;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/30 9:54
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("船");
    }
}

class Vehicle{

    public void run(String name){
        System.out.println(name + "在路上跑");
    }
}
