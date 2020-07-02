package com.tracy.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/2 13:08
 */

//client
public class Demeter {
    public static void main(String[] args) {
        System.out.println("使用迪米特法则的改进");
        //创建了一个SchoolManager对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工Id和学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工类
class Employee{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
//学院员工类
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
//管理学院员工的管理类
class  CollegeManager{
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工Id = " +i);
            list.add(emp);
        }
        return list;
    }
    public void printEmployee(){
         List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("---------学院员工----------");
        for (CollegeEmployee e:list1){
            System.out.println(e.getId());
        }
    }

}
//学校的管理类
//分析SchoolManager类的直接朋友类有哪些 Employee,CollegeManager(成员变量，方法参数，返回值)
//CollegeEmployee 不是直接朋友 而是一个陌生类，这样违背了迪米特法则
class SchoolManager{
    //返回学校总部的员工
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5 ;i++) {
            Employee emp = new Employee();
            emp.setId("学院总部员工Id = " +i);
            list.add(emp);
        }
        return list;
    }
    //该方法完成输出学校总部和学院总部的员工
    void printAllEmployee(CollegeManager sub){
        //分析问题
        //1.这里的CollegeEmployee不是SchoolManager的直接朋友
        //2.CollegeEmployee 是以局部变量方式出现在SchoolManager
        //3.违反了迪米特法则

        //分析问题
        //1.将输出学院的员工方法，封装到CollegeManager
        //获取到学院的员工
       List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("---------学院员工----------");
        for (CollegeEmployee e:list1){
            System.out.println(e.getId());
        }
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("---------学校总部员工----------");
        for (Employee e:list2){
            System.out.println(e.getId());
        }
    }
}