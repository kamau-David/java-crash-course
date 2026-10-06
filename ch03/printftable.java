public class printftable {
    public static void main (String[]args){
        System.out.printf("%-10s %6s %8s%n", "maize", "item", "price");
        System.out.printf("%-10s %6d %8.2f%n","maize", 3 ,120.5);
        System.out.printf("%-10s %6d %8.2f%n", "Sugar", 12, 185.0);
        System.out.printf("Total: %,d shilings%n",123456);
    }
    
}
