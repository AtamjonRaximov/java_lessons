
public class app {
    public static void main(String[] args) {
        todo2[] todos = {
                new todo2("Dars qilish", 3),
                new todo2("Sport bilan shug'ulanish", 5),
                new todo2("kitob o'qish", 7)
        };

        todos[0].isDone();
        todos[1].deleted();

        for (todo2 t :todos){
            if(!t.isdeleted){
                t.print();
            }
        }

    }
}
