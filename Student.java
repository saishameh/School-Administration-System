import java.util.Scanner;

public class Student {

    private String id;
    private String name;
    private String email;
    private int phoneNumber;
    private int feesPaid;
    private String courses = null;
    private int tuition = 0;
    private int costOne = 600;

    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * 
     * @param string id for the student: unique.
     * @param name   name of the student.
     * @param grade  grade of the student.
     */
    public Student(String id, String name, String email, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.feesPaid = 0;
        this.tuition = 2000;

    }

    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        
    }

    public void enroll() {
        do 
        {
            System.out.println("Enter course to enroll: ");
            Scanner in = new Scanner(System.in);
            String course = "";
            course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuition = tuition + costOne;
            }
            else {
                break;
            }
        }
            while (1 != 0);
        System.out.println("ENROLLED IN: " + courses);

        
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
        tuition -= fees;
        System.out.println("Remaining tuition fees is: " + getTuition()); 
    }

    public void getCourses(){
        System.out.println(courses);
    }

    /**
     *
     * @return id of the student.
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    public int getPhoneNum() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getTuition() {
        return tuition;
    }


    public void print() {
        System.out.printf("\nId: %-5s Name: %-9s Email: %-20s Phone Number: %d", id, name, email, phoneNumber);
    }
}