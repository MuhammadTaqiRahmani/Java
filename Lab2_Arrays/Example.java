package Lab2_Arrays;

import java.io.*;

class Example {
    public String name;
    public int id;

    Example(String name, int id){

        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){

        // checking if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        Example eg = (Example) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (eg.name == this.name && eg.id == this.id);
    }

    @Override
    public int hashCode()
    {

        // We are returning the Eg_id
        // as a hashcode value.
        return this.id;  }
}

class Main{
    public static void main (String[] args){

        // creating the Objects of Example class.
        Example e1 = new Example("aa", 1);
        Example e2 = new Example("aa", 1);

        // comparing above created Objects.
        if(e1.hashCode() == e2.hashCode()) {

            if(e1.equals(e2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
        }
        else
            System.out.println("Both Objects are not equal. ");
    }
}

