public class Manager implements Employee {
    public int managerId;
    public String nameManager;
    public int managerSalary;
    public double amountMoneyEarned;
    public int fixSalary = 10000;
    static double bonus = 0.05;
    static final double MIN_AMOUNT_MONEY_EARNED = 115000.0;
    static final double MAX_AMOUNT_MONEY_EARNED = 140000.0;

    public Manager() {
        this.managerId = hashCode();
        this.nameManager = getClass().getName();
        this.managerSalary = getMonthSalary();
    }
    @Override
    public int getMonthSalary() {
        amountMoneyEarned = MIN_AMOUNT_MONEY_EARNED +
                (int) (Math.random() *
                        (MAX_AMOUNT_MONEY_EARNED - MIN_AMOUNT_MONEY_EARNED + 1));
        return  managerSalary = fixSalary + (int) (Math.round(amountMoneyEarned * bonus));

    }

    @Override
    public int returnSalary() {
        return managerSalary;
    }

    @Override
    public String toString() {

        return managerId + " - " + nameManager + " - " + managerSalary + "\n";
    }
}

