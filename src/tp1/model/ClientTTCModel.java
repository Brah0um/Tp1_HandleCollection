/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import tp1.javabeans.ClientTTC;

/**
 *
 * @author Brah0um
 */
public class ClientTTCModel {
    // gestionnaire
    private EntityManager em;
    
    /*
     * Constructor
     * @param EntityManager
     */
    public ClientTTCModel(EntityManager em)
    {
        this.em = em;
    }
    
    /*
     * Get clients
     * @return List<ClientTTC>
     */
    public List<ClientTTC> getClients()
    {
        TypedQuery<ClientTTC> query = em.createQuery("SELECT c FROM ClientTTC c", ClientTTC.class);
        return query.getResultList();
    }
    
    /* 
     * Get client
     * @param integer
     *
     * @return ClientTTC
     */
    public ClientTTC getClient(int clientId)
    {
        return em.find(ClientTTC.class, (int)clientId);
    }
    
    /*
     * Add client
     * @param ClientTTC
     */
    public void add(ClientTTC client)
    {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(client);
            tx.commit();
        } catch(Exception e) {
            try {
                tx.rollback();
            } catch(Exception et){}
        }
    }
    
    /*
     * Update client
     * @param ClientTTC
     *
     * @return ClientTTC
     */
    public ClientTTC update(ClientTTC client)
    {
        EntityTransaction tx=em.getTransaction();
        try {
            tx.begin();
            em.merge(client);
            tx.commit();
        } catch(Exception e) {
            try {
                tx.rollback();
            } catch(Exception et){}
        }
        
        return client;
    }
    
    /*
     * Remove client
     * @param integer
     *
     */
    public void remove(int clientId)
    {
        ClientTTC c = this.getClient(clientId);
        if (c != null) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.remove(em.merge(c));
                tx.commit();
            } catch(Exception e) {
                try {
                tx.rollback();
                } catch(Exception et){}
            }
        }
    }
}
