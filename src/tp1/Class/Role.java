/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.Class;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brahim
 */
public class Role {
    private int id;
    private String label;
    private String level;
    private List<ClientTTC> clients = new ArrayList<>();

    public Role(String label,String level) {
        this.label = label;
        this.level = level;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<ClientTTC> getClients() {
        return clients;
    }

    public void addClientTTC(ClientTTC client) {
        client.setRole(this);
        this.clients.add(client);
    }
    
    public void removeClientTTC(ClientTTC client) {
        if(this.clients.indexOf(client) != -1) {
            this.clients.remove(this.clients.indexOf(client));
        }
    }
}
