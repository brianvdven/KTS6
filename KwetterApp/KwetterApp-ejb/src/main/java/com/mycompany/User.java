/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
@Entity
public class User {

    @Id@GeneratedValue
    private int id;
    private String name;
    private String username;
    private String password;
    private List<User> followers;
    private List<User> following;

    @Inject
    @OneToMany(mappedBy = "id")
    private List<Tweet> tweets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public User(int id, String name, String username, String password, List<User> followers, List<User> following, List<Tweet> tweets) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.followers = new ArrayList<User>();
        this.following = new ArrayList<User>();
    }

    public void Login() {
    }

    public void Logout() {
    }

    public void NewTweet() {

    }

    public void DeleteTweet(){
    
    }
    
    public List<Tweet> SearchTrending(String subject) {
        //todo  
        return tweets;
    }

    public void FollowUser(User user) {
    }

}
