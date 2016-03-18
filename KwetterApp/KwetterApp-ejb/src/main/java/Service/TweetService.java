package Service;

import Dao.TweetDao;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author pc
 */
@Stateless
public class TweetService {

    public TweetService() {
    }

    @Inject
    TweetDao dao;
    
}
