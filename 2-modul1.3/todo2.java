public class todo2 {
    String name;
    int day;
    boolean iscomplated;
    boolean isdeleted;

    public todo2(String name, int day) {
        this.name = name;
        this.day = day;
        this.iscomplated = false;
        this.isdeleted = false;
    }


    public void isDone() {
        this.iscomplated = true;
    }

    public void deleted() {
        this.isdeleted = true;
    }

    public void print() {
        System.out.println(name + " " + day + " " + iscomplated);
    }


}
