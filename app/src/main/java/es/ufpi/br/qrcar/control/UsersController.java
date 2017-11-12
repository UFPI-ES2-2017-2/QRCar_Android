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
        return this.users.list();
    }

    public User searchUser(String login, String password)
    {
        User tempUser = this.users.searchUser(login, password);

        return tempUser;
    }

    public Boolean editUser(User newU, User oldU)
    {
        for(int i = 0; i < this.users.list().size(); i++)
        {
            if (this.users.list().get(i).equals(oldU))
            {
                this.users.list().set(i, newU);
                return true;
            }
        }
        return false;
    }
}
