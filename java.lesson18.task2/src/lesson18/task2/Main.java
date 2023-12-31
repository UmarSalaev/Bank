package lesson18.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {

		List<SavingAccount> saveAcc = new ArrayList<>();

		System.out.println("Список доступных аккаунтов\n");

		saveAcc.add(new SavingAccount(0, 0, 0));
		saveAcc.add(new SavingAccount(1, 1290.4, 852));
		saveAcc.add(new SavingAccount(2, 758, 402));
		saveAcc.add(new SavingAccount(3, 5600.4, 121));

		for (int i = 1; i < saveAcc.size(); i++) {
			SavingAccount save = saveAcc.get(i);
			System.out.println(saveAcc.get(i));
		}

		System.out.println("\nВыберите аккаунт по номеру ");

		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();

		System.out.println("Выбраный " + saveAcc.get(number1));

		balance(saveAcc, number1);
		deposit(saveAcc, number1);

	}

	private static void balance(List<SavingAccount> saveAcc, int number1) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println("Хотите снять деньги с баланса?НАЖМИТЕ [Y/N]");
		String answer = sc1.nextLine();
		String answerYes = "Y";
		String answerNo = "N";

		if (answer.equals(answerYes)) {
			System.out.println("Введите сумму для снятия с баланса");
			double money = sc.nextDouble();
			double newBalance = saveAcc.get(number1).getBalance();
			newBalance -= money;
			saveAcc.get(number1).setBalance(newBalance);

			System.out.println(saveAcc.get(number1));
		} else {
			System.out.println("Всего доброго.Пока");
		}
	}

	public static void deposit(List<SavingAccount> saveAcc, int number1) {

		System.out.println("Хотите снять деньги с депозитного счёта?[Y/N]");

		Scanner sc2 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		String answer2 = sc2.nextLine();
		String answerYess = "Y";
		String answerNon = "N";

		if (answer2.equals(answerYess)) {
			System.out.println("Введите сумму для снятия с депозита");

			double money2 = sc.nextDouble();
			double newBalance2 = saveAcc.get(number1).getDeposit();
			newBalance2 -= money2;
			saveAcc.get(number1).setDeposit(newBalance2);
			System.out.println(saveAcc.get(number1));

		} else {
			System.out.println("Всего доброго.Пока");
		}

	}

}
