package homeplantsapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "plants")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String specie;
    private String characteristic;
    private String care;
    private int wateringInterval;
    private Date lastWateredDate;
    @ManyToOne
    @JoinColumn(name = "picture_id")
    private Picture picture;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCare() {
        return care;
    }

    public void setCare(String care) {
        this.care = care;
    }

    public int getWateringInterval() {
        return wateringInterval;
    }

    public void setWateringInterval(int wateringInterval) {
        this.wateringInterval = wateringInterval;
    }

    public Date getLastWateredDate() {
        return lastWateredDate;
    }

    public void setLastWateredDate(Date lastWateredDate) {
        this.lastWateredDate = lastWateredDate;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specie='" + specie + '\'' +
                ", characteristic='" + characteristic + '\'' +
                ", care='" + care + '\'' +
                ", wateringInterval=" + wateringInterval +
                ", lastWateredDate=" + lastWateredDate +
                ", picture=" + picture +
                '}';
    }
}
