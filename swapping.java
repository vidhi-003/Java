// program to swap two numbers

import java.util.Scanner;

class swapping
{
    public static void main(String args[])
    {
        int z,y,temp;
        System.out.println("Enter z and y:");
        try (Scanner scanner = new Scanner(System.in)) {
            z = scanner.nextInt(); // for user input
            y = scanner.nextInt();
        }
        System.out.println("Before Swapping\nz = " +z+ "\ny = "+ y);
        temp = z; // swap done
        z = y;
        y = temp;
        System.out.println("After Swapping\nz = "+z+ "\ny = "+ y);
    }
}