package inheritance;

public class Employee extends Person{
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String employeeId;
    private String title;

    public Employee(){
/*        Если в родительском классе конструктор без входных параметров,
            то можно без супер
          Если с входными, то надо супер
            call constructor in Person with name
*/        super("Michael");
        System.out.println("In Employee default constructor");
    }
}
