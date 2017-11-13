package es.ufpi.br.qrcar.control;

import es.ufpi.br.qrcar.repository.ContractsRepository;
import es.ufpi.br.qrcar.entity.Contract;

import java.io.Serializable;
import java.util.List;

public class ContractController implements Serializable
{
    private ContractsRepository contracts;

    public ContractController()
    {
        this.contracts = new ContractsRepository();
    }

    public Boolean insertContract(Contract c)
    {
        if (this.contracts.insertContract(c))
            return true;
        else
            return false;
    }

    public Boolean removeContract(Contract c)
    {
        if (this.contracts.removeContract(c))
            return true;
        else
            return false;
    }

    public List<Contract> listContracts()
    {
        return this.contracts.list();
    }

    public Contract searchContract(int contract_id)
    {
        return this.contracts.searchContract(contract_id);
    }

    public Boolean editContract(Contract oldC, Contract newC)
    {
        if (this.contracts.editContract(oldC, newC))
            return true;
        else
            return false;
    }
}
