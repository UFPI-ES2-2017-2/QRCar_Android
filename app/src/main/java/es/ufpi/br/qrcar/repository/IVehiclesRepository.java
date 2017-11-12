package es.ufpi.br.qrcar.repository;

import java.util.List;
import es.ufpi.br.qrcar.entity.Vehicle;

public interface IVehiclesRepository {
    public void insertVehicle(Vehicle v);
    public List<Vehicle> list();
    public Vehicle searchVehicle(String plate_id, int car_id);
    public void editVehicle(Vehicle original, Vehicle new_vehicle);
    public void removeVehicle(Vehicle v);
    public List<Vehicle> searchByContentAndType(String content, String type);
}
