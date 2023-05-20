class Main {

    // below is a suggested test
    // feel free to make modifications to create your own tests

    public static void main(String[] args) {
        ListOfStrings lst = new ListOfStrings();
        lst.add("c++");
        lst.add("java", 0);
        lst.add("c#", 2);
        System.out.println(lst.remove()); // c#
        lst.add("kotlin");
        System.out.println(lst.remove(1)); // c++
        System.out.println(lst.remove(1)); // kotlin
        System.out.println(lst.remove()); // java
    }
}