import java.util.Random;

/**
 * Created by bsheen on 3/30/17.
 */
public class HighEndElectronics implements AwesomerLaptop{


    @Override
    public double processor() {
        Random random = new Random();
        return random.nextDouble()+1;
    }

    @Override
    public double boo() {
        Random random = new Random();
        return random.nextDouble()+2;
    }
}
