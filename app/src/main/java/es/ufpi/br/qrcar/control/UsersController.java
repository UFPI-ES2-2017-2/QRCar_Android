package es.ufpi.br.qrcar.control;

import es.ufpi.br.qrcar.repository.UsersRepository;
import es.ufpi.br.qrcar.entity.User;
import java.util.List;
public class UsersController {
    private UsersRepository users;

    public UsersController(){
        users = new UsersRepository();
    }

    public Boolean insertUser(User u)
    {
        if(this.users.insertUser(u))
            return true;
        else
            return false;
    }

    public Boolean removeUser(User u)
    {
        if(this.users.removeUser(u))
            return true;
        else
            return false;
    }

    public List<User> listUsers()
    {
        return this.users.getUsers();
    }

    public User searchUser(String login, String password)
    {
        User tempUser = this.users.searchUser(login, password);
    }

    public Boolean editUser(User newU, User oldU)
    {
        for(int i = 0; i < this.users.getUsers().size(); i++)
        {
            if (this.users.getUsers().get(i).equals(oldU))
            {
                this.users.getUsers().get(i) = newU;
                return true;
            }
        }
        return false;
    }
}
