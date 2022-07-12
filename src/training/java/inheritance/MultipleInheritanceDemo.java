
package training.java.inheritance;

interface SavingsAccount {
	double getBalance();
}

interface CurrentAccount {
	double getBalance();
}

interface MyInf{
	double getBalance();
}


class Account implements SavingsAccount, CurrentAccount,MyInf {

	public double getBalance() {
		return 15546.18;
	}

}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {

		MyInf ac = new Account();

		double bal = ac.getBalance();
		System.out.println("bal=" + bal);

	}

}
