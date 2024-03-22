public class HomeWork {
    public static void printName(String name) {
        System.out.println("이름: " + name);
    }

    public static void printDepartment(String department) {
        System.out.println("학과: " + department);
    }

    public static void printGrade(int grade) {
        System.out.println("학년: " + grade);
    }

    public static void printStudentID(String studentID) {
        System.out.println("학번: " + studentID);
    }

    public static void main(String[] args) {
        String name = "정예림";
        String department = "컴퓨터공학과";
        int grade = 3;
        String studentID = "2251029";

        printName(name);
        printDepartment(department);
        printGrade(grade);
        printStudentID(studentID);
    }
}
