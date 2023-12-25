public class CEO extends Employee implements ForCEO{
    @Override
    public void addBonus(){
        System.out.println("Adding bonus at the end of the year...");
    }
    public void makeDecisions(){
        System.out.println("Making decisions...");
    }
	public void addStocks(){
        System.out.println("Gettings shares of the company as bonus...");
    }
    public void show(){
        salary();
        addBonus();
        makeDecisions();
        addStocks();
    }
}
