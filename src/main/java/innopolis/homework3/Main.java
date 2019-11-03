package innopolis.homework3;

public class Main {

    public static void main(String[] args) {
        NewMap<Integer, String> newMap = new NewMap<>(16);

        for (int i = 0; i <= 100; i++) {
            newMap.put(i, i + "");
        }
        System.out.println(newMap.toString());
        for (int i = 50; i < 100; i++) {
            System.out.println(newMap.remove(i));
        }
        System.out.println(newMap.toString());

    }


}
