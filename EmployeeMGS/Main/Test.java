/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.expo.domain.HibernateUtil;
import org.hibernate.Session;


public class Test {
    public static void main(String[] args) {
        Session ss=HibernateUtil.getSessionFactory().openSession();
    }
    
}
