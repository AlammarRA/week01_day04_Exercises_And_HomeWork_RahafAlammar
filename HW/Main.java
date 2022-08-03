package HW;

import HW.Customer;

public class Main {
    public static void main(String[] args) {
        //Q1
        int [] arrayOfNum = {5,3,2,3,4,1,5,10,3};
        try {
            System.out.println("The minimum number is : "+minNumber(arrayOfNum));
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Customer customer1 = new Customer(22, "Rahaf", 'm');
            System.out.println(customer1.getName());
            System.out.println(customer1.getGender());
            System.out.println(customer1.getID());
            System.out.println(customer1.toString());

            Customer customer2 = new Customer(22, "Lulwah", 'F');
            System.out.println(customer2.getName());
            System.out.println(customer2.getGender());
            System.out.println(customer2.getID());
            System.out.println(customer2.toString());

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static int minNumber(int[] arrayOfNum) throws Exception{
        int minNum = arrayOfNum[0];

        for (int i = 0; i < arrayOfNum.length; i++) {
            if(arrayOfNum[i]<0)
                throw new Exception("The list should have only a positive number");
            if(arrayOfNum[i]<minNum)
                minNum = arrayOfNum[i];
        }

        return minNum;
    }
}