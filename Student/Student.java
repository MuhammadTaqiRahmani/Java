package Student;

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;


    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Node {
    Student data;
    Node next;

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }
}

class StudentLinkedList {
    Node head;

    public void insert(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void viewList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.data.name + ", Roll Number: " + temp.data.rollNumber);
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtPosition(int position, Student student) {
        Node newNode = new Node(student);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("Invalid position.");
            }
        }
    }

    public boolean search(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.name.equals(name)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void delete(String name) {
        Node temp = head;
        Node prev = null;


        if (temp != null && temp.data.name.equals(name)) {
            head = temp.next;
            return;
        }


        while (temp != null && !temp.data.name.equals(name)) {
            prev = temp;
            temp = temp.next;
        }


        if (temp == null) {
            System.out.println("Record not found.");
            return;
        }


        prev.next = temp.next;
    }
}

