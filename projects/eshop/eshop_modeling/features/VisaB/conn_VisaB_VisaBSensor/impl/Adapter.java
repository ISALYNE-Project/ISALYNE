package conn_VisaB_VisaBSensor.impl;

import conn_VisaB_VisaBSensor.prov.IManager;

/**
 * Created by COSMAPE-Feature IDE on 2016-jul-11.
 * Feature: VisaB
 * Component: Conn_VisaB_VisaBSensor
 */
class Adapter
    implements visaBSensor.req.IVisaManager, IInterfaceTags {
    private IManager manager;

    Adapter(IManager manager) {
        this.manager = manager;
    }

	//TODO: Adaptation of business methods
	//This class connects the business methods of the 
	//required interface 'visaBSensor.req.IVisaManager' 
	//with business methods from the provided interface
	//'visaB.prov.IVisaManager'	
	
	//example of a business method
	/*
	@Override
    public synchronized type businessMethod(param){
        visaB.prov.IVisaManager comp_visaB =
                (visaB.prov.IVisaManager) this.manager.getRequiredInterface(IVisaManagerTag);
        return comp_visaB.businessMethod(param);
    }
	*/
	
    
}