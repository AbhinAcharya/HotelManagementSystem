package com.tigerland.hms;

import com.tigerland.hms.model.Admin;
import com.tigerland.hms.model.Customer;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner input = new Scanner(System.in);
        String userName,password;
        System.out.println("===========================");
        System.out.println("*****Hotel TigerLand*******");
        System.out.println("===========================");
        System.out.println("\r\n Please Login");
        System.out.print("Enter Username: ");
        userName = input.next();
        System.out.print("Enter your password: ");
        password = input.next();
        if (!userName.equalsIgnoreCase(admin.getUserName()) && !userName.equalsIgnoreCase(admin.getPassword())){
            while(true){
                System.out.println("1. Customer ");
                System.out.println("2. Room ");
                System.out.println("3. Employee ");
                System.out.println("4. Exit");
                int choice = input.nextInt();
                switch (choice){
                    case 1:{
                        customer();
                        break;
                    }
                    case 2:{
                        break;

                    }
                    case 3:{
                        break;

                    }
                    case 4:{
                        System.exit(0);
                        break;
                    }
                }
            }
        }
        else{
            System.err.println("Wrong Username or Password");
        }
    }

    public static void customer() {
        Scanner input = new Scanner(System.in);
        //String choiceStr = "y";
       // while (choiceStr.equalsIgnoreCase("y")) {
            System.out.println("===========================");
            System.out.println(" Customer Management System");
            System.out.println("===========================");
            System.out.println("1. Add customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. Search Customer By Id");
            System.out.println("5. Display All customer");
            System.out.println("6. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                addCustomer();
                break;
                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
                case 6: {
                    System.exit(0);
                    break;
                }
            }
           // System.out.println("\r\n Do you want to add more");
        }
    //}
    public static void addCustomer(){
        Scanner input =  new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("============");
        System.out.println("Add Customer");
        System.out.println("============");
        System.out.println("input Customer Id");
        customer.setcId(input.nextInt());
        System.out.println("input First Name");
        customer.setFirstName(input.next());
        System.out.println("input Middle Name");
        customer.setMiddleName(input.next());
        System.out.println("Input Last Name");
        customer.setLastName(input.next());
        System.out.println("input Address");
        customer.setAddress(input.next());
        System.out.println("input PhoneNumber");
        customer.setPhoneNumber(input.nextInt());

    }
}
