package statisticker;

public class LEDAlert implements IAlerter {

	public boolean ledGlows;

	public boolean isLedGlows() {
		return ledGlows;
	}

	public void setLedGlows(boolean ledGlows) {
		this.ledGlows = ledGlows;
	}

}
