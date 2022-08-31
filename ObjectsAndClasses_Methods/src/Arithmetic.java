public class Arithmetic {
    public int x = 0;
    public int y = 0;
    public int sum = 0;
    public int mult = 0;

    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic(7, 10);

        arithmetic.print("Сумма чисел:" + arithmetic.variableSum());
        arithmetic.print("Произведение чисел:" + arithmetic.variableMultiplication());

        arithmetic.variableMaxMin();
    }

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int variableSum() {
        sum = x + y;
        return sum;
    }

    public int variableMultiplication() {
        mult = x * y;
        return mult;
    }

    public void print(String title) {
        System.out.println(title);
    }

    public void variableMaxMin() {
        if ((x - y) > 0) {
            System.out.println("Максимальное число:" + x + "\n" + "Минимальное число:" + y);
        } else if ((y - x) > 0) {
            System.out.println("Максимальное число:" + y + "\n" + "Минимальное число:" + x);
        } else {
            System.out.println("Числа равны");
        }
    }
}


