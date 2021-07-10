/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import com.expo.domain.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Teacher
 */
public class ExpoGeneralDao<X> {
    public void insert(X x){
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(x);
        ss.getTransaction().commit();
        ss.close();
    }
    public void DeleteCar(X x){
    Session ss= HibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.delete(x);
    ss.getTransaction().commit();
    ss.close();
    
    }
    public void Update(X x){
    Session ss= HibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.update(x);
    ss.getTransaction().commit();
    ss.close();
    
    }
    public  List Viewall(String p){
        return HibernateUtil.getSessionFactory().openSession().createQuery(p).list();
    
    }
    
}
