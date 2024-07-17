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
            int height = sc.nextInt();
            int weight = sc.nextInt();

            student[i] = new Student(name, height, weight);
        }

        Arrays.sort(student);

        for(int i = 0; i < n; i++){
            System.out.println(student[i].name + " " + student[i].height + " " + student[i].weight);
        }
    }
}


class Student implements Comparable<Student>{

    String name;
    int height;
    int weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(student.height == this.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }
    
}