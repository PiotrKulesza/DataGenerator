package Generator.core;

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
	    metricPOJO.setMetricValue(ValueGenerator.generateValue());
	    metricPOJO.setTimestamp(TimeGenerator.generateTime());
		SaveToFile saveToFile = new SaveToFile();
		saveToFile.saveTextToFile(metricPOJO.getTimestamp()+":"+metricPOJO.getMetricValue()+"\n",
				arguments.getPathToPropertiesFile());
	}

}
