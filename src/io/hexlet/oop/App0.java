package io.hexlet.oop;

public class App0 {
    public static void main(String[] args) {
        App0.getGrade(95, 90, 93);
        App0.getGrade(100, 85, 96);
        App0.getGrade(92, 93, 94);
        App0.getGrade(100, 100, 100);
        App0.getGrade(70, 70, 100);
        App0.getGrade(82, 85, 87);
        App0.getGrade(84, 79, 85);
        App0.getGrade(70, 70, 70);
        App0.getGrade(75, 70, 79);
        App0.getGrade(60, 82, 76);
        App0.getGrade(65, 70, 59);
        App0.getGrade(66, 62, 68);
        App0.getGrade(58, 62, 70);
        App0.getGrade(44, 55, 52);
        App0.getGrade(48, 55, 52);
        App0.getGrade(58, 59, 60);
        App0.getGrade(0, 0, 0);

    }

    public static char getGrade(int i, int i1, int i2) {
        int average = (i + i1 + i2) / 3;
        if (90 <= average && average < 100) {
            return 'A';
        } else if (80 <= average && average < 90) {
            return 'B';
        } else if (70 <= average && average < 80) {
            return 'C';
        } else if (60 <= average && average < 70) {
            return 'D';
        } else if (0 <= average && average < 60) {
            return 'F';
        }
        return 0;
    }
}
