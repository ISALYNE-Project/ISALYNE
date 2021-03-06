package conn_MasterCardA_MasterCardASensor.impl;

import conn_MasterCardA_MasterCardASensor.prov.IManager;

/**
 * Created by COSMAPE-Feature IDE on 2016-jul-11.
 * Feature: MasterCardA
 * Component: Conn_MasterCardA_MasterCardASensor
 */
class Adapter
    implements masterCardASensor.req.IMasterCardManager, IInterfaceTags {
    private IManager manager;

    Adapter(IManager manager) {
        this.manager = manager;
    }

	//TODO: Adaptation of business methods
	//This class connects the business methods of the 
	//required interface 'masterCardASensor.req.IMasterCardManager' 
	//with business methods from the provided interface
	//'masterCardA.prov.IMasterCardManager'	
	
	//example of a business method
	/*
	@Override
    public synchronized type businessMethod(param){
        masterCardA.prov.IMasterCardManager comp_masterCardA =
                (masterCardA.prov.IMasterCardManager) this.manager.getRequiredInterface(IMasterCardManagerTag);
        return comp_masterCardA.businessMethod(param);
    }
	*/
    public synchronized String pagarMaster(float valor ,String nomeCartao , String numeroCartao,String validadeCartao,String cifCartao,int parcelas){
    	masterCardA.prov.IMasterCardManager comp_masterCardA =
                (masterCardA.prov.IMasterCardManager) this.manager.getRequiredInterface(IMasterCardManagerTag);
        return comp_masterCardA.pagarMaster(valor, nomeCartao, numeroCartao, validadeCartao, cifCartao,parcelas);
    }
    public synchronized boolean getDisponibilidade(){
    	masterCardA.prov.IMasterCardManager comp_masterCardA =
                (masterCardA.prov.IMasterCardManager) this.manager.getRequiredInterface(IMasterCardManagerTag);
        return comp_masterCardA.getDisponibilidade();
    }
	
    
}