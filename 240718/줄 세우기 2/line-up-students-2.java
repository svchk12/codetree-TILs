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
            System.out.println(student[i].height + " " + student[i].weight + " " + student[i].idx);
        }
        
    }
}

class Student implements Comparable<Student>{

    int height;
    int weight;
    int idx;

    public Student(int height, int weight, int idx){
        this.height = height;
        this.weight = weight;
        this.idx = idx;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }
}