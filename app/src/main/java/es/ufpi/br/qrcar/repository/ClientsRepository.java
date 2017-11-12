package es.ufpi.br.qrcar.repository;

import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.Client;

public class ClientsRepository implements IClientsRepository{
    private List<Client> clients;

    public ClientsRepository(){
        this.clients = new LinkedList<Client>();
    }

    public void insertClient(Client client){
        clients.add(client);
    }

    public void removeClient(Client client){
        clients.remove(client);
    }

    /**
     * Searches a client by an email address
     * @param email client's email
     * @return Client
     */
    public Client searchClient(String email, String password){
        Client aux = null;

        for (Client c : clients){
            if (c.getEmail().equals(email)){
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

    public void editClient(Client original_client, Client new_client){
        Client aux = null;

        for (Client c : clients){
            if (c.equals(original_client)){
                c = new_client;
                break;
            }
        }
    }

    /**
     * Populates data of users randomly for tests purposes only
     */
    public void populateClientsRepository(){
        Client client1 = new Client();
        client1.setName("Armando Soares Sousa");
        client1.setEmail("armando@ufpi.edu.br");
        client1.setAddress("Rua Territorio Fernando de Noronha");
        client1.setPassword("123");
        insertClient(client1);
    }
}