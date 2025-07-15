package Ex_33_Collection_Framework_DSA.Map;

import java.util.*;

public class Lab262_REAL_EXAMPLE {
    public static void main(String[] args) {

        Map <String,Object> student1 = new HashMap();
        student1.put("Name", "Lipi");
        student1.put("Phone", 9857964125l);
        student1.put("Address", "Hyderabad");
        student1.put("Pincode", "500044");

        Map <String,Object> student2 = new HashMap();
        student2.put("Name", "Vinay");
        student2.put("Phone", 9758421536l);
        student2.put("Address", "Bangalore");
        student2.put("Pincode", "560021");

        //Duplicates are allowed
        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        //Duplicates are not allowed
        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);

    }
}
