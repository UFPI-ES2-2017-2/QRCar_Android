package es.ufpi.br.qrcar.data;

import java.util.LinkedList;
import java.util.List;

public class UsersRepository {
    private List<User> users;

    public UsersRepository(){
        this.users = new LinkedList<User>();
    }

    public void insertUser(User user){
        users.add(user);
    }

    /**
     * Searches a user by an email address
     * @param email user's email
     * @return User
     */
    public User searchUser(String email){
        User aux = null;

        for (User u : users){
            if (u.getEmail().equals(email)){
                aux = u;
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
    public List<User> getUsers(){
        return users;
    }

    /**
     * Populates data of users randomly for tests purposes only
     */
    public void populateUsersRepository(){
        User user1 = new User();
        user1.setName("Armando Soares Sousa");
        user1.setEmail("armando@ufpi.edu.br");
        user1.setAddress("Rua Territorio Fernando de Noronha");
        user1.setPassword("123");
        user1.setGender("Masculino");

        insertUser(user1);
    }
}
