public class Parent extends Student{

    private String parentEmail;
    private String parentName;
    private String parentId;
    private int parentPhoneNumber;
    private String status;



    public Parent(String id, String name, String email, int phoneNumber, String parentId, String parentname, String parentemail, int parentPhoneNumber, String status) {
        super(id, name, email, phoneNumber);
        this.parentEmail = parentemail;
        this.parentId = parentId;
        this.parentName = parentname;
        this.parentPhoneNumber = parentPhoneNumber;
        this.status = status;

    }


    public String getParentId() {
        return parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public int getPhoneNum(){
        return parentPhoneNumber;
    }

    public String getEmail(){
        return parentEmail;
    }

    public String getStatus(){
        return status;
    }

    public void print() {
        super.print();
		System.out.printf("\nId: %-5s Name: %-9s Email: %-20s Number: %d", parentId, parentName, parentEmail, parentPhoneNumber);
	}
    
}
