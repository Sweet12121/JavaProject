/*
package com.learnJava.Hackerrankquestion;

import java.util.Scanner;




    public class SOLUTION {


        class Shape {
            public void drawShape() {
                System.out.println("Drawing a Shape");
            }
        }

        class Square extends Shape {
            @Override
            public void drawShape() {
                System.out.println("Drawing a Square");
            }
        }

        class Circle extends Shape {
            @Override
            public void drawShape() {
                System.out.println("Drawing a Circle");
            }
        }

        class Rectangle extends Shape {
            @Override
            public void drawShape() {
                System.out.println("Drawing a Rectangle");
            }
        }

        class ShapeFactory {
            public void drawShape(String shapeType) {
                switch (shapeType.toLowerCase()) {
                    case "square":
                        Square square = new Square();
                        square.drawShape();
                        break;
                    case "circle":
                        Circle circle = new Circle();
                        circle.drawShape();
                        break;
                    case "rectangle":
                        Rectangle rectangle = new Rectangle();
                        rectangle.drawShape();
                        break;
                    default:
                        System.out.println("Drawing " + shapeType + " is not supported");
                        break;
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int size = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            String[] shapes = new String[size];
            for (int i = 0; i < size; i++) {

                shapes[i] = scanner.nextLine();
            }

            ShapeFactory shapeFactory = new ShapeFactory();

            // Fixed calls
            System.out.println("Drawing a Circle");
            System.out.println("Drawing a Square");
            System.out.println("Drawing a Rectangle");

            System.out.println(); // Blank line

            // Inputs
            for (String shape : shapes) {
                shapeFactory.drawShape(shape);
            }
        }
}
*/
