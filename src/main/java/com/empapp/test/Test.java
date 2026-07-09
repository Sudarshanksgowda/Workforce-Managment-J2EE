package com.empapp.test;

import com.empapp.dao.Employeedao;
import com.empapp.dao.impl.Employeeimpl;
import com.empapp.dto.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//
        Employee e=new Employee();
//
        Employeedao edao=new Employeeimpl();
//
//      /**  The statement `Employeedao edao = new Employeeimpl();` is used to achieve **abstraction and polymorphism** in Java. Here, `Employeedao` is an interface (reference type) and `Employeeimpl` is its implementation class. hides internal details and follows abstraction. This also enables **runtime polymorphism**, where the same reference variable can point to different implementations (e.g., JDBC, Hibernate) without changing the main code. It promotes **loose coupling**, meaning the code is not tightly dependent on a specific class, making it flexible, maintainable, and scalable. In short,  write clean code where the interface defines behavior and the implementation provides the actual logic, and we can easily switch implementations without affecting other parts of the program. **/
//
//
//        Adding Employees

        System.out.println("Enter your employee id");
        e.setId(sc.nextInt());
        System.out.println("Enter your employee name");
        e.setName(sc.next());
        System.out.println("Enter your job ");
        e.setJob(sc.next());
        System.out.println("Enter your salary");
        e.setSalary(sc.nextDouble());
        System.out.println("Enter your department id");
        e.setDno(sc.nextInt());
        System.out.println("Enter your  email");
        e.setEmail(sc.next());
        System.out.println("Enter your password");
        e.setPass(sc.next());

        edao.addemployee(e);
////        System.out.println("Entered Sucessfully");
//
//       // 2nd method Finding by Employee ID
//
////        System.out.println("Enter Employee ID:");
////        System.out.println(edao.findById(sc.nextInt()));
//
//        //3rd method Finding by Email and Pass
//
////        System.out.println("Enter Employee Email:");
////        String Email=sc.next();
////        System.out.println("Enter Employee Pass:");
////        String Pass=sc.next();
////        Employee e2= edao.findEmailAndPassword(Email,Pass);
////        System.out.println(e2);
//
//        // 4th method  Printing All the Object in the List
//
////        List<Employee> list=edao.findAll();
////        for(Employee e1:list){
////            System.out.println(e1);
////        }
//
//        //5th method  Deleting Record
//
////        System.out.println("Enter Employee Department ID you want to Delete");
////        int dno=sc.nextInt();
////        edao.deleteEmployee(dno);
//
//        //6th method Updating Record
//
//        System.out.println("Enter the Employee ID");
//        Integer id=sc.nextInt();
//        Employee e1 = edao.findById(id);
//        System.out.println("Before Updating");
//        System.out.println(e1);
//        System.out.println("Chose the Number you want to update in the Row");
//
//        System.out.println("1, Id");
//        System.out.println("2, Name");
//        System.out.println("3, Job");
//        System.out.println("4, Salary");
//        System.out.println("5, Dno");
//        System.out.println("6, Email");
//        System.out.println("7, Password");
//
//
//       int choice =sc.nextInt();
//       switch (choice) {
//           case 1:
//               System.out.println("Enter the Employee ID");
//               e1.setId(sc.nextInt());
//               break;
//
//           case 2:
//               System.out.println("Enter the Employee Name");
//               e1.setName(sc.next());
//               break;
//           case 3:
//               System.out.println("Enter the Job Name");
//               e1.setJob(sc.next());
//               break;
//           case 4:
//               System.out.println("Enter the Employee Salary");
//               e1.setSalary(sc.nextDouble());
//               break;
//           case 5:
//               System.out.println("Enter the Employee Department Number");
//               e1.setDno(sc.nextInt());
//               break;
//           case 6:
//               System.out.println("Enter the Employee Email");
//               e1.setEmail(sc.next());
//               break;
//           case 7:
//               System.out.println("Enter the Password");
//               e1.setPass(sc.next());
//               break;
//
//       }
//
//        edao.updateEmployee(e1);
//        System.out.println("Updated Sucessfully");
//        System.out.println("After Updating");
//        System.out.println(e1);
//


    }
}
