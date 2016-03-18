package Dao;

import Model.Tweet;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pc
 */
@Stateless
public class TweetDao extends Facade<Tweet> {

    @PersistenceContext(unitName="com.mycompany_KwetterApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public TweetDao() {
        super(Tweet.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
