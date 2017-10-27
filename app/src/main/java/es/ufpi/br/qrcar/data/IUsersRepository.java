package es.ufpi.br.qrcar.data;

import java.util.List;
import es.ufpi.br.qrcar.data.*;

public interface IUsersRepository {
    public void insertUser(User u);
    public List<User> list();
    public User searchUser(String login, String password);
    public void editUser(User original, User new_user);
    public void removeUser(User u);
    public List<User> searchByContentAndType(String content, String type);
}
