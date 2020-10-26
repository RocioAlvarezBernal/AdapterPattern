
public class Adapted implements CoffeeMachine {

	old theMachine;

	public Adapted(old newCoffeeMachine) {
		theMachine = newCoffeeMachine;
	}

	public void chooseFirstSelection() {
		theMachine.selectA();
	}

	public void chooseSecondSelection() {
		theMachine.selectB();
	}
}