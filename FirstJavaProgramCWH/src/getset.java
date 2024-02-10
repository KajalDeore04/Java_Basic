public class getset {

    private String name;
    private int rollno;
    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollno);
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }


    public static void main(String[] args) {

        getset student=new getset();
        student.setName("kajal");
        student.display();
    }
}
