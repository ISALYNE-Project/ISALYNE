package eShop.zCosmapek_Configurations;

import cosmapek.interfaces.IExecution;

/**
 * Created by COSMAPE-Feature IDE on 2016-jul-11.
 * Feature: VisaB
 * Component: Conn_sensors_VisaBSensor
 *
 * Manages the Conn_sensors_VisaBSensor configuration.
 */
public class Conn_sensors_VisaBSensor implements IExecution,IInterfaceTags {
    private cosmapek.sensors.prov.IManager sens;
    private cosmapek.sensors.prov.ISensorUpdater sensISens;

    private conn_sensors_VisaBSensor.prov.IManager i_conn_sensors_VisaBSensor;
    private visaBSensor.prov.IManager i_visaBSensor;
    @Override
    public synchronized void execute() {
        sens = cosmapek.sensors.impl.ComponentFactory.createInstance();
        sensISens = (cosmapek.sensors.prov.ISensorUpdater) sens.getProvidedInterface(ISensorUpdaterTag);

        i_conn_sensors_VisaBSensor=conn_sensors_VisaBSensor.impl.ComponentFactory.createInstance();
        i_conn_sensors_VisaBSensor.setRequiredInterface(ISensorUpdaterTag, sensISens);

        i_visaBSensor = visaBSensor.impl.ComponentFactory.createInstance();
        i_visaBSensor.setRequiredInterface(ISensorUpdaterTag,
                i_conn_sensors_VisaBSensor.getProvidedInterface(ISensorUpdaterTag));
    }
}