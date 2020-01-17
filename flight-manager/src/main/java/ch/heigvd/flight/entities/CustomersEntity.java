package ch.heigvd.flight.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class CustomersEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customer_id;

    private String customer_pseudo;
    private String firstname;
    private String lastname;
    private int age;
    private String customer_pw;


    public long getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_pseudo() {
        return customer_pseudo;
    }

    public void setCustomer_pseudo(String customer_pseudo) {
        this.customer_pseudo = customer_pseudo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomer_pw() {
        return customer_pw;
    }

    public void setCustomer_pw(String customer_pw) {
        this.customer_pw = customer_pw;
    }
}