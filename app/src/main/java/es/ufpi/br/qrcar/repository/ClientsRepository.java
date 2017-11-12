package es.ufpi.br.qrcar.repository;

import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.Client;

public class ClientsRepository implements IClientsRepository{
    private List<Client> clients;

    public ClientsRepository(){
        this.clients = new LinkedList<Client>();
    }

    public Boolean insertClient(Client client){
        if(clients.add(client))
            return true;
        return false;
    }

    public Boolean removeClient(Client client){
        if(clients.remove(client))
            return true;
        return false;
    }

    /**
     * Searches a client by cpf
     * @param cpf
     * @return Client
     */
    public Client searchClient(int cpf){
        Client aux = null;

        for (Client c : clients){
            if (c.getCpf() == cpf){
                aux = c;
                break;
            }else{
                aux = null;
            }
        }
        return aux;
    }

    /**
     * Lists all clients on the repository
     * @return
     */
    public List<Client> list(){
        return clients;
    }

    /**
     * Edits a client's entry on the repository
     * @return Boolean
     */
    public Boolean editClient(Client original, Client new_client){
        for (Client c : clients){
            if (c.equals(original)){
                c = new_client;
                return true;
            }
        }
        return false;
    }

    /**
     * Populates data of users randomly for tests purposes only
     */
    public void populateClientsRepository(){
        Client client1 = new Client();
        client1.setName("Armando Soares Sousa");
        client1.setEmail("armando@ufpi.edu.br");
        client1.setAddress("Rua Territorio Fernando de Noronha");
        insertClient(client1);
    }
}