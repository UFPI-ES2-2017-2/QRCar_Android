package es.ufpi.br.qrcar.control;

import es.ufpi.br.qrcar.entity.Vehicle;
import es.ufpi.br.qrcar.repository.VehiclesRepository;

import java.io.Serializable;
import java.util.List;

public class VehiclesController implements Serializable {
    private VehiclesRepository vehicles;

    public VehiclesController()
    {
        this.vehicles = new VehiclesRepository();
        this.vehicles.populateVehiclesRepository();
    }

    public Boolean insertVehicle(Vehicle v)
    {
        if (this.vehicles.insertVehicle(v))
            return true;
        else
            return false;
    }

    public Boolean removeVehicle(Vehicle v)
    {
        if (this.vehicles.removeVehicle(v))
            return true;
        else
            return false;
    }

    public List<Vehicle> listVehicles()
    {
        return this.vehicles.list();
    }

    public Vehicle searchVehicle(String plate_id, int car_id)
    {
        return this.vehicles.searchVehicle(plate_id, car_id);
    }

    public Boolean editVehicle(Vehicle oldV, Vehicle newV)
    {
        if (this.vehicles.editVehicle(oldV, newV))
            return true;
        else
            return false;
    }
}