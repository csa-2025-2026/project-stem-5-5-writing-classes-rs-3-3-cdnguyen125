public class Person
{
  private String fName;
  private String lName;
  private int age;
  private int SSN;

  public Person(String firstN, String lastN, int inAge, int inSSN)
  {
    fName = firstN;
    lName = lastN;
    age = inAge;
    SSN = inSSN;
  }

  public String toString()
  {
    return "SSN: " + SSN + "\n\tName: " + fName + " " + lName + "\n\tAge: " + age;
  }
}