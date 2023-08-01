public class Manager {
    public String nameManager;
    public Integer salaryManager;

    public Manager() {
        this.nameManager = getName();
        this.salaryManager = getSalary();
    }
    public int getSalary() {
        salaryManager = 15000 + (int) (Math.random() * 1000);
        return salaryManager;
    }
    public String getName() {
        return Names.randomNames().toString();
    }

    @Override
    public String toString() {
        return getClass().getName()+ " " + nameManager + " - " + salaryManager + "\n";
    }
}