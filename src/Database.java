import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Database {
    private Employee emp = new Employee();
    private Client cl = new Client();
    private Scanner sc = new Scanner(System.in);
    HashMap<Long,Employee> employee = new HashMap<>();
    HashMap<Long,Client> client = new HashMap<>();



    public void addEmployee(){
        System.out.println("Enter employee id: ");
        emp.setId(sc.nextLong());
        System.out.println("Enter employee number: ");
        emp.setEmployeeNumber(sc.nextLong());
        System.out.println("Enter employee name: ");
        emp.setName(sc.next());
        System.out.println("Enter employee surname: ");
        emp.setSurname(sc.next());
        System.out.println("Enter employee salary: ");
        emp.setSalary(sc.nextDouble());
        System.out.println("Enter employee bonus: ");
        emp.setBonus(new Bonus(emp.getId(), sc.nextDouble()));

        employee.put(emp.getId(), new Employee(emp.getId(), emp.getEmployeeNumber(), emp.getName(), emp.getSurname(), emp.getSalary(), emp.getBonus()));

    }
    public void deleteEmployee(){
        System.out.println("Enter employee ID to delete:");
        Long x = sc.nextLong();
        if(employee.get(x)==null){
            System.out.println("Employee doesn't exists in database.");
        }
        else {
            employee.remove(x);
        }



    }
    public void printEmployee(){
        System.out.println("Enter employee number:");
        Long x = sc.nextLong();
        if(employee.get(x)==null){
            System.out.println("Employee doesn't exists in database.");
        }
        else {

            System.out.println("Employee number: ");
            System.out.println(employee.get(x).getEmployeeNumber());

            System.out.println("Name:");
            System.out.println(employee.get(x).getName());

            System.out.println("Surname:");
            System.out.println(employee.get(x).getSurname());

            System.out.println("Salary:");
            System.out.println(employee.get(x).getSalary());

            System.out.println("Bonus:");
            System.out.println(employee.get(x).getBonus().getSalaryBonus());
        }

    }


    public void addClient(){
        System.out.println("Enter client id: ");
        cl.setId(sc.nextLong());
        System.out.println("Enter client name: ");
        cl.setName(sc.next());
        System.out.println("Enter client surname: ");
        cl.setSurname(sc.next());
        System.out.println("Enter client phone number: ");
        cl.setPhoneNumber(sc.nextDouble());
        System.out.println("Enter client email: ");
        cl.setEmail(sc.next());
        System.out.println("Enter client city: ");
        cl.setCity(sc.next());
        System.out.println("Enter client account number: ");
        cl.setAccount(new BankAccount(cl.getId(), sc.nextLong(), 0D, new Date()));


        client.put(cl.getId(), new Client(cl.getId(), cl.getName(), cl.getSurname(), cl.getPhoneNumber(), cl.getEmail(), cl.getCity(),cl.getAccount()));

    }
    public void deleteClient(){
        System.out.println("Enter client ID to delete:");
        Long x = sc.nextLong();
        if(client.get(x)==null){
            System.out.println("Client doesn't exists in database.");
        }
        else {
            client.remove(x);
        }


    }
    public void printClient(){
        System.out.println("Enter client ID number:");
        Long x = sc.nextLong();
        if(client.get(x)==null){
            System.out.println("Client doesn't exists in database.");
        }
        else {

            System.out.println("Name:");
            System.out.println(client.get(x).getName());
            System.out.println("Surname:");
            System.out.println(client.get(x).getSurname());
            System.out.println("Phone number:");
            System.out.println(client.get(x).getPhoneNumber());
            System.out.println("Email:");
            System.out.println(client.get(x).getEmail());
            System.out.println("City:");
            System.out.println(client.get(x).getCity());
            System.out.println("Account number:");
            System.out.println(client.get(x).getAccount().getAccountNumber());
            System.out.println("Account balance:");
            System.out.println(client.get(x).getAccount().getAccountBalance());
            System.out.println("Account creation date:");
            System.out.println(client.get(x).getAccount().getCreationDate());
        }


    }

}
