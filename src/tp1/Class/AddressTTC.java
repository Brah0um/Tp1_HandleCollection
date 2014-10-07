/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.Class;

/**
 *
 * @author brahim
 */
public class AddressTTC {
    private int id;
    private String street;
    private int codeMail;
    private String city;
    private String country;
    private ClientTTC client;
    
    public AddressTTC(String street,int codeMail,String city,String country) {
        this.street = street;
        this.codeMail = codeMail;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCodeMail() {
        return codeMail;
    }

    public void setCodeMail(int codeMail) {
        this.codeMail = codeMail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ClientTTC getClientTTC() {
        return client;
    }

    public void setClientTTC(ClientTTC client) {
        client.setAddress(this);
        this.client = client;
    }
}
