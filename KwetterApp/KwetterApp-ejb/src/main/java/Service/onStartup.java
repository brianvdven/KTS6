package Service;

import Dao.UserDao;
import Model.User;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author pc
 */
@Singleton
@Startup
public class onStartup {

    @Inject
    private UserDao dao;

    @PostConstruct
    public void onStart() {
        User user = new User("Ikke","username1","password1");
        dao.create(user);
    }
}
