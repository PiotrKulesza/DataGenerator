package Generator.service.time;

import java.util.Date;

public class TimeGenerator {

    public static Long generateTime(){

        return new Date().getTime();

    }
}
