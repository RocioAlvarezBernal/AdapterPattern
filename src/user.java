
public class user {

	public static void main(String[] args) {
		Adapted adapter = new Adapted(new Old());
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}
}
