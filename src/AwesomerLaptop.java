/**
 * Created by bsheen on 3/30/17.
 */
public interface AwesomerLaptop extends Laptop {
    double boo();
    static String brand(){
        return "MacBook Pro";
    }
    default int boo2(){
        return 16;
    }
}
