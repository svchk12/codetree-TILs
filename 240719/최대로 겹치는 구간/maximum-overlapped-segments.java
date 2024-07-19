import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Section> sections = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            Section section = new Section(start, end);
            sections.add(section);
        }

        int minStart = sections.stream().mapToInt(Section::start).min().getAsInt();
        int maxEnd = sections.stream().mapToInt(Section::end).max().getAsInt();

        int answer = -1;
        for (int value = minStart; value < maxEnd; value++) {
            int count = 0;
            for (Section section : sections) {
                if (section.isContain(value)) {
                    count++;
                }
            }
            
            if (count > answer) {
                answer = count;
            }
        }

        System.out.print(answer);
    }
}

class Section {
    int start;
    int end;

    Section(int start, int end) {
        this.start = start;
        this.end = end;
    }

    boolean isContain(int value) {
        return start < value && value < end;
    }

    int start() {
        return start;
    }

    int end() {
        return end;
    }
}