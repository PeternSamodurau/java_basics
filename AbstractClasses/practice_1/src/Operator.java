public class Operator implements Employee {
    public int operatorId;
    public String nameOperator;
    public int operatorSalary;

    public Operator() {
        this.operatorId = hashCode();
        this.nameOperator = getClass().getName();
        this.operatorSalary = getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        operatorSalary = 10000;
        return operatorSalary;
    }

    @Override
    public int returnSalary() {
        return operatorSalary;
    }

    @Override
    public String toString() {

        return operatorId + " - " + nameOperator + " - " + operatorSalary + "\n";
    }
}




