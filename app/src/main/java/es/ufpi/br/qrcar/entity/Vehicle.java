package es.ufpi.br.qrcar.entity;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String manufacturer;
    private String model;
    private String plate_id;
    private int year;
    private int num_passengers;
    private int car_id;
    private Boolean is_available;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate_id() {
        return plate_id;
    }

    public void setPlate_id(String plate_id) {
        this.plate_id = plate_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNum_passengers() {
        return num_passengers;
    }

    public void setNum_passengers(int num_passengers) {
        this.num_passengers = num_passengers;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public Boolean getIs_available() {
        return is_available;
    }

    public void setIs_available(Boolean is_available) {
        this.is_available = is_available;
    }
}