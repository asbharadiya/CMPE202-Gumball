

public class Main {

	public static void main(String[] args) {
		//first machine
		GumballMachine gumballMachine = new GumballMachine(5, 25, false);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		//second machine
		gumballMachine = new GumballMachine(5, 50, false);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		//third machine
		gumballMachine = new GumballMachine(5, 50, true);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
