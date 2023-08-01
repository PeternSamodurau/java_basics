public class Operator  {
    public String nameOperator;
    public  Integer salaryOperator;

    public Operator() {
        this.nameOperator = getName();
        this.salaryOperator = getSalary();
    }
    public int getSalary() {
        salaryOperator = 5000 + (int) (Math.random() * 1000);
        return salaryOperator;
    }
    public String getName() {
        return  Names.randomNames().toString();
    }

    @Override
    public String toString() {
        return getClass().getName()+ " " + nameOperator + " - " + salaryOperator  + "\n";
    }
}
