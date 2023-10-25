import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       Person prsn = new Person();
       
       System.out.println("------Hello!------");
       System.out.println("Enter your Personal Information");
     
       
       System.out.println("\nEnter your First Name: ");
       prsn.setFirstName(sc.nextLine());

       System.out.println("Enter your Middle Name: ");
       prsn.setMiddleName(sc.nextLine());

       System.out.println("Enter your Last Name: ");
       prsn.setLastName(sc.nextLine());

       System.out.println("Enter your Age: ");
       prsn.setAge(sc.nextInt());
       
       sc.nextLine();

       System.out.println("Enter your Birthday: ");
       prsn.setBirthday(sc.nextLine());

       System.out.println("Enter your Address: ");
       prsn.setAddress(sc.nextLine());
       
       System.out.println("Personal Information:");

       System.out.println("First Name: "+ prsn.getFirstName());
       System.out.println("Middle Name: "+ prsn.getMiddleName());
       System.out.println("Last Name: "+ prsn.getLastName());
       System.out.println("Age: "+ prsn.getAge());
       System.out.println("Birthday: "+ prsn.getBirthday());
       System.out.println("Address: "+ prsn.getAddress());

   
   
   
   
   
   }

}