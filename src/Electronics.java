import java.util.Random;

/**
 * Created by bsheen on 3/30/17.
 */
public class Electronics implements Television,Laptop {

    private static String[] MODELS = {"UN50J5000","UN50KU630DF","UN50J5200","UA50J5500","UN50J6200AFXZA"};

    @Override
    public double processor() {
        Random random = new Random();
        return random.nextDouble()+1;
    }

    @Override
    public String modelNumber() {
        Random random =new Random();
        return MODELS[random.nextInt(MODELS.length)];
    }
}
