/**
 * Created by bsheen on 3/30/17.
 */
public interface Laptop {
    static String brand(){
        return "Lenovo";
    }
    default int memory(){
        return 8;
    }
    double processor();
}
