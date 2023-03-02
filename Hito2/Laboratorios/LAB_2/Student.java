package ejercicio;

public class Student {
    private String fullname;
    private String lastname;
    private int age;

    public Student(String nom, String ap, int age)
    {
        this.fullname = nom;
        this.lastname = ap;
        this.age = age;
    }
    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }
    public String getFullName()
    {
        return this.fullname;
    }
    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
