import java.util.Comparator;

public class NameSalaryComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Operator && o2 instanceof Operator) {
            return ((Operator) o1).nameOperator.compareTo(((Operator) o2).nameOperator);
        } else if (o1 instanceof Operator && o2 instanceof Manager) {
            return ((Operator) o1).nameOperator.compareTo(((Manager) o2).nameManager);
        } else if (o1 instanceof Manager && o2 instanceof Operator) {
            return ((Manager) o1).nameManager.compareTo(((Operator) o2).nameOperator);
        } else if (o1 instanceof Manager && o2 instanceof Manager) {
            return ((Manager) o1).nameManager.compareTo(((Manager) o2).nameManager);
        } else {
            if (o1 instanceof Operator && o2 instanceof Operator) {
                return ((Operator) o1).salaryOperator.compareTo(((Operator) o2).salaryOperator);
            } else if (o1 instanceof Operator && o2 instanceof Manager) {
                return ((Operator) o1).salaryOperator.compareTo(((Manager) o2).salaryManager);
            } else if (o1 instanceof Manager && o2 instanceof Operator) {
                return ((Manager) o1).salaryManager.compareTo(((Operator) o2).salaryOperator);
            } else if (o1 instanceof Manager && o2 instanceof Manager) {
                return ((Manager) o1).salaryManager.compareTo(((Manager) o2).salaryManager);
            }
            return 0;
        }
    }
}



