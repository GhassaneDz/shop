package co.simplon.shop.infrastructure.persistence.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.simplon.shop.infrastructure.utils.ConfigFileReader;
import co.simplon.shop.model.client.Client;
import co.simplon.shop.model.client.IClientRepository;

public class ClientRepository implements IClientRepository {

	private Map<String, Client> clients = new HashMap<String, Client>();
	private final String storageDir;
	private final File file;

	public ClientRepository() throws IOException {
		storageDir = new ConfigFileReader().getConfigProperty("storageDirectory");
		file = new File(storageDir + "/clients.dat");
	}

	private void saveToFile() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(clients);
		oos.close();
	}

	@SuppressWarnings("unchecked")
	private void loadFromFile() throws ClassNotFoundException, IOException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		clients = (Map<String, Client>) ois.readObject();
		ois.close();

	}

	@Override
	public void saveClient(Client client) {
		clients.put(client.getId(), client);
		try {
			saveToFile();
			loadFromFile();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteClient(Client client) {
		// dans les hashmap on supprime par clé
		clients.remove(client.getId());
		try {
			saveToFile();
			loadFromFile();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	public List<Client> getAllClients() {
		try {
			loadFromFile();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList<Client>(clients.values());
	}

	public Client findById(String id) {
		try {
			loadFromFile();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}		
		return clients.get(id);
	}
}
