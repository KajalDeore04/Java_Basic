class student{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class midsem {
    public static void main(String[] args) {
        student s=new student();
        s.setId(5);
        System.out.println(s.getId());
    }
}