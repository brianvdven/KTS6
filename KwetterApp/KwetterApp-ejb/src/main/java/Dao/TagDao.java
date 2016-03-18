package Dao;

import Model.Tag;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pc
 */
@Stateless
public class TagDao extends Facade<Tag> {

    @PersistenceContext(unitName = "com.mycompany_KwetterApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    public TagDao() {
        super(Tag.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
