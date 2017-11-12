package es.ufpi.br.qrcar.repository;

import java.util.List;
import es.ufpi.br.qrcar.entity.Client;

public interface IClientsRepository {
    public void insertClient(Client c);
    public List<Client> list();
    public Client searchClient(String login, String password);
    public void editClient(Client original, Client new_client);
    public void removeClient(Client c);
    public List<Client> searchByContentAndType(String content, String type);
}
