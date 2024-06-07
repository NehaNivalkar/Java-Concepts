package BasicPrograms;

//Abstract class
abstract class Shape {
 // Abstract method
 abstract double calculateArea();

 // Concrete method
 void display() {
     System.out.println("This is a shape.");
 }
}

//Concrete subclass (Circle)
class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 // Implementing the abstract method
 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Concrete subclass (Rectangle)
class Rectangle extends Shape {
 double length;
 double width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementing the abstract method
 @Override
 double calculateArea() {
     return length * width;
 }
}

public class Abstract {
 public static void main(String[] args) {
     // Creating objects of concrete subclasses
     Circle circle = new Circle(5);
     Rectangle rectangle = new Rectangle(4, 6);

     // Calling methods on objects
     circle.display();
     System.out.println("Area of Circle: " + circle.calculateArea());

     rectangle.display();
     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 }
}

