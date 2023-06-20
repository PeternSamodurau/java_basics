public class TopManager implements Employee {
    public int topManagerId;
    public String nameTopManager;
    public int topManagerSalary;
    public int fixSalary = 20000;

    public TopManager() {
        this.topManagerId = hashCode();
        this.nameTopManager = getClass().getName();
        this.topManagerSalary = getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        if(Company.getIncome() > 10_000_000) {
            topManagerSalary = (int) ( fixSalary + fixSalary* 1.5);
            return topManagerSalary;
        }
        else {
            topManagerSalary = fixSalary;
            return topManagerSalary;
        }
    }

    @Override
    public int returnSalary() {
        return topManagerSalary;
    }

    @Override
    public String toString() {

        return topManagerId + " - " + nameTopManager + " - " + topManagerSalary + "\n";
    }
}

