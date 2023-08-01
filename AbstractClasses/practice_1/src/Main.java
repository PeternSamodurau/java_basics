import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employeeList.add(new Operator());
            employeeList.add(new Manager());
        }
        System.out.println(employeeList);
        employeeList.sort(new NameSalaryComparator());
        System.out.println(employeeList);

    }
}
