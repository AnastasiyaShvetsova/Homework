package SecondHomework;

public class SecondHomework {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        int c = 15;
        System.out.println(b);

        System.out.println(Math.pow(b,3));
        a++;
        System.out.println(a);
        c--;
        c--;
        System.out.println(c);

        if (a < b && a < c){
            System.out.println("A is the smallest one");
        }
        else if (b < a && c > b){
            System.out.println("B is the smallest one");
        }
        else {
            System.out.println("C is the smallest one");
        }

        String name = "Anastasiya Shvetsova";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("Anastasiya Shvetsova"));
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("a"));
        System.out.println();
        String [] array = name.split(" ");
        int sizearray;
        sizearray = array.length;
        for (int i = 0; i <sizearray; i++) {
            System.out.print(array[i]+ "");
        }

        System.out.println();

        String hello = "Hello. The temperature in %s is %d now.";
        System.out.println(String.format(hello, "Mariupol", 14));

        




}
}
