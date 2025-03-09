package OOPs;


//Create an Employee class with private attributes id, salary, and position.
//Implement getter and setter methods, ensuring salary cannot be set to a negative value.
//Add a method giveRaise(double percentage) to increase salary by a given percentage.

class Employee {
    private int id;
    private double salary;
    private String position;

    Employee(int id, double salary, String position) {
        this.id = id;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition(){
        return position;
    }

    public void Salary() {
        if (salary < 0) {
            System.out.println("Salary cannot be less than 0");
        }
        System.out.println("Your salary is: " + salary);
    }


    public void giveRaise(double percentage) {
    if(percentage < 0) {
        System.out.println("No hike");
    } else {

        double hike = (salary * percentage) / 100;
        salary += hike;
        System.out.println("Hike percentage is: " + percentage);
        System.out.println("Salary after hike: " + salary);

    }
    }

}



public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee(1,45000,"Manager");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Current Salary: $" + emp.getSalary());

        emp.giveRaise(20);
    }

}
