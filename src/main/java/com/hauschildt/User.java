/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt;

import java.util.Hashtable;
import java.util.Map;

public class User {
    private long userId;
    private String username;
    private String firstName;
    private String lastName;
    private Map<String, Boolean> permissions;

    public User() {
    }

    public User(long userId, String username, String firstName, String lastName) {
        this.userId = userId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.permissions = new Hashtable<>();
        permissions.put("active", true);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Boolean> getPermissions() {
        return permissions;
    }

    public void setPermissions(Map<String, Boolean> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
    
    
}
