package co.simplon.shop.model.client;

import java.util.List;

public interface IClientRepository {
	void saveClient(Client client);
	void deleteClient(Client client);
	Client findById(String id);
	List<Client> getAllClients();
}
