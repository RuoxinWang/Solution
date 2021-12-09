package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	    Student s1 = new Student(001, "David", 3.0, "1998-01-01");
        Student s2 = new Student(002, "Lee", 3.2, "1999-03-03");
        Student s3 = new Student(003, "Tom", 3.5, "1997-05-01");
        Student s4 = new Student(004, "Jay",3.1,"1996-10-10");
        Student s5 = new Student(005, "Marry",3.6,"2000-08-08");

        PriorityQueue<Student> queueByName = new PriorityQueue<>(new NameComparator());
        queueByName.offer(s1);
        queueByName.offer(s2);
        queueByName.offer(s3);
        queueByName.offer(s4);
        queueByName.offer(s5);
        System.out.println("Sort by ascending order of Name: ");
        for(int i = 0; i < 5; i++){
            Student tar = queueByName.poll();
            System.out.println(tar.getId() + " " + tar.getName() + " " + tar.getGpa() + " " + tar.getDateOfBirth());
        }

        PriorityQueue<Student> queueByGPA = new PriorityQueue<>(new GpaComparator());
        queueByGPA.offer(s1);
        queueByGPA.offer(s2);
        queueByGPA.offer(s3);
        queueByGPA.offer(s4);
        queueByGPA.offer(s5);
        System.out.println("Sort by descending order of GPA: ");
        for(int i = 0; i < 5; i++){
            Student tar = queueByGPA.poll();
            System.out.println(tar.getId() + " " + tar.getName() + " " + tar.getGpa() + " " + tar.getDateOfBirth());
        }

        PriorityQueue<Student> queueByDOB = new PriorityQueue<>(new DateOfBirthComparator());
        queueByDOB.offer(s1);
        queueByDOB.offer(s2);
        queueByDOB.offer(s3);
        queueByDOB.offer(s4);
        queueByDOB.offer(s5);
        System.out.println("Sort by ascending order of DOB: ");
        for(int i = 0; i < 5; i++){
            Student tar = queueByDOB.poll();
            System.out.println(tar.getId() + " " + tar.getName() + " " + tar.getGpa() + " " + tar.getDateOfBirth());
        }
    }
}
