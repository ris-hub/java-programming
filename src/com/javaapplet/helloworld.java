package com.javaapplet;
import java.applet.Applet;
import java.awt.Graphics;

public class helloworld extends Applet {
    public void paint(Graphics g)
    {
        g.drawString("Hello World",150,150);
    }
}
