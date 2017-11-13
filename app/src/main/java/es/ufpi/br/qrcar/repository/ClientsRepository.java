package es.ufpi.br.qrcar.repository;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.Client;

public class ClientsRepository implements IClientsRepository, Serializable{
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
     * @param cpf cpf number of a client
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
     * @return Bool
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
        Client client2 = new Client();
        client2.setName("Vitor Meneses");
        client2.setEmail("vitor@ufpi.edu.br");
        client2.setAddress("DC - UFPI");
        insertClient(client2);
        Client client3 = new Client();
        client3.setName("Luca Carvalho");
        client3.setEmail("luca@ufpi.edu.br");
        client3.setAddress("DC - UFPI");
        insertClient(client3);
        Client client4 = new Client();
        client4.setName("Natasha Rebelo");
        client4.setEmail("natasha@ufpi.edu.br");
        client4.setAddress("DC - UFPI");
        insertClient(client4);
        Client client5 = new Client();
        client5.setName("Railson Soares");
        client5.setEmail("railson@ufpi.edu.br");
        client5.setAddress("DC - UFPI");
        insertClient(client5);
        Client client6 = new Client();
        client6.setName("Jonathans Evangelista");
        client6.setEmail("jonathans@ufpi.edu.br");
        client6.setAddress("DC - UFPI");
        insertClient(client6);
    }
}