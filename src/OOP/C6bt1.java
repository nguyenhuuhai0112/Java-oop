package OOP;

import java.util.*;

public class C6bt1 {

	

	abstract class Shape {
	    abstract double area();
	    abstract double perimeter();
	    abstract void draw();
	}

	class Square extends Shape {
	    private double side;

	    Square(double side) {
	        this.side = side;
	    }

	    @Override
	    double area() {
	        return side * side;
	    }

	    @Override
	    double perimeter() {
	        return 4 * side;
	    }

	    @Override
	    void draw() {
	        System.out.println("Drawing a square.");
	    }
	}

	class Circle extends Shape {
	    private double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double area() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    double perimeter() {
	        return 2 * Math.PI * radius;
	    }

	    @Override
	    void draw() {
	        System.out.println("Drawing a circle.");
	    }
	}

	class EquilateralTriangle extends Shape {
	    private double side;

	    EquilateralTriangle(double side) {
	        this.side = side;
	    }

	    @Override
	    double area() {
	        return (Math.sqrt(3) / 4) * side * side;
	    }

	    @Override
	    double perimeter() {
	        return 3 * side;
	    }

	    @Override
	    void draw() {
	        System.out.println("Drawing an equilateral triangle.");
	    }
	}
	public class Main {
	    public static void main(String[] args) 
	    {
	        Square square = new Square(5,);
	        
	        

	    }	        
}}

