package ch.heigvd.flight.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="flight")
public class FlightsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flight_id")
    private long Id;

    @Column(name="name")
    private String name;

    @Column(name="departure_time")
    private long departure_time;

    @Column(name="arrival_time")
    private long arrival_time;

    @Column(name="start_point")
    private String start_point;

    @Column(name="end_point")
    private String end_point;

    @Column(name="price")
    private int price;


    public long getFlight_id() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(long departure_time) {
        this.departure_time = departure_time;
    }

    public long getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(long arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getStart_point() {
        return start_point;
    }

    public void setStart_point(String start_point) {
        this.start_point = start_point;
    }

    public String getEnd_point() {
        return end_point;
    }

    public void setEnd_point(String end_point) {
        this.end_point = end_point;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}