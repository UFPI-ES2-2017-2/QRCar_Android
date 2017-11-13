package es.ufpi.br.qrcar.entity;


import java.io.Serializable;
import java.util.Date;

public class Contract implements Serializable {
    private Date start_date;
    private Date end_data;
    private float price;
    private int client_cpf;
    private int contract_id;
    private String plate_ID;

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_data() {
        return end_data;
    }

    public void setEnd_data(Date end_data) {
        this.end_data = end_data;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getClient_cpf() {
        return client_cpf;
    }

    public void setClient_cpf(int client_cpf) {
        this.client_cpf = client_cpf;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getPlate_ID() {
        return plate_ID;
    }

    public void setPlate_ID(String plate_ID) {
        this.plate_ID = plate_ID;
    }
}
