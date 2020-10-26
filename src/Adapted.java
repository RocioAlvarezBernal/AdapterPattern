
public class Adapted implements CoffeeMachine {

	Old theMachine;

	public  Adapted (Old newCoffeeMachine) {
		theMachine = newCoffeeMachine;
	}

	public String chooseFirstSelection() {
		return theMachine.selectA();
	}

	public String chooseSecondSelection() {
		return theMachine.selectB();
	}
}