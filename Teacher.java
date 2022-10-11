// package school.management.system;

/**
 * Created by Rakshith on 4/3/2017.
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */
public class Teacher {

    private String id;
    private String name;
    private String email;
    private int phoneNumber;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     * @param string id for the teacher.
     * @param name name of the teacher.
     * @param string3 salary of the teacher.
     */
    public Teacher(String id, String name, String email, int phoneNumber, int salary){
        this.id=id;
        this.name=name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public Teacher(String id, String name, String email, int phoneNumber){
        this.id=id;
        this.name=name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = 0;
    }



    /**
     *
     * @return the id of the teacher.
     */
    public String getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher.
     */
    public String getName(){
        return name;
    }


    public int getPhoneNum(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    /**
     * set the salary.
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary(){
        return  salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    
    public void print() {
		System.out.printf("\nId: %-5s Name: %-9s Email: %-20s Phone Number: %d", id, name, email, phoneNumber);
	}
}