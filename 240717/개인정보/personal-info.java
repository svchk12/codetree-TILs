import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[5];

        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            student[i] = new Student(name, height, weight);
        }

        Arrays.sort(student, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { 
                return a.name.compareToIgnoreCase(b.name);
            }
        });

        System.out.println("name");
        for(int i = 0; i < 5; i++){
            System.out.println(student[i].name + " " + student[i].height + " " + student[i].weight);
        }
        System.out.println("");
        Arrays.sort(student, (a, b) -> b.height - a.height);
        System.out.println("height");
        for(int i = 0; i < 5; i++){
            System.out.println(student[i].name + " " + student[i].height + " " + student[i].weight);
        }
    }
}

class Student{ 
//implements Comparable<Student>{
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // @Override
    // public int compareTo(Student student){
    //     return this.name - student.name;
    // }
}