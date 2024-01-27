import java.util.Scanner;

class Student {
    int usn;
    String name;
    int phy_marks;
    int coa_marks;
    int math_marks;
    int dbms_marks;
    int dsa_marks;
    int ml_marks;

    void initialize(int usn, String name, int phy_marks, int coa_marks, int math_marks, int dbms_marks,
                    int dsa_marks, int ml_marks) {
        this.usn = usn;
        this.name = name;
        this.phy_marks = phy_marks;
        this.coa_marks = coa_marks;
        this.math_marks = math_marks;
        this.dbms_marks = dbms_marks;
        this.dsa_marks = dsa_marks;
        this.ml_marks = ml_marks;
    }

    void calculate() {
        double percentage = (phy_marks + coa_marks + math_marks + dbms_marks + dsa_marks + ml_marks) / 600.0 * 100;
        System.out.println("The student " + name + " with USN: " + usn + " has a percentage of " + percentage);
    }
}

public class Run {
    public static void main(String[] args) {
        Student[] a = new Student[2]; // Corrected the array declaration

        Scanner s1 = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter USN, Name, and Marks for Student " + (i + 1));
            int usn = s1.nextInt();
            String name = s1.next();
            int phy_marks = s1.nextInt();
            int coa_marks = s1.nextInt();
            int math_marks = s1.nextInt();
            int dbms_marks = s1.nextInt();
            int dsa_marks = s1.nextInt();
            int ml_marks = s1.nextInt();

            a[i] = new Student(); // Create a new instance of Student for each loop iteration
            a[i].initialize(usn, name, phy_marks, coa_marks, math_marks, dbms_marks, dsa_marks, ml_marks);
            a[i].calculate();
        }
    }
}
