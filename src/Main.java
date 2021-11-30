public class Main {

    public static void main(String[] args) {

        EncapTest test = new EncapTest();
        System.out.println(test.getIdNum());
        System.out.println(test.getName());
        System.out.println(test.getAge());

        System.out.println();
        test.setName("Masha");
        test.setIdNum("02");
        test.setAge(21);

        System.out.println(test.getIdNum());
        System.out.println(test.getName());
        System.out.println(test.getAge());


    }
}
