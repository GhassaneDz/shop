package co.simplon.shop.tests;

import java.io.File;
import java.io.IOException;

import co.simplon.shop.infrastructure.persistence.file.ClientRepository;
import co.simplon.shop.infrastructure.utils.ConfigFileReader;
import co.simplon.shop.model.client.Client;
import co.simplon.shop.model.client.IClientRepository;

public class TestsUtils {

	public static void deleteClientFile() throws IOException
	{
		String storageDir = new ConfigFileReader().getConfigProperty("storageDirectory");
		File file = new File(storageDir + "/clients.dat");
		file.delete();		
	}
	
	public static void populateSomeData() throws IOException
	{
		IClientRepository repo = new ClientRepository();
		
		Client[] desClients = new Client[] {
				new Client("Stéphane",4000),
				new Client("Soufiane",8000),
				new Client("Guillaume",2000),
				new Client("Jérémy",9000)				
		};		
		
		for(Client c : desClients){
			repo.saveClient(c);
		}		
	}
}
