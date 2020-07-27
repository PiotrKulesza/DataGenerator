package Generator;

import java.util.Timer;

import Generator.common.pojo.MetricPOJO;
import Generator.core.SaveFileRunner;
import Generator.core.SaveToFile;
import Generator.service.time.TimeGenerator;
import Generator.service.value.ValueGenerator;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Start");
        Arguments arguments = Arguments.fromMain(args);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.creatFile(arguments.getPathToPropertiesFile());
        Timer timer = new Timer();
        timer.schedule(new SaveFileRunner(arguments), 0, 100);
        

    }
}
