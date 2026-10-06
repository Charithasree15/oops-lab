import java.util.Scanner;
class student{
      String usn;
      String name;
      void accept(){
            Scanner sc= new Scanner(System.in);
            System.out.print("enter USN:");
            usn=sc.nextLine();
            System.out.print("Enter Name:");
            name=sc.nextLine();
      }
      void display(){
           System.out.println("USN:"+usn);
           System.out.println("Name:"+name);
       }
public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      student s1=new student();
      student s2= new student();
      System.out.println("Enter details of student 1:");
      s1.accept();
      System.out.println("Enter details of student 2:");
      s2.accept();
      System.out.println("student 1 details");
      s1.display();
      System.out.println("student 2 details");
      s2.display();
    }
      
   }   