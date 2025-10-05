package java_days;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enterr a marks");
        int marks=sc.nextInt();

        if(marks >= 75){
            System.out.println("distingtion");
        } else if (marks >=65 && marks <75) {
            System.out.println("firstclass");
        } else if (marks >=50 && marks <65) {
            System.out.println("Secondclass");
        } else if (marks >=35 && marks <50) {
            System.out.println("pass");
        }else {
            System.out.println("you need to hang on rope");

        }


    }
}
