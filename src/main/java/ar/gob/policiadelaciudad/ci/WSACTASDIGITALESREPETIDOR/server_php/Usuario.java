/**
 * Usuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gob.policiadelaciudad.ci.WSACTASDIGITALESREPETIDOR.server_php;

public class Usuario  implements java.io.Serializable {
    private java.lang.String gr_desc;

    private java.lang.String usua_permiso;

    private java.lang.String per_apellido;

    private java.lang.String usu_password;

    private java.lang.String usu_legajo;

    private java.lang.String per_nombre;

    private java.lang.String per_destino;

    private java.lang.String dep_desc;

    private java.lang.String error;

    private java.lang.String errorDesc;

    private java.lang.Integer apli_id;

    private java.lang.String apli_desc;

    private java.lang.String per_doc;

    private java.lang.String email;

    private java.lang.String per_cuil;

    public Usuario() {
    }

    public Usuario(
           java.lang.String gr_desc,
           java.lang.String usua_permiso,
           java.lang.String per_apellido,
           java.lang.String usu_password,
           java.lang.String usu_legajo,
           java.lang.String per_nombre,
           java.lang.String per_destino,
           java.lang.String dep_desc,
           java.lang.String error,
           java.lang.String errorDesc,
           java.lang.Integer apli_id,
           java.lang.String apli_desc,
           java.lang.String per_doc,
           java.lang.String email,
           java.lang.String per_cuil) {
           this.gr_desc = gr_desc;
           this.usua_permiso = usua_permiso;
           this.per_apellido = per_apellido;
           this.usu_password = usu_password;
           this.usu_legajo = usu_legajo;
           this.per_nombre = per_nombre;
           this.per_destino = per_destino;
           this.dep_desc = dep_desc;
           this.error = error;
           this.errorDesc = errorDesc;
           this.apli_id = apli_id;
           this.apli_desc = apli_desc;
           this.per_doc = per_doc;
           this.email = email;
           this.per_cuil = per_cuil;
    }


    /**
     * Gets the gr_desc value for this Usuario.
     * 
     * @return gr_desc
     */
    public java.lang.String getGr_desc() {
        return gr_desc;
    }


    /**
     * Sets the gr_desc value for this Usuario.
     * 
     * @param gr_desc
     */
    public void setGr_desc(java.lang.String gr_desc) {
        this.gr_desc = gr_desc;
    }


    /**
     * Gets the usua_permiso value for this Usuario.
     * 
     * @return usua_permiso
     */
    public java.lang.String getUsua_permiso() {
        return usua_permiso;
    }


    /**
     * Sets the usua_permiso value for this Usuario.
     * 
     * @param usua_permiso
     */
    public void setUsua_permiso(java.lang.String usua_permiso) {
        this.usua_permiso = usua_permiso;
    }


    /**
     * Gets the per_apellido value for this Usuario.
     * 
     * @return per_apellido
     */
    public java.lang.String getPer_apellido() {
        return per_apellido;
    }


    /**
     * Sets the per_apellido value for this Usuario.
     * 
     * @param per_apellido
     */
    public void setPer_apellido(java.lang.String per_apellido) {
        this.per_apellido = per_apellido;
    }


    /**
     * Gets the usu_password value for this Usuario.
     * 
     * @return usu_password
     */
    public java.lang.String getUsu_password() {
        return usu_password;
    }


    /**
     * Sets the usu_password value for this Usuario.
     * 
     * @param usu_password
     */
    public void setUsu_password(java.lang.String usu_password) {
        this.usu_password = usu_password;
    }


    /**
     * Gets the usu_legajo value for this Usuario.
     * 
     * @return usu_legajo
     */
    public java.lang.String getUsu_legajo() {
        return usu_legajo;
    }


    /**
     * Sets the usu_legajo value for this Usuario.
     * 
     * @param usu_legajo
     */
    public void setUsu_legajo(java.lang.String usu_legajo) {
        this.usu_legajo = usu_legajo;
    }


    /**
     * Gets the per_nombre value for this Usuario.
     * 
     * @return per_nombre
     */
    public java.lang.String getPer_nombre() {
        return per_nombre;
    }


    /**
     * Sets the per_nombre value for this Usuario.
     * 
     * @param per_nombre
     */
    public void setPer_nombre(java.lang.String per_nombre) {
        this.per_nombre = per_nombre;
    }


    /**
     * Gets the per_destino value for this Usuario.
     * 
     * @return per_destino
     */
    public java.lang.String getPer_destino() {
        return per_destino;
    }


    /**
     * Sets the per_destino value for this Usuario.
     * 
     * @param per_destino
     */
    public void setPer_destino(java.lang.String per_destino) {
        this.per_destino = per_destino;
    }


    /**
     * Gets the dep_desc value for this Usuario.
     * 
     * @return dep_desc
     */
    public java.lang.String getDep_desc() {
        return dep_desc;
    }


    /**
     * Sets the dep_desc value for this Usuario.
     * 
     * @param dep_desc
     */
    public void setDep_desc(java.lang.String dep_desc) {
        this.dep_desc = dep_desc;
    }


    /**
     * Gets the error value for this Usuario.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this Usuario.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the errorDesc value for this Usuario.
     * 
     * @return errorDesc
     */
    public java.lang.String getErrorDesc() {
        return errorDesc;
    }


    /**
     * Sets the errorDesc value for this Usuario.
     * 
     * @param errorDesc
     */
    public void setErrorDesc(java.lang.String errorDesc) {
        this.errorDesc = errorDesc;
    }


    /**
     * Gets the apli_id value for this Usuario.
     * 
     * @return apli_id
     */
    public java.lang.Integer getApli_id() {
        return apli_id;
    }


    /**
     * Sets the apli_id value for this Usuario.
     * 
     * @param apli_id
     */
    public void setApli_id(java.lang.Integer apli_id) {
        this.apli_id = apli_id;
    }


    /**
     * Gets the apli_desc value for this Usuario.
     * 
     * @return apli_desc
     */
    public java.lang.String getApli_desc() {
        return apli_desc;
    }


    /**
     * Sets the apli_desc value for this Usuario.
     * 
     * @param apli_desc
     */
    public void setApli_desc(java.lang.String apli_desc) {
        this.apli_desc = apli_desc;
    }


    /**
     * Gets the per_doc value for this Usuario.
     * 
     * @return per_doc
     */
    public java.lang.String getPer_doc() {
        return per_doc;
    }


    /**
     * Sets the per_doc value for this Usuario.
     * 
     * @param per_doc
     */
    public void setPer_doc(java.lang.String per_doc) {
        this.per_doc = per_doc;
    }


    /**
     * Gets the email value for this Usuario.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Usuario.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the per_cuil value for this Usuario.
     * 
     * @return per_cuil
     */
    public java.lang.String getPer_cuil() {
        return per_cuil;
    }


    /**
     * Sets the per_cuil value for this Usuario.
     * 
     * @param per_cuil
     */
    public void setPer_cuil(java.lang.String per_cuil) {
        this.per_cuil = per_cuil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Usuario)) return false;
        Usuario other = (Usuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gr_desc==null && other.getGr_desc()==null) || 
             (this.gr_desc!=null &&
              this.gr_desc.equals(other.getGr_desc()))) &&
            ((this.usua_permiso==null && other.getUsua_permiso()==null) || 
             (this.usua_permiso!=null &&
              this.usua_permiso.equals(other.getUsua_permiso()))) &&
            ((this.per_apellido==null && other.getPer_apellido()==null) || 
             (this.per_apellido!=null &&
              this.per_apellido.equals(other.getPer_apellido()))) &&
            ((this.usu_password==null && other.getUsu_password()==null) || 
             (this.usu_password!=null &&
              this.usu_password.equals(other.getUsu_password()))) &&
            ((this.usu_legajo==null && other.getUsu_legajo()==null) || 
             (this.usu_legajo!=null &&
              this.usu_legajo.equals(other.getUsu_legajo()))) &&
            ((this.per_nombre==null && other.getPer_nombre()==null) || 
             (this.per_nombre!=null &&
              this.per_nombre.equals(other.getPer_nombre()))) &&
            ((this.per_destino==null && other.getPer_destino()==null) || 
             (this.per_destino!=null &&
              this.per_destino.equals(other.getPer_destino()))) &&
            ((this.dep_desc==null && other.getDep_desc()==null) || 
             (this.dep_desc!=null &&
              this.dep_desc.equals(other.getDep_desc()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.errorDesc==null && other.getErrorDesc()==null) || 
             (this.errorDesc!=null &&
              this.errorDesc.equals(other.getErrorDesc()))) &&
            ((this.apli_id==null && other.getApli_id()==null) || 
             (this.apli_id!=null &&
              this.apli_id.equals(other.getApli_id()))) &&
            ((this.apli_desc==null && other.getApli_desc()==null) || 
             (this.apli_desc!=null &&
              this.apli_desc.equals(other.getApli_desc()))) &&
            ((this.per_doc==null && other.getPer_doc()==null) || 
             (this.per_doc!=null &&
              this.per_doc.equals(other.getPer_doc()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.per_cuil==null && other.getPer_cuil()==null) || 
             (this.per_cuil!=null &&
              this.per_cuil.equals(other.getPer_cuil())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGr_desc() != null) {
            _hashCode += getGr_desc().hashCode();
        }
        if (getUsua_permiso() != null) {
            _hashCode += getUsua_permiso().hashCode();
        }
        if (getPer_apellido() != null) {
            _hashCode += getPer_apellido().hashCode();
        }
        if (getUsu_password() != null) {
            _hashCode += getUsu_password().hashCode();
        }
        if (getUsu_legajo() != null) {
            _hashCode += getUsu_legajo().hashCode();
        }
        if (getPer_nombre() != null) {
            _hashCode += getPer_nombre().hashCode();
        }
        if (getPer_destino() != null) {
            _hashCode += getPer_destino().hashCode();
        }
        if (getDep_desc() != null) {
            _hashCode += getDep_desc().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getErrorDesc() != null) {
            _hashCode += getErrorDesc().hashCode();
        }
        if (getApli_id() != null) {
            _hashCode += getApli_id().hashCode();
        }
        if (getApli_desc() != null) {
            _hashCode += getApli_desc().hashCode();
        }
        if (getPer_doc() != null) {
            _hashCode += getPer_doc().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPer_cuil() != null) {
            _hashCode += getPer_cuil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Usuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ci.policiadelaciudad.gob.ar/WSACTASDIGITALESREPETIDOR/server.php", "Usuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gr_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gr_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usua_permiso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usua_permiso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("per_apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "per_apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usu_password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usu_password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usu_legajo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usu_legajo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("per_nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "per_nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("per_destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "per_destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dep_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dep_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apli_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apli_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apli_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apli_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("per_doc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "per_doc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("per_cuil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "per_cuil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
