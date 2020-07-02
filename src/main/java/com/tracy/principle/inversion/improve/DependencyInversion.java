package com.tracy.principle.inversion.improve;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/2 10:28
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}
interface IReceiver{
    String getInfo();
}
class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息： hello,world";
    }
}
class WeiXin implements IReceiver{
    public String getInfo(){
        return "微信信息： hello,world";
    }
}
//完成Person接收消息的功能
//方式1分析
//1.简单，比较容易想到
//2.如果我们获取的对象是 微信，短信等等，则新增类，同时Person类也要增加相应的接收方法
//3.解决思路：引入一个抽象的接口IReciever,表示接受者，这样Person类与接口发生依赖
//  因为Email,微信等等都属于接收的范围，他们各自实现IReciever接口就ok，这样我们就符合依赖倒转原则
class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
