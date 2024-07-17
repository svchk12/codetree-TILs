import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();
            student[i] = new Student(name, kor, eng, mat);
        }

        Arrays.sort(student); 

        for(int i = 0; i < n; i++){
            System.out.println(student[i].name + " " + student[i].kor + " " + student[i].eng + " " + student[i].mat);
        }

    }

}

class Student implements Comparable<Student>{

    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    @Override
    public int compareTo(Student student){
        if(this.kor == student.kor){
            if(this.eng == student.eng){
                return student.mat - this.mat;
            }else{
                return student.eng - this.eng;
            }
        }
        return student.kor - this.kor;
    }
}