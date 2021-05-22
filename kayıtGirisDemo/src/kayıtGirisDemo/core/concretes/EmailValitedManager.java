package kayýtGirisDemo.core.concretes;

import java.util.Random;
import java.util.Scanner;

import kayýtGirisDemo.Entities.cocncretes.Users;
import kayýtGirisDemo.core.abstracts.ValitedService;

public class EmailValitedManager implements ValitedService{

	@Override
	public Boolean Valited(Users users) {
		Scanner scanner=new Scanner(System.in);
		char chosenvalue='n';
		System.out.println(users.getEposta()+"Adresinize doðrulama kodu gönderdik onaylýyor musunuz?(Y/N)");
		chosenvalue = scanner.next().charAt(0);
		if (chosenvalue == 'y' || chosenvalue == 'Y') {
			Random random = new Random();
			int randomInteger, enteredNumber, count = 0;

			do {
				randomInteger = random.nextInt(999999 - 100000 + 1) + 100000;

				System.out.println(
						"Hesabýnýzý doðrulamak için 6 haneli þifrenizi girin. :\n--> " + randomInteger);
				enteredNumber = scanner.nextInt();
				count++;
				if (count == 4) {
					System.out.println(
							"yanlýþ giriþ denemesi yaptýnýz hesap doðrulanamadý. \nLütfen daha sonra tekrar deneyiniz..");
					scanner.close();
					return false;
				}
			} while (!(enteredNumber == randomInteger) && count < 4);
			System.out.println("tebrikler hesap doðrulandý.");
			
			scanner.close();
			return true;

		}
		scanner.close();
		return false;
	}

}
