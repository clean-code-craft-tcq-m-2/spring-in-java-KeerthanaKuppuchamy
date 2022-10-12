package statisticker;

import java.util.List;

public class Statistics {
	public static Stats getStatistics(List<Float> numbers) {

		Stats stats = new Stats();
		Float average = 0f;
		Float min = numbers == null || numbers.isEmpty() ? Float.NaN : numbers.get(0);
		Float max = numbers == null || numbers.isEmpty() ? Float.NaN : numbers.get(0);

		for (Float number : numbers) {
			average = average + number;

			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}
		average = average / numbers.size();
		stats.setAverage(average);
		stats.setMax(max);
		stats.setMin(min);
		return stats;
	}
}
