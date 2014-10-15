/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.javabeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author brahim
 */

@Entity
@Table(name = "RoleTTC")
public class Role implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String label;
    
    private String level;

    public Role() {
    }

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
}
