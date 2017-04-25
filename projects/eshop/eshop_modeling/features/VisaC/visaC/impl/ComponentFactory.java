package visaC.impl;

import visaC.prov.IManager;

/**
 * Created by COSMAPE-Feature IDE on 2016-jul-11.
 * Feature: VisaC
 * Component: VisaC
 */
public class ComponentFactory {
    private static IManager manager = null;

    private ComponentFactory() {
    }

    public static synchronized IManager createInstance() {
        if (manager == null)
            manager = new Manager();
        return manager;
    }
}