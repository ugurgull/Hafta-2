public class Course{
    Teacher teacher;
    String name, code, prefix;
    int note, verbalNote;

    public Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.verbalNote = 0;
    }
    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor.");
        }
    }
    public void printTeacher(){
        teacher.print();
    }
}