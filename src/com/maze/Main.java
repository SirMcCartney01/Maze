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
        setVisible(true);
    }

    public static void main(String a[]){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception e){
            //ERROR
        }
        new Main();
    }

    @Override
    public void paint(Graphics g){

        //This loop creates a "i" number of shapes
        Random rand = new Random();
        int[] array = new int[30];
        int position = 0, width = 0, axisX = 0, axisY = 0, counter = 0;
        boolean repeated = false;
        boolean figura = false;
        for(int i = 0; i < 10; i++){
            //Create random dimensions


            //int height;
            do{
                width = rand.nextInt(200) + 50;
                axisX = rand.nextInt(1700) +1 ;
                axisY = rand.nextInt(900) +1 ;
                for(position = 0; position < 30; position++){
                    if(array[position]>=axisX && array[position]<=width+axisX && array[position]<=width+axisY && array[position]>=axisY){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = width;
            counter++;
            array[counter] = axisX;
            counter++;
            array[counter] = axisY;
            counter++;

            //50 is the maximum and the 1 is the minimum
            if(figura){
                figura = false;
                g.setColor(new Color(35, 158, 26));
                g.fillOval(axisX, axisY, width, width); //FOR CIRCLE
            }else{
                figura = true;
                g.setColor(new Color(147, 29, 32));
                g.fillRect(axisX, axisY, width, width);//FOR SQUARE
            }


            /*
            do{
                width = rand.nextInt(200) + 50;
                for(position = 0; position < 60; position++){
                    if(array[position] == width){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = width;
            counter++;



            do{
                axisX = rand.nextInt(1700) +1 ;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisX){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisX;
            counter++;

            do{
                axisY = rand.nextInt(900) +1 ;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisY){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisY;
            counter++;

            g.setColor(new Color(147, 29, 32));
            g.fillRect(axisX, axisY, width, width); // FOR SQUARE
            */
            /*
            height = rand.nextInt(200) + 50;
            width = rand.nextInt(200) + 50;
            axisX = rand.nextInt(800) +1 ;
            axisY = rand.nextInt(600) +1 ;

            g.drawRect(axisX, axisY, width, height); // FOR RECT
            */
            //TODO test for triangle
/*

            do{
                axisX = rand.nextInt(700) +100;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisX){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisX;
            counter++;


            do{
                axisY = rand.nextInt(700) +100;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisY){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisY;
            counter++;

            Graphics2D g2d = (Graphics2D) g;
            Path2D.Double triangle = new Path2D.Double();
            triangle.moveTo(axisX, axisY);

            do{
                axisX = rand.nextInt(700) +100;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisX){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisX;
            counter++;

            do{
                axisY = rand.nextInt(700) +100;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisY){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisY;
            counter++;


            triangle.lineTo(axisX, axisY);
            do{
                axisX = rand.nextInt(700) +100;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisX){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisX;
            counter++;

            do{
                axisY = rand.nextInt(700) +100;
                for(position = 0; position < 60; position++){
                    if(array[position] == axisY){
                        repeated = true;
                        break;
                    }else{
                        repeated = false;
                    }
                }
            }while(repeated);
            array[counter] = axisY;
            counter++;


            triangle.lineTo(axisX, axisY);
            triangle.closePath();
            g2d.setColor(new Color(21, 18, 129));
            //g2d.fill(triangle);
            */
        }
        for(position = 0; position < 30; position++){
            System.out.println(array[position]+" Posicion "+position);
        }

    }
}
