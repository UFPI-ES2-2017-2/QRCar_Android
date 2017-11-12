package es.ufpi.br.qrcar.facade;

import es.ufpi.br.qrcar.control.QRCodeController;
import es.ufpi.br.qrcar.control.ContractController;
import es.ufpi.br.qrcar.control.VehiclesController;
import es.ufpi.br.qrcar.control.ClientsController;
import es.ufpi.br.qrcar.control.UsersController;
import es.ufpi.br.qrcar.entity.*;

import java.util.List;

public class Facade {
    private QRCodeController qrCodeController;
    private ContractController contractController;
    private VehiclesController vehiclesController;
    private ClientsController clientsController;
    private UsersController usersController;

    public Facade() {
        this.qrCodeController = new QRCodeController();
        this.contractController = new ContractController();
        this.vehiclesController = new VehiclesController();
        this.clientsController = new ClientsController();
        this.usersController = new UsersController();
    }

     // QRCode Controller Methods.
    public Boolean insertQRCode(QRCode qrcode) {
        return this.qrCodeController.insertQRCode(qrcode);
    }

    public Boolean removeQRCode(QRCode qrcode) {
        return this.qrCodeController.removeQRCode(qrcode);
    }

    public List<QRCode> listQRCode()
    {
        return this.qrCodeController.listQRCodes();
    }

    public QRCode searchQRCode(int qr_code)
    {
        return this.qrCodeController.searchQRCode(qr_code);
    }

    public Boolean editQRCode(QRCode oldQ, QRCode newQ) {
        return this.qrCodeController.editQRCode(oldQ, newQ);
    }

    //  Contract Controller Methods.
    public Boolean insertContract(Contract contract) {
        return this.contractController.insertContract(contract);
    }

    public Boolean removeContract(Contract contract) {
        return this.contractController.removeContract(contract);
    }

    public List<Contract> listContracts()
    {
        return this.contractController.listContracts();
    }

    public Contract searchContract(int contract_id) {
        return this.contractController.searchContract(contract_id);
    }

    public Boolean editContract(Contract oldC, Contract newC) {
        return this.contractController.editContract(oldC, newC);
    }

    // Vehicle Controller Methods.

    public Boolean insertVehicle(Vehicle vehicle) {
        return this.vehiclesController.insertVehicle(vehicle);
    }

    public Boolean removeVehicle(Vehicle vehicle) {
        return this.vehiclesController.removeVehicle(vehicle);
    }

    public List<Vehicle> listVehicles()
    {
        return this.vehiclesController.listVehicles();
    }

    public Vehicle searchVehicle(String plate_id, int car_id) {
        return this.vehiclesController.searchVehicle(plate_id, car_id);
    }

    public Boolean editVehicle(Vehicle oldV, Vehicle newV) {
        return this.vehiclesController.editVehicle(oldV, newV);
    }

    //  Client Controller Methods.
    public Boolean insetClient(Client client) {
        return this.clientsController.insertClient(client);
    }

    public Boolean removeClient(Client client) {
        return this.clientsController.removeClient(client);
    }

    public List<Client> listClients()
    {
        return this.clientsController.listClients();
    }

    public Client searchClient(int cpf)
    {
        return this.clientsController.searchClient(cpf);
    }

    public Boolean editClient(Client oldC, Client newC) {
        return this.clientsController.editClient(oldC, newC);
    }

    // Users Controller Methods.
    public Boolean insertUser(User user)
    {
        return this.usersController.insertUser(user);
    }

    public Boolean removeUser(User user)
    {
        return this.usersController.removeUser(user);
    }

    public List<User> listUsers()
    {
        return this.usersController.listUsers();
    }

    public User searchUser(String login, String password) {
        return this.usersController.searchUser(login, password);
    }

    public Boolean editUser(User oldU, User newU) {
        return this.usersController.editUser(oldU, newU);
    }
}