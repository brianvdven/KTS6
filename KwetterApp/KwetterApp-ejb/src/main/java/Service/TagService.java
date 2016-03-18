package Service;

import Dao.TagDao;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author pc
 */
@Stateless
public class TagService {

    public TagService() {
    }

    @Inject
    TagDao dao;

    public void SearchTag() {
    }
}
