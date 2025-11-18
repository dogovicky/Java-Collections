import collections.CollectionsDemo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Iterable & Iterator interface and how they work
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (var item : list) {
            System.out.println(item);
        }

        // Collections
        CollectionsDemo.show();

    }
}