package es.ufpi.br.qrcar.repository;

import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.Contract;

public class ContractsRepository implements IContractsRepository {
    private List<Contract> contracts;

    public ContractsRepository(){
        this.contracts = new LinkedList<Contract>();
    }

    public Boolean insertContract(Contract contract){
        if(contracts.add(contract))
            return true;
        return false;
    }

    public Boolean removeContract(Contract contract){
        if(contracts.remove(contract))
            return true;
        return false;
    }

    /**
     * Searches a contract by an id
     * @param contract_id user's email
     * @return Contract
     */
    public Contract searchContract(int contract_id){
        Contract aux = null;

        for (Contract c : contracts){
            if (c.getContract_id() == (contract_id)){
                aux = c;
                break;
            }else{
                aux = null;
            }
        }
        return aux;
    }

    /**
     * Lists all contracts on the repository
     * @return
     */
    public List<Contract> list(){
        return contracts;
    }

    /**
     * Edits a contract's entry on the repository
     * @return Boolean
     */
    public Boolean editContract(Contract original, Contract new_contract){
        for (Contract c : contracts){
            if (c.equals(original)){
                c = new_contract;
                return true;
            }
        }
        return false;
    }

    /**
     * Populates data of contracts randomly for tests purposes only
     */
    public void populateContractsRepository(){
        Contract contract1 = new Contract();
        contract1.setClient_cpf(123);
        contract1.setContract_id(321);
        contract1.setPrice(999);
        contract1.setPlate_ID("ABC-123");
        insertContract(contract1);
    }
}