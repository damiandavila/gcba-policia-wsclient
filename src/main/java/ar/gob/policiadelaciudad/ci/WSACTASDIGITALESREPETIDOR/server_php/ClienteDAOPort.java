/**
 * ClienteDAOPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php;

public interface ClienteDAOPort extends java.rmi.Remote {

    /**
     * Metodo de prueba de Web Service
     */
    public ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.Existe testWS() throws java.rmi.RemoteException;

    /**
     * Metodo para validar un Usuario para Actas Digitales
     */
    public ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php.Usuario validarAcc(java.lang.String usu, java.lang.String clv, java.lang.String pc) throws java.rmi.RemoteException;
}
