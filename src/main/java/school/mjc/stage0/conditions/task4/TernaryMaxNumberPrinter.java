package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println (first);
        } else if (second > first && second > third) {
            System.out.println (second);
        } else if (third > first && third > second) {
            System.out.println(third);
        } else if (first == second && second > third) {
            System.out.println(first);
        } else if (second == third && second > first) {
            System.out.println(second);
        } else if (first == third && first > second) {
            System.out.println(first);
        }
    }
}
