package Dao;

import Model.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pc
 */
@Stateless
public class UserDao extends Facade<User> {

    @PersistenceContext(unitName = "com.mycompany_KwetterApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    public UserDao() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
