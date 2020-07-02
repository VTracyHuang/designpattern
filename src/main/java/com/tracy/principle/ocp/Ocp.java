package com.tracy.principle.ocp;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/1 14:32
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawTriangle(new Triangle());
    }
}
//这是一个用于绘图的类
class GraphicEditor{
    //接收Shape对象，然后根据type,来绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }
        else if(s.m_type == 2){
            drawCircle(s);
        }
        else if(s.m_type == 3){
            drawTriangle(s);
        }
    }
    //绘制矩形
    public void drawRectangle(Shape r){
        System.out.println("绘制矩形");
    }
    //绘制圆形
    public void drawCircle(Shape r){
        System.out.println("绘制圆形");
    }
    //绘制三角形
    public void drawTriangle(Shape r){
        System.out.println("绘制三角形");
    }
}

class Shape{
    int m_type;
}

class Rectangle extends Shape{
    public Rectangle() {
        m_type = 1;
    }
}

class Circle extends Shape{
    public Circle() {
        m_type = 2;
    }
}

class Triangle extends Shape{
    public Triangle(){
        m_type = 3;
    }
}