package es.ufpi.br.qrcar.repository;

import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.User;

public class UsersRepository implements IUsersRepository {
    private List<User> users;

    public UsersRepository(){
        this.users = new LinkedList<User>();
    }

    public Boolean insertUser(User user){
        if(users.add(user))
            return true;
        return false;
    }

    public Boolean removeUser(User user){
        if(users.remove(user))
            return true;
        return false;
    }

    /**
     * Searches a user by an email address
     * @param email user's email
     * @return User
     */
    public User searchUser(String email, String password){
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
     */
    public List<User> list(){
        return users;
    }

    /**
     * Edits an user's entry on the repository
     * @return Boolean
     */
    public Boolean editUser(User original_user, User new_user){
        for (User u : users){
            if (u.equals(original_user)){
                u = new_user;
                return true;
            }
        }
        return false;
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
        insertUser(user1);
    }
}