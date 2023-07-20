import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Company.setIncome(company, 15_000_000);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Для приема работников введите - h");
            System.out.println("Для увольнения работников введите - f");
            System.out.println("Для вывода самых низких/высоких зарплат введите - s");
            switch (scanner.nextLine()) {
                case "h" -> hireEmployees(company);
                case "f" -> fireEmployees(company);
                case "s" -> {
                    System.out.println("Введите количество сотрудников с самыми высокими/низкими з/п" + "\n" +
                            "Количество сотрудников в компании" + " - " + company.getEmployee().size());
                    Scanner scanner1 = new Scanner(System.in);
                    int temporary = scanner1.nextInt();
                    if (company.getEmployee().size() >= temporary) {
                        System.out.println("Самые высокие зарплаты" + "\n" + company.getTopSalaryStaff(temporary));
                        System.out.println("Самые низкие зарплаты" + "\n" + company.getLowestSalaryStaff(temporary));
                    } else {
                        System.out.println("В компании нет столбко сотрудников!");
                    }
                }
                default -> System.out.println("Неверный ввод,проверьте язык/регистр!");
            }
        }
    }

    public static void hireEmployees(Company company) {
        System.out.println("Введите количество менеджеров,которое хотите нанять");
        Scanner scanner = new Scanner(System.in);
        int managerCount = scanner.nextInt();
        for (int i = 0; i < managerCount; i++) {
            Employee manager = new Manager();
            company.hire(manager);
        }
        System.out.println(company.getEmployee());
        System.out.println(company.getCount((company.getEmployee())));

        System.out.println("Введите количество операторов,которое хотите нанять");
        int operatorCount = scanner.nextInt();
        for (int i = 0; i < operatorCount; i++) {
            Employee operator = new Operator();
            company.hire(operator);
        }

        System.out.println(company.getCount((company.getEmployee())));
        System.out.println(company.getEmployee());

        System.out.println("Введите количество топ-менеджеров,которое хотите нанять");
        int topManagerCount = scanner.nextInt();
        for (int i = 0; i < topManagerCount; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }

        System.out.println(company.getCount((company.getEmployee())));
        System.out.println(company.getEmployee());
    }

    public static void fireEmployees(Company company) {
        System.out.println("Введите количество операторов,которое хотите уволить");
        Scanner scanner = new Scanner(System.in);
        int operatorCount = scanner.nextInt();
        for (int j = 0; j < operatorCount; j++) {
            for (int i = 0; i < company.getEmployee().size(); i++) {
                if (company.getEmployee().get(i).toString().contains(Operator.class.getName())) {
                    Employee eFire = company.getEmployee().get(i);
                    company.fire(eFire);
                    break;
                }
            }
        }


        System.out.println(company.getCount((company.getEmployee())));
        System.out.println(company.getEmployee());

        System.out.println("Введите количество менеджеров,которое хотите уволить");
        Scanner scanner1 = new Scanner(System.in);
        int managerCount = scanner1.nextInt();
        for (int j = 0; j < managerCount; j++) {
            for (int i = 0; i < company.getEmployee().size(); i++) {
                if (company.getEmployee().get(i).toString().contains(Manager.class.getName())) {
                    Employee eFire = company.getEmployee().get(i);
                    company.fire(eFire);
                    break;
                }
            }
        }

        System.out.println(company.getCount((company.getEmployee())));
        System.out.println(company.getEmployee());

        System.out.println("Введите количество топменеджеров,которое хотите уволить");
        Scanner scanner2 = new Scanner(System.in);
        int topmanagerCount = scanner2.nextInt();
        for (int j = 0; j < topmanagerCount; j++) {
            for (int i = 0; i < company.getEmployee().size(); i++) {
                if (company.getEmployee().get(i).toString().contains(TopManager.class.getName())) {
                    Employee eFire = company.getEmployee().get(i);
                    company.fire(eFire);
                    break;
                }
            }
        }

        System.out.println(company.getCount((company.getEmployee())));
        System.out.println(company.getEmployee());
    }
}


