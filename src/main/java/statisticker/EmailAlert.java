package statisticker;

public class EmailAlert implements IAlerter {

	public boolean emailSent;

	public boolean isEmailSent() {
		return emailSent;
	}

	public void setEmailSent(boolean emailSent) {
		this.emailSent = emailSent;
	}

}
