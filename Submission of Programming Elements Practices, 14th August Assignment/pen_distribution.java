public class pen_distribution {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int pps = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + pps + " and the remaining pen not distributed is " + remaining);
    }   
}