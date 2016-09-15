package com.maze;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.Random;

public class Main extends JFrame{

    public Main(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception e){
            System.err.println("Error: Cannot load Look and Feel");
            e.printStackTrace();
        }

        Main main = new Main();
        main.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        Random rand = new Random();
        int[] array = new int[30];
        int position = 0, width = 0, axisX = 0, axisY = 0, counter = 0;
        boolean repeated = false;
        boolean figura = false;
        for (int i = 0; i < 10; i++) {
            do {
                width = rand.nextInt(150) + 50;
                axisX = rand.nextInt(900) +1;
                axisY = rand.nextInt(700) +1;
                for (position = 0; position < 30; position++){
                    if (array[position] >= axisX && array[position] <= width + axisX && array[position] <= width + axisY && array[position] >= axisY) {
                        repeated = true;
                        break;
                    } else {
                        repeated = false;
                    }
                }
            } while(repeated);
            array[counter] = width;
            counter++;
            array[counter] = axisX;
            counter++;
            array[counter] = axisY;
            counter++;

            if (figura) {
                figura = false;
                g.setColor(new Color(35, 158, 26));
                g.fillOval(axisX, axisY, width, width); //FOR CIRCLE
            } else {
                figura = true;
                g.setColor(new Color(147, 29, 32));
                g.fillRect(axisX, axisY, width, width); // FOR SQUARE
            }
        }

        for (position = 0; position < 30; position++)
            System.out.println(array[position]+" Posicion " + position);
    }
}
