package es.ufpi.br.qrcar.repository;

import java.util.List;
import es.ufpi.br.qrcar.entity.Vehicle;

public interface IVehiclesRepository {
    public Boolean insertVehicle(Vehicle v);
    public Boolean removeVehicle(Vehicle v);
    public List<Vehicle> list();
    public Vehicle searchVehicle(String plate_id, int car_id);
    public Boolean editVehicle(Vehicle original, Vehicle new_vehicle);
}
