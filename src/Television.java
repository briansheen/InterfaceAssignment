/**
 * Created by bsheen on 3/30/17.
 */
public interface Television {
    static String brand(){
        return "Samsung";
    }
    default int screensize() {
        return 50;
    }
    String modelNumber();
}
