package es.ufpi.br.qrcar.repository;

import java.util.List;
import es.ufpi.br.qrcar.entity.Contract;

public interface IContractsRepository {
    public Boolean insertContract(Contract c);
    public Boolean removeContract(Contract c);
    public List<Contract> list();
    public Contract searchContract(int contract_id);
    public Boolean editContract(Contract original, Contract new_contract);
}