package es.ufpi.br.qrcar.repository;

import java.util.List;
import es.ufpi.br.qrcar.entity.Client;

public interface IClientsRepository {
    public Boolean insertClient(Client c);
    public Boolean removeClient(Client c);
    public List<Client> list();
    public Client searchClient(int cpf);
    public Boolean editClient(Client original, Client new_client);
}
