public class Main {

    public static void main(String[] args) {

        Electronics electronics = new Electronics();
        System.out.printf("My new TV is a %s, %d inch, Model No. %s.%n", Television.brand(),electronics.screensize(),electronics.modelNumber());
        System.out.printf("My new laptop is a %s, %.1f GHz Intel Core i5, %d GB RAM.%n", Laptop.brand(),electronics.processor(),electronics.memory());

        HighEndElectronics highEndElectronics = new HighEndElectronics();
        System.out.printf("My laptop got upgraded to a %s, %.1f GHz Intel Core i7, %d GB RAM.", AwesomerLaptop.brand(),highEndElectronics.boo(),highEndElectronics.boo2());
    }
}
