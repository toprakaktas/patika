package StudentPortal;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote; //sözlü notu
    double courseAvg;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Akademisyen " + t.name + " başarıyla atandı.");
        }else
            System.out.println("Akademisyen " + t.name + " bu derse atanamaz.");
    }

    public void printTeacher(){
        if (courseTeacher.branch != null){
            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
        }else
            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
    }

}
