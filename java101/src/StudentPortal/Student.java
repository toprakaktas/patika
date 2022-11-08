package StudentPortal;

public class Student {
    String name;
    String stdNo;
    int classes;
    double average;
    boolean isPass;
    Course math;
    Course physics;
    Course chem;

    public Student(String name, String stdNo, int classes, Course math, Course physics, Course chem){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chem = chem;
        calcAverage();
    }

    public void addBulkExamNote(int math, int physics, int chem){
        if (math >= 0 && math <= 100)
            this.math.note = math;
        if (physics >= 0 && physics <= 100)
            this.physics.note = physics;
        if (chem >= 0 && chem <= 100)
            this.chem.note = chem;
    }

    //sözlü not tanımlaması
    public void addBulkVerbalNote(int math, int physics, int chem){
        if (math >= 0 && math <= 100)
            this.math.verbalNote = math;
        if (physics >= 0 && physics <= 100)
            this.physics.verbalNote = physics;
        if (chem >= 0 && chem <= 100)
            this.chem.verbalNote = chem;
    }

    public void isPass(){
        if (this.math.note == 0 || this.physics.note == 0 || this.chem.note == 0)
            System.out.println("Tüm notlarınız girilmemiş.");
        else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass)
                System.out.println("Sınıfı başarıyla geçtiniz!");
            else
                System.out.println("Sınıfta kaldınız!");
        }
    }
    public void calcAverage(){
        this.average = ((this.math.note * 0.8 + this.math.verbalNote * 0.2) +
                (this.physics.note * 0.8 + this.physics.verbalNote * 0.2) +
                (this.chem.note * 0.8 + this.chem.verbalNote * 0.2)) / 3;
    }



    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("----------------------------------");
        System.out.println("Öğrencinin Adı: " + this.name);
        System.out.println("Matematik Notu: " + this.math.note);
        this.math.courseAvg = (this.math.note * 0.8 + this.math.verbalNote * 0.2);
        System.out.println("Matematik Ortalaması: " + this.math.courseAvg);
        System.out.println("Fizik Notu: " + this.physics.note);
        this.physics.courseAvg = (this.physics.note * 0.8 + this.physics.verbalNote * 0.2);
        System.out.println("Fizik Ortalaması: " + this.physics.courseAvg);
        System.out.println("Kimya Notu: " + this.chem.note);
        this.chem.courseAvg = (this.chem.note * 0.8 + this.chem.verbalNote * 0.2);
        System.out.println("Kimya Ortalaması: " + this.chem.courseAvg);

    }
}
