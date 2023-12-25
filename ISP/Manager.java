public class Manager extends Employee implements ForManager{
    @Override
    public void hire(){
        System.out.println("hire...");
    }
	public void train(){
        System.out.println("train...");
    }
    public void addBonus(){
        System.out.println("Adding bonus at the end of the year...");
    }

}
