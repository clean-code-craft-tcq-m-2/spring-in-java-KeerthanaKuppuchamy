package statisticker;

import java.util.Arrays;
import java.util.List;

public class StatsChecker {

	Float maxThreshold;
	EmailAlert emailAlert;
	LEDAlert ledAlert;

	public StatsChecker(Float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		List<IAlerter> alerterList = Arrays.asList(alerters);
		for (IAlerter alerter : alerterList) {
			if (alerter instanceof EmailAlert) {
				this.emailAlert = (EmailAlert) alerter;
			} else if (alerter instanceof LEDAlert) {
				this.ledAlert = (LEDAlert) alerter;
			}
		}
	}

	public void checkAndAlert(List<Float> numbers) {
		Stats s = Statistics.getStatistics(numbers);
		if (s.max > maxThreshold) {
			emailAlert.setEmailSent(true);
			ledAlert.setLedGlows(true);
		}
	}

}
