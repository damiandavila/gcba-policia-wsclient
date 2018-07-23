/**
 * ClienteDAOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php;

public class ClienteDAOServiceLocator extends org.apache.axis.client.Service implements ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOService {

    public ClienteDAOServiceLocator() {
    }


    public ClienteDAOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClienteDAOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClienteDAOPort
    private java.lang.String ClienteDAOPort_address = "https://ci.policiadelaciudad.gob.ar/WSACTASDIGITALESREPETIDOR/server.php";

    public java.lang.String getClienteDAOPortAddress() {
        return ClienteDAOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClienteDAOPortWSDDServiceName = "ClienteDAOPort";

    public java.lang.String getClienteDAOPortWSDDServiceName() {
        return ClienteDAOPortWSDDServiceName;
    }

    public void setClienteDAOPortWSDDServiceName(java.lang.String name) {
        ClienteDAOPortWSDDServiceName = name;
    }

    public ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOPort getClienteDAOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            System.out.println("======= getClienteDAOPort() - ClienteDAOPort_address: " + ClienteDAOPort_address);
            endpoint = new java.net.URL(ClienteDAOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClienteDAOPort(endpoint);
    }

    public ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOPort getClienteDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOBindingStub _stub = new ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOBindingStub(portAddress, this);
            _stub.setPortName(getClienteDAOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClienteDAOPortEndpointAddress(java.lang.String address) {
        ClienteDAOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOPort.class.isAssignableFrom(serviceEndpointInterface)) {
                ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOBindingStub _stub = new ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.ClienteDAOBindingStub(new java.net.URL(ClienteDAOPort_address), this);
                _stub.setPortName(getClienteDAOPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ClienteDAOPort".equals(inputPortName)) {
            return getClienteDAOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://ci.policiadelaciudad.gob.ar/WSACTASDIGITALESREPETIDOR/server.php", "ClienteDAOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://ci.policiadelaciudad.gob.ar/WSACTASDIGITALESREPETIDOR/server.php", "ClienteDAOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClienteDAOPort".equals(portName)) {
            setClienteDAOPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
