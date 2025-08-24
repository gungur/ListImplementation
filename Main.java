public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Hello ");
        list.add("World");
        System.out.println(list.get(0) + list.get(1));
    }

}