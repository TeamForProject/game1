package frame;

import javax.swing.*;

import panel.GamePanel;

public class Game {

    public static void main(String[] args) {
        JFrame j = new JFrame(); //创建窗口
        GamePanel g = new GamePanel(); //创建画布
        j.add(g); //添加画布
        j.setSize(400, 650);
        j.setTitle("飞机大战"); //设置标题
        j.setLocationRelativeTo(null); //设置居中
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //默认关闭
        j.setVisible(true); //窗口可见性
        g.Move(); //调用Move方法
        j.addMouseListener(g); //添加监听器
        j.addMouseMotionListener(g);

    }

}