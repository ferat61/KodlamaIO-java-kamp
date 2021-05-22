package kay�tGirisDemo.core.concretes;

import java.util.Random;
import java.util.Scanner;

import kay�tGirisDemo.Entities.cocncretes.Users;
import kay�tGirisDemo.core.abstracts.ValitedService;

public class EmailValitedManager implements ValitedService{

	@Override
	public Boolean Valited(Users users) {
		Scanner scanner=new Scanner(System.in);
		char chosenvalue='n';
		System.out.println(users.getEposta()+"Adresinize do�rulama kodu g�nderdik onayl�yor musunuz?(Y/N)");
		chosenvalue = scanner.next().charAt(0);
		if (chosenvalue == 'y' || chosenvalue == 'Y') {
			Random random = new Random();
			int randomInteger, enteredNumber, count = 0;

			do {
				randomInteger = random.nextInt(999999 - 100000 + 1) + 100000;

				System.out.println(
						"Hesab�n�z� do�rulamak i�in 6 haneli �ifrenizi girin. :\n--> " + randomInteger);
				enteredNumber = scanner.nextInt();
				count++;
				if (count == 4) {
					System.out.println(
							"yanl�� giri� denemesi yapt�n�z hesap do�rulanamad�. \nL�tfen daha sonra tekrar deneyiniz..");
					scanner.close();
					return false;
				}
			} while (!(enteredNumber == randomInteger) && count < 4);
			System.out.println("tebrikler hesap do�ruland�.");
			
			scanner.close();
			return true;

		}
		scanner.close();
		return false;
	}

}
