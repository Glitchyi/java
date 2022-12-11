import java.util.Vector;

public class test {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();
        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");
        // Using index number
        mammals.add(2, "Cat ");
        // Using addA11()
        System.out.println("Vector: " + mammals);

        System.out.println(mammals.get(0));

        Vector<String> animals = new Vector<>();
        animals.add(" Crocodile");
        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }

}