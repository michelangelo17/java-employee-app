package employeeApp;

public class Main {

  private static void workWithData() {
    Healthplan h1 = new Healthplan("My Health 1");
    Healthplan h2 = new Healthplan("My Health 2");

    Company c1 = new Company("Company A", 100);
    Company c2 = new Company("Company B", 200);

    Employee e1 = new Employee("Steve", "Green", 45000, true, c1.getId(), h1.getId());
    Employee e2 = new Employee("May", "Ford", 80000, true, c1.getId(), h2.getId());
    Employee e3 = new Employee("John", "Jones", 80000, false, c2.getId(), h1.getId());
  
    System.out.println(c1);

    e1.setSalary(e1.getSalary() + 500);
    System.out.println(e1.getFname() + " " + e1.getSalary());
  }

  public static void main(String[] args) {
    workWithData();
  }
}