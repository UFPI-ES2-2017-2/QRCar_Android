package es.ufpi.br.qrcar.control;

import es.ufpi.br.qrcar.data.UsersRepository;
import es.ufpi.br.qrcar.data.User;

public class UsersController {
    private UsersRepository users;

    public UsersController(){
        users = new UsersRepository();
    }

    /**
     * Given an email, it returns a certain user's data
     * @param email email of a user
     * @return user
     */
    public User loadUserData(String email){
        User user = new User();

        //Fecthes data of repo or service from the user database
        user = users.searchUser(email);

        if (user != null){
            return user;
        }else {
            return null;
        }
    }

    /**
     * Inserts a new user
     * @param u User's data
     */
    public void insertUser(User u){
        users.insertUser(u);
    }

    /**
     * Populates the repo with random user data
     */
    public void populate(){
        users.populateUsersRepository();
    }
}
