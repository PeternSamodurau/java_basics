import java.util.ArrayList;
import java.util.List;

public class Company {
    static int income;
    static int count;
    static List<Employee> employee = new ArrayList<>();

    public List<Employee> getEmployee() {
        return employee;
    }

    public Company() {
        count++;
    }

    public static void setIncome(Company company, int income) {
        Company.income = income;
    }

    public static int getIncome() {
        return income;
    }

    public void hire(Employee employee) {
        Company.employee.add(employee);
    }

    public void fire(Employee employee) {
        Company.employee.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> highSalary = new ArrayList<>(employee);
        highSalary.sort(new EmployeeComparator());
        return highSalary.subList(highSalary.size()-count, highSalary.size());
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> lowerSalary = new ArrayList<>(employee);
        lowerSalary.sort(new EmployeeComparator());

        return lowerSalary.subList(0, count);
    }

    public String getCount(List<Employee> employee) {
        int operatorCount = 0;
        for (Employee oCount : employee) {
            if (oCount.getClass().getName().matches(Operator.class.getName())) {
                operatorCount++;
            }
        }
        int managerCount = 0;
        for (Employee mCount : employee) {
            if (mCount.getClass().getName().matches(Manager.class.getName())) {
                managerCount++;
            }
        }

        int topmanagerCount = 0;
        for (Employee tmCount : employee) {
            if (tmCount.getClass().getName().matches(TopManager.class.getName())) {
                topmanagerCount++;
            }
        }

        return "Количество сотрудников в компани" + "  " + " - " + employee.size() + "\n"
                + "Из них Операторов" + " - " + operatorCount + "\n"
                + "Из них Менеджеров" + " - " + managerCount + "\n"
                + "Из них Топменеджеров" + " - " + topmanagerCount;
    }

}
