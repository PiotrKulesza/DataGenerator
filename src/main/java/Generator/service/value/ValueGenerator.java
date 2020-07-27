package Generator.service.value;

import java.util.concurrent.ThreadLocalRandom;

public class ValueGenerator {


    public static Integer generateValue(){
        return ThreadLocalRandom.current().nextInt(0, 1000);
    }

}
