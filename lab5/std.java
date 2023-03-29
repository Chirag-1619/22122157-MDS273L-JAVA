import java.util.*;

public class std {


    private String regNo;
    private String name;
    private String email;
    private String phone;
    private String classno;
    private String department;

    std student = new std("2023-01", "John Doe", "johndoe@example.com", "1234567890", "12A", "Computer Science");


    public std(String regNo, String name, String email, String phone, String classno, String department){
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.classno = classno;
        this.department = department;
    }

    public void printDetails(){
        System.out.println("Registration number: " +regNo);
        System.out.println("Name: " +name);
        System.out.println("Email address: " +email);
        System.out.println("Phone number: " +phone);
        System.out.println("Class: " +classno);
        System.out.println(("Department: " +department));
    }

}
