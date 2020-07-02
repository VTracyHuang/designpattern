package com.tracy.principle.ocp.improve;

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
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//这是一个用于绘图的类
class GraphicEditor{
    //接收Shape对象，调用draw方法
    public void drawShape(Shape s){
      s.draw();
    }
}

abstract class Shape{
    int m_type;
    public abstract void draw();
}

//画矩形
class Rectangle extends Shape {
    public Rectangle() {
        m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

//画圆形
class Circle extends Shape {
    public Circle() {
        m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle extends Shape {
    public Triangle(){
        m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
//新增一个图形
class OtherGraphic extends Shape{
    public OtherGraphic() {
        m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}