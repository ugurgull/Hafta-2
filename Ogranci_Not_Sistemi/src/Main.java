public class Main {


    public static void main(String[] args) {
        Teacher t1 = new Teacher("MAHMUT HOCA","5055255454","TRH");
        Teacher t2 = new Teacher("GRAHAM BELL","5055254323","FZK");
        Teacher t3 = new Teacher("KULYUTMAZ","5055255350","KMY");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "202", "FZK", t2);
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "303", "KMY", t3);
        kimya.addTeacher(t3);


        Student student1 = new Student("İnek Saban", "1001", "4", tarih, fizik, kimya);
        Student student2 = new Student("Güdük Necmi", "1001", "4", tarih, fizik, kimya);

        student1.addBulkExamNote(65,75,80,45,55,75);
        student1.isPass();
        student2.addBulkExamNote(34,45,30,89,90,40);
        student2.isPass();
    }
}