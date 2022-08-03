package Exercises;

import Exercises.Author;
import Exercises.Ball;
import Exercises.Employee;
import Exercises.InvoiceItem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //------------------------------------------------------------//

        //Q1

        /*
        int idList[] = {20,34,90,30,3,40,22};
        try{
            System.out.println(idList[9]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index 9 out of bounds for length 7");
        }


        */

        //------------------------------------------------------------//

        //Q2

        /*
        try {
            System.out.println(dividedBy5(90)+" Is divided by 5 ");
            System.out.println(dividedBy5(46)+" Is divided by 5 ");

        } catch (Exception e){
            e.printStackTrace();
        }

         */


        Author author1 = new Author("Rahaf","Rahaf@gmail.com");
        Author author2 = new Author("Noura","Noura");

        System.out.println("Author1:Email = "+author1.getEmail());
        author2.setEmail("Noura@gmail.com");
        System.out.println("Author2:Email = "+author2.getEmail());

        //------------------------------------------------------------//

        //Q4

        Ball ball1 = new Ball(2,2,2,2,2);
        Ball ball2 = new Ball(4,4,4,4,4);

        System.out.println(ball1.getX());
        System.out.println(ball1.getRadius());

        //------------------------------------------------------------//

        //Q5

        Employee employee = new Employee(22,"Rahaf","Alammar",999999);
        Employee employee2 = new Employee(33,"Sara","Ahmad",999999);

        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee2.getName());
        System.out.println(employee2.getAnnualSalary());


        //------------------------------------------------------------//

        //Q6

        InvoiceItem invoiceItem = new InvoiceItem("A0","A00",22,22.22);
        System.out.println(invoiceItem.getId());
        System.out.println(invoiceItem.getTotal());

        InvoiceItem invoiceItem2 = new InvoiceItem("B0","B00",44,44.44);
        System.out.println(invoiceItem2.getId());
        System.out.println(invoiceItem.getTotal());

        //------------------------------------------------------------//

        //Q7

        MyPoint myPoint1 = new MyPoint(2,2);
        MyPoint myPoint2 = new MyPoint(4,4);


        System.out.println("X: "+myPoint1.getX());
        System.out.println("Y: "+myPoint1.getY());
        System.out.println("XY: "+ Arrays.toString(myPoint1.getXY()));
        System.out.println("Distance: "+myPoint1.distance());

        System.out.println("X: "+myPoint2.getX());
        System.out.println("Y: "+myPoint2.getY());
        System.out.println("XY: "+ Arrays.toString(myPoint2.getXY()));
        System.out.println("Distance: "+myPoint2.distance());
        System.out.println("X: "+myPoint2.getX());





    }

    public static int dividedBy5(int num) throws Exception {
        if (num%5 != 0){
            throw new Exception(num + " Is not divided by 5");
        }
        return num;
    }
}