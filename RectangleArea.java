import java.util.Scanner;  

class Rectangle {  
    // Attributes  
    private double width;  
    private double height;  

    // Constructor  
    public Rectangle(double width, double height) {  
        this.width = width;  
        this.height = height;  
    }  

    // Method to calculate the area  
    public double calculateArea() {  
        return width * height;  
    }  
}  

public class RectangleArea {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Prompt the user to enter the width of the rectangle  
        System.out.print("Enter the width of the rectangle: ");  
        double width = scanner.nextDouble();  

        // Prompt the user to enter the height of the rectangle  
        System.out.print("Enter the height of the rectangle: ");  
        double height = scanner.nextDouble();  

        // Create a Rectangle object  
        Rectangle rectangle = new Rectangle(width, height);  

        // Calculate and display the area  
        double area = rectangle.calculateArea();  
        System.out.println("The area of the rectangle is: " + area);  

        // Close the scanner  
        scanner.close();  
    }  
}
