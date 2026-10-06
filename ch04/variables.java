package ch04;

//variables

public class variables {
    public static void main(String[] args){
        int age = 20;
        double price =99.99;
        char grade ='A';
        boolean isStudent = true;
        String name = "David";
        long population = 54_000_000L;

        System.out.println(name + " is " + age + " years old");
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade );
        System.out.println("IsStudent? " + isStudent);
        System.out.println("Population: " + population);

        age = 21;
        System.out.println("Next year: " + age);

        final double PI = 3.1419;
        System.out.println("PI= " + PI);

        var city = "Nairobi";
        System.out.println("City: " + city);




    }
}
