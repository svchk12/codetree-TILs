import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            student[i] = new Student(height, weight, i+1);
        }

        Arrays.sort(student); 

        for(int i = 0; i < n; i++){
            System.out.println(student[i].height + " " + student[i].weight + " " + student[i].studentNo);
        }
    }
}

class Student implements Comparable<Student>{
    int studentNo;
    int height;
    int weight;

    public Student(int height, int weight,int studentNo){
        this.studentNo = studentNo;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            if(this.weight == student.weight){
                return this.studentNo - student.studentNo;
            }else{
                return student.weight - this.weight;
            }
        }
        return student.height - this.height;
    }
}