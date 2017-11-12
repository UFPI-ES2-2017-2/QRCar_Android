package es.ufpi.br.qrcar.repository;

import java.util.List;
import es.ufpi.br.qrcar.entity.User;

public interface IUsersRepository {
    public Boolean insertUser(User u);
    public Boolean removeUser(User u);
    public List<User> list();
    public User searchUser(String login, String password);
    public Boolean editUser(User original, User new_user);
}