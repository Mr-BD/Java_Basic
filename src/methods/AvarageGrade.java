package methods;

public class AvarageGrade {

    public static String avarageGrade(String name, double grade){
        return "The student " + name + " graduated with average grade" + grade;

    }

    public static void main(String[] args) {
        System.out.println(avarageGrade("Ivan", 5.5));
    }
}
