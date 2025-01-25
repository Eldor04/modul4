package additional_lesson.oop;

import java.util.Scanner;

public class Main {
    static Scanner scInt = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);
    static UserService userService = new UserService();
    public static void main(String[] args) {
        while (true){
            System.out.println("1.login\t2.REgister\t3.Exist");
            switch (scInt.nextInt()){
                case 1 -> {
                    myAdduser();
                }
                case 2 -> {
                    myExam();
                }
                case 0 -> {return;}
                default -> {
                    System.out.println("invalid");
                }
            }
        }
    }

    private static void myExam() {

    }

    private static void myAdduser() {
        System.out.println("Enter userName: ");
        String name = scStr.nextLine();
        System.out.println("Enter age: ");
        int age = scInt.nextInt();
        User user = new User(name,age);
        if (userService.addUser(user)){
            System.out.println("user added");
        }
        else System.out.println("user not found");
    }
}
