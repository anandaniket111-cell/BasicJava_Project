package java_days;

public class day {

    public static void main(String[] args) {

        String a="aniket kolekar";
        System.out.println(a);
        String temp="";

        for (int i=a.length()-1;i>=0;i--){
            temp=temp+a.charAt(i);

        }
        System.out.println(temp);
    }
}

