package ch.heigvd.flight.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="customer")
public class CustomersEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private long customer_id;

    @Column(name="customer_pseudo")
    private String pseudo;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="age")
    private int age;

    @Column(name="customer_pw")
    private String customer_pw;


    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id)
    {
        this.customer_id = customer_id;
    }

    public String getCustomer_pseudo() {
        return pseudo;
    }

    public void setCustomer_pseudo(String customer_pseudo) {
        this.pseudo = customer_pseudo;
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