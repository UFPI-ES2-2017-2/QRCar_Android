package es.ufpi.br.qrcar.facade;

import es.ufpi.br.qrcar.control.QRCodeController;
import es.ufpi.br.qrcar.control.ContractController;
import es.ufpi.br.qrcar.control.VehiclesController;
import es.ufpi.br.qrcar.control.ClientsController;
import es.ufpi.br.qrcar.control.UsersController;

public class Facade {
    private QRCodeController qrCodeController;
    private ContractController contractController;
    private VehiclesController vehiclesController;
    private ClientsController clientsController;
    private UsersController usersController;

    public Facade()
    {
        this.qrCodeController = new QRCodeController();
        this.contractController = new ContractController();
        this.vehiclesController = new VehiclesController();
        this.clientsController = new ClientsController();
        this.usersController = new UsersController();
    }


}
