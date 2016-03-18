/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Dao.UserDao;
import Model.Tweet;
import Model.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author pc
 */
@Stateless
public class UserService {

    public UserService() {
    }

    @Inject
    UserDao dao;

    public void Login() {
    }

    public void Logout() {
    }

    public void NewTweet() {

    }

    public void DeleteTweet() {

    }

    public void FollowUser(User user) {
    }

}
