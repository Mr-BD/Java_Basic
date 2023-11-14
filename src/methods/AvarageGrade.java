package methods;
//Да се напише метод, който приема два параметъра едния името на ученик а другия годишната оценка.
// Нека връща като резултат текст : ""The student ...... graduated with average grade...... .
public class AvarageGrade {

    public static String avarageGrade(String name, double grade){
        return "The student " + name + " graduated with average grade" + grade;

    }

    public static void main(String[] args) {
        System.out.println(avarageGrade("Ivan", 5.5));
    }
}
