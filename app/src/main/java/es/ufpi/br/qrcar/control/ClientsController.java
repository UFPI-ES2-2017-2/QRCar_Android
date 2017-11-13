package es.ufpi.br.qrcar.control;

import es.ufpi.br.qrcar.entity.Client;
import es.ufpi.br.qrcar.repository.ClientsRepository;

import java.io.Serializable;
import java.util.List;

public class ClientsController implements Serializable{
    private ClientsRepository clients;

    public ClientsController() {
        this.clients = new ClientsRepository();
        this.clients.populateClientsRepository();
    }

    public Boolean insertClient(Client c) {
        if (this.clients.insertClient(c))
            return true;
        else
            return false;
    }

    public Boolean removeClient(Client c) {
        if (this.clients.removeClient(c))
            return true;
        else
            return false;
    }

    public Boolean editClient(Client oldC, Client newC) {
        if (this.clients.editClient(oldC, newC))
            return true;
        else
            return false;
    }

    public List<Client> listClients() {
        return this.clients.list();
    }

    public Client searchClient(int cpf)
    {
        return this.clients.searchClient(cpf);
    }
}