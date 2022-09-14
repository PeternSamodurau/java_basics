import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dimensions1 dimensions = new Dimensions1(1, 2, 3);
        System.out.println(dimensions);

        dimensions = dimensions.setHeightPackage(54);
        dimensions = dimensions.setLongPackage(89);
        dimensions = dimensions.setWidthPackage(9);

        System.out.println(dimensions);


        PostOffice1 postOffice = new PostOffice1(400.5,
                2.5,
                "Minsk-1",
                true,
                "6464",
                true);

        postOffice = postOffice.setSizePackage(600.5);
        postOffice = postOffice.setDeliveryAddress("Minsk-2");
        postOffice = postOffice.setWeightPackage(3.5);
        System.out.println(postOffice);

        Elevator1 elevator = new Elevator1(26, -3);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }


    }
}
