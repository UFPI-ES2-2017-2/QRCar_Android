package es.ufpi.br.qrcar.repository;

import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.Client;

public class ClientsRepository{
    private List<Client> clients;

    public ClientsRepository(){
        this.clients = new LinkedList<Client>();
    }

    public void insertClient(Client client){
        clients.add(client);
    }

    /**
     * Searches a user by an email address
     * @param email user's email
     * @return User
     */
    public Client searchClient(String email){
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
     * Lists all users on the repository
     * @return
     */
    public List<Client> getClients(){
        return clients;
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