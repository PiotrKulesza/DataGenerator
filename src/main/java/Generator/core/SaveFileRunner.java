package Generator.core;

import java.io.IOException;
import java.util.TimerTask;

import Generator.Arguments;
import Generator.common.pojo.MetricPOJO;
import Generator.service.time.TimeGenerator;
import Generator.service.value.ValueGenerator;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SaveFileRunner extends TimerTask {
	
	
	private Arguments arguments;
	
	
	public void run() {
		MetricPOJO metricPOJO = new MetricPOJO();
	    try {
			metricPOJO.setMetricValue(ValueGenerator.generateValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    metricPOJO.setTimestamp(TimeGenerator.generateTime());
		SaveToFile saveToFile = new SaveToFile();
		saveToFile.saveTextToFile(metricPOJO.getTimestamp()+":"+metricPOJO.getMetricValue()+"\n",
				arguments.getPathToDataFile());
	}

}
