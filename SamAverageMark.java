public class SamAverageMark {
    public static void main(String[] args) {
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        int totalMarks = mathsMark + physicsMark + chemistryMark;
        int numberOfSubjects = 3;

        double averageMark = totalMarks / (double) numberOfSubjects;

        System.out.println("Sam’s average mark in PCM is " + averageMark);
    }
}
