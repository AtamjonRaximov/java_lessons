import java.util.ArrayList;

public class todo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ruchka");
        list.add("qalam");
        list.add("kitob");
        list.add("sumka");
        list.add("daftar");

        create(list, "ko'zoynak");
        update(list, 0, "chizg'ich");
        delete(list, 1);

        show(list);
    }

    private static void create(ArrayList<String> list, String item) {
        list.add(item);
    }

    private static void update(ArrayList<String> list, int index, String newItem) {
        if (index >= 0 && index < list.size()) {
            list.set(index, newItem);
        } else {
            System.out.println("Xato: noto‘g‘ri index.");
        }
    }

    private static void delete(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Xato: noto‘g‘ri index.");
        }
    }

    private static void show(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.println(list.get(i));
                return;
            }
            System.out.print(list.get(i)+",");
        }
    }
}
