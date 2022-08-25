    public class Arithmetic {
        public static int variable1 = -3;
        public static int variable2 = -10;

        public static int sum = 0;
        public static int mult = 0;

        public Arithmetic(int variable1, int variable2) {
            this.variable1 = variable1;
            this.variable2 = variable2;
        }

        public static void main(String[] args) {
            variableSum(sum);
            variableMultiplication(mult);
            variableMaxMin();
        }

        public static void variableSum(int sum) {
            sum = variable1 + variable2;
            System.out.println("Сумма чисел:" + sum);
        }

        public static void variableMultiplication(int mult) {
            mult = variable1 * variable2;
            System.out.println("Произведение чисел:" + mult);
        }

        public static void variableMaxMin() {
            if ((variable1 - variable2) > 0) {
                System.out.println("Максимальное число:" + variable1 + "\n" + "Минимальное число:" + variable2);
            } else if ((variable2 - variable1) > 0) {
                System.out.println("Максимальное число:" + variable2 + "\n" + "Минимальное число:" + variable1);
            } else {
                System.out.println("Числа равны");
            }
        }
    }

