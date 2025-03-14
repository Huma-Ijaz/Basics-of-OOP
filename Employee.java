class employee{
    protected String name;
    protected int id;
    protected String department;

   employee(){
        name = "null";
        id = 0;
        department = "null";
    }

    employee(String n, int i, String d){
        name = n;
        id = i;
        department = d;
    }

    void setName(String na){
        name = na;
    }
    String getName(String na){
        return na;
    }

    void setid(int D){
        id = D;
    }
     int getid(int D){
        return D;
    }
    void setDepartment(String De){
        department = De;
    }
    String getDepartment(String De){
        return De;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}

class s_developer extends employee{
    private String designation;

    s_developer(){
        designation = "null";
    }
    s_developer(String f, int g, String h,String d){
        super(f,g,h);
        designation= d;
    }
    void setDesignation(String d){
        designation = d;
    }
    String getDesignation(String D){
        return D;
    }

    void Display(){
        super.display();
        System.out.println("Designation:"  + designation);

    }
}

class j_developer extends s_developer{
    private String language;

    j_developer(){
        language = "null";
    }
    j_developer(String f, int g, String h,String w,String a)
    {
       super(f,g,h,w);
        language = a;
    }
    void setLanguage(String L){
        language = L;
    }
    String getLanguage(String L){
        return L;
    }

    void Display(){
        super.display();
        System.out.println("Language:"  + language);
    }
}

class manager extends employee{


}


public class Employee {
    public static void main(String []args){
    j_developer Ali=new j_developer();
        Ali.Display();
    }
}
