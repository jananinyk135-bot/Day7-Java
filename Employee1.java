class Employee1{
private int salary;
public void setsalary(int salary){
this.salary=salary;
}
public int getsalary(){
return salary;
}
public static void main(String[] args){
Employee1 e = new Employee1();
e.setsalary(50000);
System.out.println(e.getsalary());
}}