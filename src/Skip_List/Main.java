package Skip_List;

public class Main {
    public static void main(String[] args) {
        SkipList list = new SkipList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(25);

        list.display();

        System.out.println("Search 25: " + list.search(25));
        System.out.println("Search 50: " + list.search(50));

        list.delete(20);
        list.display();
    }
}

