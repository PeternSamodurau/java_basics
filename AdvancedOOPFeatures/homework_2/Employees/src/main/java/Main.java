import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        List<Employee> employee2017 = new ArrayList<>();
        staff.forEach(employee -> {
            String dateFormat = simpleDateFormat.format(employee.getWorkStart());
            String sub = dateFormat.substring(dateFormat.length() - 4);
            int sub1 = Integer.parseInt(sub);
            if (sub1 == year) {
                employee2017.add(employee);
            }
        });
        return employee2017.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).get(0);
    }
}