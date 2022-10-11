import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Many teachers, many students.
 * Implements teachers and student
 * using an ArrayList.
 */
public class School {

    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Parent> parents = new ArrayList<Parent>();
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    private int teacherID = 500;
    private int studentID = 900;
    private int parentID = 700;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String errMsg = null;

    /**
     * new school object is created.
     * 
     * @param teachers list of teachers in the school.
     * @param students list of students int the school.
     */
    public School() {

        teachers.add(new Teacher(generateTeacherId(), "Kelly Mah", "kmah@school.ca", 647538741, 5000));
        teachers.add(new Teacher(generateTeacherId(), "Coraline Smith", "csmith@school.ca", 647987335, 7000));
        teachers.add(new Teacher(generateTeacherId(), "Chris Hattfield", "chattfield@school.ca", 647024785, 6000));
        teachers.add(new Teacher(generateTeacherId(), "Ambrina Thomas", "athomas@school.ca", 647296788, 7000));

        students.add(new Student(generateStudentId(), "Eren Yeager", "eyeager@school.ca", 416000794));
        students.add(new Student(generateStudentId(), "Mikasa Ackerman", "mackerman@school.ca", 168889632));
        students.add(new Student(generateStudentId(), "Giyuu Tomioka", "giyuutomioka@school.ca", 416332569));
        students.add(new Student(generateStudentId(), "Zeke Yeager", "eyeager@school.ca", 416000784));

        parents.add(new Parent(generateStudentId(), "Eren Yeager", "eyeager@school.ca", 416000794, generateParentId(),
                "Grisha Yeager", "gyeager@gmail.com", 416968554, "single"));
        parents.add(new Parent(generateStudentId(), "Mikasa Ackerman", "mackerman@school.ca", 416888632,
                generateParentId(), "Levi Ackerman", "lackerman@gmail.com", 416655122, "Married"));
        parents.add(new Parent(generateStudentId(), "Giyuu Tomioka", "giyuutomioka@school.ca", 416332569,
                generateParentId(), "Tanji Tomioka", "jtomioka@gmail.com", 416585122, "Single"));
        parents.add(new Parent(generateStudentId(), "Zeke Yeager", "eyeager@school.ca", 416000784, generateParentId(),
                "Misha Yeager", "@gmail.com", 416982112, "Married"));
    }

    private String generateParentId() {
        return "" + parentID++;
    }

    private String generateStudentId() {
        return "" + studentID++;
    }

    private String generateTeacherId() {
        return "" + teacherID++;
    }

    public String getErrorMessage() {
        return errMsg;
    }

    public void printAllStudents() {
        for (Student s : students)
            s.print();
    }

    public void printAllTeachers() {
        for (Teacher t : teachers)
            t.print();
    }

    public void printAllParents() {
        for (Parent p : parents)
            p.print();
    }

    public boolean createStudent(String name, String email, int phoneNumber) {
        // Check to ensure name is valid
        if (name == null || name.equals("")) {
            errMsg = "Invalid Student Name " + name;
            return false;
        }
        // Check to ensure address is valid
        if (email == null || email.equals("")) {
            errMsg = "Invalid Student Email " + email;
            return false;
        }
        Student stu = new Student(generateStudentId(), name, email, phoneNumber);
        students.add(stu);
        // System.out.println("Enter Parent Details");
        return true;
    }

    public boolean createTeacher(String name, String email, int phoneNumber) {
        // Check to ensure name is valid
        if (name == null || name.equals("")) {
            errMsg = "Invalid Teacher Name " + name;
            return false;
        }
        // Check to ensure address is valid
        if (email == null || email.equals("")) {
            errMsg = "Invalid Teacher Email " + email;
            return false;
        }
        if (phoneNumber == 0) {
            errMsg = "Invalid Teacher number " + phoneNumber;
            return false;
        }
        Teacher teacher = new Teacher(generateTeacherId(), name, email, phoneNumber);
        teachers.add(teacher);
        return true;
    }

  
    public String enrollStudent(String name, String id){
        Student stud = null;
        boolean Sexists = false;
        for (Student s : students)
        {
          if (s.getId().equals(id))
          {
              Sexists = true;
              stud = s;
          }
        }
        if (Sexists == false)
        {
          errMsg = "Student " + id + " Not Found";
          return null;
        }
        
        
        boolean sName = false;
        for (Student student : students)
        {
          if (student.getName().equals(name))
          {
            sName = true;
          }
        }
        if (sName == false)
        {
          errMsg = "Student " + name + " Not Found";
          return null;
        }
        stud.enroll();
        return "Done";

    }

    public String totalfees(String name, String id){
        Student stud = null;
        boolean Sexists = false;
        for (Student s : students)
        {
          if (s.getId().equals(id))
          {
              Sexists = true;
              stud = s;
          }
        }
        if (Sexists == false)
        {
          errMsg = "Student " + id + " Not Found";
          return null;
        }
        
        Student stud2 = null;
        boolean sName = false;
        for (Student student : students)
        {
          if (student.getName().equals(name))
          {
            sName = true;
            stud2 = student;
          }
        }
        if (sName == false)
        {
          errMsg = "Student " + name + " Not Found";
          return null;
        }
        System.out.println("Total tuition fee for " + name + " is "+  stud2.getTuition());
        return "Done";

    }

    public String payfees(String name, String id, int fees){
        Student stud = null;
        boolean Sexists = false;
        for (Student s : students)
        {
          if (s.getId().equals(id))
          {
              Sexists = true;
              stud = s;
          }
        }
        if (Sexists == false)
        {
          errMsg = "Student " + id + " Not Found";
          return null;
        }
        
        Student stud2 = null;
        boolean sName = false;
        for (Student student : students)
        {
          if (student.getName().equals(name))
          {
            sName = true;
            stud2 = student;
          }
        }
        if (sName == false)
        {
          errMsg = "Student " + name + " Not Found";
          return null;
        }

        stud2.payFees(fees);
        return "Done";

    }

    public String totalCourses(String name, String id){
        Student stud = null;
        boolean Sexists = false;
        for (Student s : students)
        {
          if (s.getId().equals(id))
          {
              Sexists = true;
              stud = s;
          }
        }
        if (Sexists == false)
        {
          errMsg = "Student " + id + " Not Found";
          return null;
        }
        
        Student stud2 = null;
        boolean sName = false;
        for (Student student : students)
        {
          if (student.getName().equals(name))
          {
            sName = true;
            stud2 = student;
          }
        }
        if (sName == false)
        {
          errMsg = "Student " + name + " Not Found";
          return null;
        }

        stud2.getCourses();
        return "Done";
    }

    /**
     *
     * @return the list of teachers int the school.
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    

    /**
     *
     * @return the list of students in the school.
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * 
     * @param MoneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     * 
     * @param moneySpent the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}