public class Employee implements ForAllEmployee{
    @Override
    public void salary(){
        System.out.println("Getting the salary...");
    }
    public void show(){
        salary();
    }
}
