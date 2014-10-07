/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.Class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author brahim
 */
public class ClientTTC {
    private int id;
    private String lastName;
    private String firstName; 
    private String penName;
    private String phoneNumber;
    private String email;
    private Date registeredAt;
    private AddressTTC address;
    private Role role;
    
    public ClientTTC(String lastName,String firstName,String penName,String phoneNumber,String email){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.lastName = lastName;
        this.firstName = firstName;
        this.penName = penName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registeredAt = new Date();
    }
    
    public ClientTTC(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPenName() {
        return this.penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisteredAt() {
        return this.registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public AddressTTC getAddress() {
        return this.address;
    }

    public void setAddress(AddressTTC address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
