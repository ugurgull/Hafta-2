public class Student{

    String name, stuNo, classes;
    Course c1, c2, c3;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }
    public void addBulkExamNote(int note1, int note2, int note3, int verbalNote1, int verbalNote2, int verbalNote3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
            this.c1.verbalNote = verbalNote1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
            this.c2.verbalNote = verbalNote2;
        }
        if(note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.c3.verbalNote = verbalNote3;
        }
    }
    public void isPass(){
        this.average = (((this.c1.note*0.80) + (this.c1.verbalNote*0.20)) + ((this.c2.note*0.80) + (this.c2.verbalNote*0.20)) + ((this.c3.note*0.80)+(this.c3.verbalNote*0.20))) / 3;
        System.out.println("===========================");
        if(this.average > 55){
            System.out.println(this.name + "Sınıfı Gectiniz!");
        }else {
            System.out.println(this.name + "Sınıfta Kaldiniz!");
        }
        System.out.println("Ortalamaniz : " + this.average);
        printNote();
    }

    public void printNote(){
        System.out.println(this.c1.name + " -> Sınav Notu : " + this.c1.note + " Sözlü Notu : " + this.c1.verbalNote);
        System.out.println(this.c2.name + " -> Sınav Notu : " + this.c2.note + " Sözlü Notu : " + this.c2.verbalNote);
        System.out.println(this.c3.name + " -> Sınav Notu : " + this.c3.note + " Sözlü Notu : " + this.c3.verbalNote);

    }

}