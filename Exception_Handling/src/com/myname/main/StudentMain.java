package com.myname.main;
import com.myname.exception.InvalidStudentException;
import com.myname.stuent.Student;

import java.util.Scanner;

public class StudentMain {
    public static Student search(Student[] arr, int rollno) throws InvalidStudentException {
        for (Student student : arr) {
            if (student.getRollno() == rollno) {
                return student;
            }
        }
        throw new InvalidStudentException("Student not found!");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of students: ");
        int N = input.nextInt();
        Student[] arr = new Student[N];
        System.out.println();
        System.out.println();
        for (int i = 0; i < N; i++){
            System.out.print("Enter the name of " + (i+1) + "student: ");
            String name = input.next();
            System.out.print("Enter the roll number of " + (i+1) + "student: ");
            int roll = input.nextInt();
            System.out.print("Enter the cpi of " + (i+1) + "student: ");
            double cpi = input.nextDouble();
            arr[i] = new Student(name, roll, cpi);
            System.out.println();
        }
        System.out.println("\n\n");
        try{
            System.out.print("Enter the rollno to search: ");
            int roll = input.nextInt();
            Student found = search(arr, roll);
            System.out.println("\n" + found.toString());
        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }finally{
            input.close();
        }
    }
}
