import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dimensions1 dimensions = new Dimensions1(10, 10, 10);
        System.out.println(dimensions);
        System.out.println("Объем посылки" + " " + dimensions.volumePackege() + " см3 ");

        dimensions = dimensions.setHeightPackage(20);
        dimensions = dimensions.setLongPackage(20);
        dimensions = dimensions.setWidthPackage(20);

        System.out.println(dimensions);
        System.out.println("Объем посылки" + " " + dimensions.volumePackege() + " см3 ");


        PostOffice1 postOffice = new PostOffice1(56.2,
                23.2,
                "Minsk-1",
                true,
                "6565",
                true,
                dimensions);
        System.out.println(postOffice);

        postOffice = postOffice.setSizePackage(60.5);
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
