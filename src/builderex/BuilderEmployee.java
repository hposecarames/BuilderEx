
package builderex;

/**
 *
 * @author Hector Pose Carames
 */
public class BuilderEmployee {

   private String lastName;
   private String middleName="";
   private String firstName;
   private long id;
   private int birthYear;
   private int birthMonth;
   private int birthDate;
   private int hireYear;
   private int hireMonth;
   private int hireDate;

  public BuilderEmployee(String firstName, long id){
      this.firstName = firstName;
      this.id = id;
  }


    public BuilderEmployee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    public BuilderEmployee setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    
    public BuilderEmployee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    
    public BuilderEmployee setId(long id) {
        this.id = id;
        return this;
    }

    public BuilderEmployee setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public BuilderEmployee setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public BuilderEmployee setBirthDate(int birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public BuilderEmployee setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }

    public BuilderEmployee setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
        return this;
    }

    public BuilderEmployee setHireDate(int hireDate) {
        this.hireDate = hireDate;
        return this;
    }
   public Employee createEmployee(){
    return new Employee(lastName, middleName, firstName, id, birthYear, birthMonth, birthDate, hireYear, hireMonth, hireDate);
        
    }
}
