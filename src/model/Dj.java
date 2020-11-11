package model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Dj {
    int x,y;
    String icon;

    public Dj(String icon) { //参数为敌机图片路径
        //this.icon=icon;
        x=(int)(Math.random()*360)+10; //随机生成x坐标
        y=-30;
    }

    //画敌机
    public void drawPlane(Graphics g) {
        Image plane1=new ImageIcon("airplane.png").getImage(); //小型机
//        Image plane2=new ImageIcon("midplane.png").getImage(); //中型机
//        Image plane3=new ImageIcon("bigplane.png").getImage(); //大型机
        g.drawImage(plane1, x-15, y-15, null);
//        g.drawImage(plane2, x-15, y-15, null);
//        g.drawImage(plane3, x-15, y-15, null);

    }

    //x,y的get和set方法
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}