package cosmapek.reader.core.io.xml;

import cosmapek.reader.core.IInterfaceTags;
import cosmapek.reader.prov.IManager;
import cosmapek.reader.req.IComponentManager;
import cosmapek.reader.req.IConnectorManager;
import cosmapek.reader.req.IFeatureManager;
import cosmapek.reader.req.ISensorManager;

/**
 * @author Junior Cupe Casquina
 */
public class XmlManager implements IInterfaceTags {
    private IManager manager;
    private IComponentManager compManager;
    private ISensorManager sensorManager;
    private IConnectorManager connectorManager;
    private IFeatureManager featureManager;

    public XmlManager(IManager manager) {
        this.manager = manager;
        this.compManager =
            (IComponentManager) this.manager.getRequiredInterface(IComponentManagerReq);
        this.sensorManager = (ISensorManager) this.manager.getRequiredInterface(ISensorManagerReq);
        this.connectorManager =
            (IConnectorManager) this.manager.getRequiredInterface(IConnectorManagerReq);
        this.featureManager =
            (IFeatureManager) this.manager.getRequiredInterface(IFeatureManagerReq);
    }
    private void getManagers() {
        compManager =
            (IComponentManager) this.manager.getRequiredInterface(IComponentManagerReq);
        sensorManager = (ISensorManager) this.manager.getRequiredInterface(ISensorManagerReq);
        connectorManager =
            (IConnectorManager) this.manager.getRequiredInterface(IConnectorManagerReq);
        featureManager =
            (IFeatureManager) this.manager.getRequiredInterface(IFeatureManagerReq);
    }
    public void createComponent(String name, String feature, boolean isSensor, int orderT) {
        getManagers();
        compManager.createAComponent(name, feature, isSensor, orderT);
    }

    public void createFeature(String name) {
        getManagers();
        featureManager.createAFeature(name);
    }

    public void createConnector(String name, String origin, String destination, int orderT) {
        getManagers();
        connectorManager.createAConnector(name, origin, destination, orderT);
    }

    public void createSensor(String name, String feature, boolean isSensor, int orderT) {
        getManagers();
        sensorManager.createASensor(name, feature, isSensor, orderT);
    }
}
