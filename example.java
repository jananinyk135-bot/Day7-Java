class example{
private String name;
private int rollno;
public void setname(String name){
this.name=name;
}
public void setrollno(int rollno){
this.rollno=rollno;
}
public String getname(){
return name;
}
public int getrollno(){
return rollno;
}
public static void main(String[] args){
example e = new example();
e.setname("Janani");
e.setrollno(101);
System.out.println(e.getname());
System.out.println(e.getrollno());
}}