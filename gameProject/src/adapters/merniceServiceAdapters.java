package adapters;

import java.rmi.RemoteException;

import abstracts.gamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class merniceServiceAdapters implements gamerCheckService {

	@Override
	public Boolean validate(Gamer gamer) {
		Boolean result;
		
  KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
  try {
		result= client.TCKimlikNoDogrula(gamer.getIdentitiynumber(), gamer.getFirstname().toUpperCase(),
				gamer.getLastname().toUpperCase(), gamer.getBirthyear());
	} catch (NumberFormatException e) {
		result = false;
		e.printStackTrace();
	} catch (RemoteException e) {
		result=false;
		e.printStackTrace();
	}
	
	return result;
		
	}

}
