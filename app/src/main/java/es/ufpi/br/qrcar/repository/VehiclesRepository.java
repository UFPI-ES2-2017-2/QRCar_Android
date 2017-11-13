package es.ufpi.br.qrcar.repository;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.Vehicle;

public class VehiclesRepository implements IVehiclesRepository, Serializable{
    private List<Vehicle> vehicles;

    public VehiclesRepository(){
        this.vehicles = new LinkedList<Vehicle>();
    }

    public Boolean insertVehicle(Vehicle vehicle){
        if(vehicles.add(vehicle))
            return true;
        return false;
    }

    public Boolean removeVehicle(Vehicle vehicle){
        if(vehicles.remove(vehicle))
            return true;
        return false;
    }

    /**
     * Searches a car by a car id
     * @param car_id car's email
     * @return Car
     */
    public Vehicle searchVehicle(String plate_id, int car_id){
        Vehicle aux = null;

        for (Vehicle v : vehicles){
            if (v.getCar_id() == (car_id)){
                aux = v;
                break;
            }else{
                aux = null;
            }
        }
        return aux;
    }

    /**
     * Lists all cars on the repository
     * @return
     */
    public List<Vehicle> list(){
        return vehicles;
    }

    /**
     * Edits a car's entry on the repository
     * @return Boolean
     */
    public Boolean editVehicle(Vehicle original, Vehicle new_vehicle){
        for (Vehicle v : vehicles){
            if (v.equals(original)){
                v = new_vehicle;
                return true;
            }
        }
        return false;
    }

    /**
     * Populates data of cars randomly for tests purposes only
     */
    public void populateVehiclesRepository(){
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setCar_id(123);
        vehicle1.setIs_available(Boolean.TRUE);
        vehicle1.setManufacturer("BMW");
        vehicle1.setModel("X1");
        vehicle1.setNum_passengers(6);
        vehicle1.setPlate_id("ABC-123");
        vehicle1.setYear(2017);
        insertVehicle(vehicle1);
    }
}