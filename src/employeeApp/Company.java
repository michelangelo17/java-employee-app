package employeeApp;

public class Company {

  private static int maxId = 0;

  private int id;
  private String name;
  private int debt;

  public Company(String name, int debt) {
    maxId++;
    id = maxId;
    setName(name);
    setDebt(debt);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDebt() {
    return debt;
  }

  public void setDebt(int debt) {
    this.debt = debt;
  }

  @Override
  public String toString() {
    return "Company: " + name + "\nDebt: $" + debt; 
  }
}