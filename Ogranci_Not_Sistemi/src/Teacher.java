public class Teacher {
    String name, mpno, branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adi : " + name);
        System.out.println("Telefon numarasi : " + mpno);
        System.out.println("Bölümu : " + branch);
    }

}