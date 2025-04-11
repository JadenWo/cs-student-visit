public class Hello {

    public static void main (String[] args) {
        String name = getName();
        greet(name);
    }
    public static void greet(String name) {
        System.out.println ("Hello, " + name + "!");
    }
    public static String getName() {
        
        return "John Doe";
    }
}
