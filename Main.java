import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    // Problem 1 
    /* 
    System.out.print("enter person's first name: ");
    String first = scan.nextLine();
    System.out.print("enter person's last name: ");
    String last = scan.nextLine();
    System.out.print("enter person's age: ");
    int pAge = scan.nextInt();
    System.out.print("enter person's SSN: ");
    int pSSN = scan.nextInt(); 
  
    Person p1 = new Person(first, last, pAge, pSSN);
    System.out.println("\n" + p1); */

    // Problem 2
    System.out.print("\nmax oven temperature: ");
    int oMaxTemp = scan.nextInt();
    System.out.print("starting oven temperature: ");
    int oStartTemp = scan.nextInt();
    
    Oven o1 = new Oven(oMaxTemp, oStartTemp);
    System.out.println(o1);

    System.out.println("\nto preheat oven enter \"p\", to turn over off enter \"o\", to restart enter \"r\", to quit enter \"q\"");
    scan.nextLine();
    String decision = scan.nextLine();

    while (!decision.equals("q"))
    {
      if (decision.equals("p"))
      {
        System.out.println("what temp should oven preheat to?");
        int preheatTemp = scan.nextInt();
        o1.preheat(preheatTemp);
        System.out.println("\n" + o1);
      }
   }
}
