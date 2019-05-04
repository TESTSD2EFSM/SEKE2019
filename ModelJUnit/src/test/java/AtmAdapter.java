public class AtmAdapter {
	private User user = new User();
	private ATM atm = new ATM();
	private Bank bank = new Bank();	
	
	public void insertCard() {
		atm.insertCard(user.getCard());
	}
	
	public boolean validateCard() {
		return bank.validateCard(user.getCard());
	}
	
	public void enterPassword() {
		atm.enterPassword(user.getPsw());
	}
	
	public boolean validatePassword() {
		return bank.validatePassword(user.getPsw());
	}
	
	public void enterValue() {
		atm.enterValue(user.getValue());
	}
	
	public boolean validateBalance() {
		return bank.validateBalance(user.getValue());
	}
}
