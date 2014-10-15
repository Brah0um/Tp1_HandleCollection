/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.javabeans;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Brah0um
 */

@Entity
@Table(name="ClientTTC")
public class ClientTTC implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String lastName;
    
    private String firstName; 
    
    private String penName;
    
    private String phoneNumber;
    
    private String email;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date registeredAt;
    
    @OneToOne(cascade = CascadeType.ALL)
    private AddressTTC address;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;

    /*
     * Constructor
     */
    public ClientTTC() {}
    
    /*
     * Constructor
     * @params String lastName, String firstName, String penName, String phoneNumber, String email
     */
    public ClientTTC(String lastName,String firstName,String penName,String phoneNumber,String email){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.lastName = lastName;
        this.firstName = firstName;
        this.penName = penName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registeredAt = new Date();
    }
    
    /*
     * Get id
     *
     * @return integer id
     */
    public int getId() {
        return this.id;
    }

    /*
     * Set id
     * @param integer id
     */
    public void setId(int id) {
        this.id = id;
    }

    /*
     * Get last name
     *
     * @return String LastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /*
     * Set last name
     * @param String lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
     * Get first name
     *
     * @return String firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /*
     * Set first name
     * @param String firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /*
     * Get pen name
     *
     * @return String penName
     */
    public String getPenName() {
        return this.penName;
    }

    /*
     * Set pen name
     * @param String penName
     */
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
