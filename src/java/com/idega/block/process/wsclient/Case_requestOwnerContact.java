/**
 * Case_requestOwnerContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.idega.block.process.wsclient;

public class Case_requestOwnerContact  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String social_security;

    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String postalcode;

    private java.lang.String phone;

    private java.lang.String gsm;

    private java.lang.String email;

    private java.lang.String title;

    private java.lang.String department;

    private java.lang.String case_role;

    public Case_requestOwnerContact() {
    }

    public Case_requestOwnerContact(
           java.lang.String name,
           java.lang.String social_security,
           java.lang.String address,
           java.lang.String city,
           java.lang.String postalcode,
           java.lang.String phone,
           java.lang.String gsm,
           java.lang.String email,
           java.lang.String title,
           java.lang.String department,
           java.lang.String case_role) {
           this.name = name;
           this.social_security = social_security;
           this.address = address;
           this.city = city;
           this.postalcode = postalcode;
           this.phone = phone;
           this.gsm = gsm;
           this.email = email;
           this.title = title;
           this.department = department;
           this.case_role = case_role;
    }


    /**
     * Gets the name value for this Case_requestOwnerContact.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Case_requestOwnerContact.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the social_security value for this Case_requestOwnerContact.
     * 
     * @return social_security
     */
    public java.lang.String getSocial_security() {
        return social_security;
    }


    /**
     * Sets the social_security value for this Case_requestOwnerContact.
     * 
     * @param social_security
     */
    public void setSocial_security(java.lang.String social_security) {
        this.social_security = social_security;
    }


    /**
     * Gets the address value for this Case_requestOwnerContact.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Case_requestOwnerContact.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this Case_requestOwnerContact.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Case_requestOwnerContact.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the postalcode value for this Case_requestOwnerContact.
     * 
     * @return postalcode
     */
    public java.lang.String getPostalcode() {
        return postalcode;
    }


    /**
     * Sets the postalcode value for this Case_requestOwnerContact.
     * 
     * @param postalcode
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }


    /**
     * Gets the phone value for this Case_requestOwnerContact.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Case_requestOwnerContact.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the gsm value for this Case_requestOwnerContact.
     * 
     * @return gsm
     */
    public java.lang.String getGsm() {
        return gsm;
    }


    /**
     * Sets the gsm value for this Case_requestOwnerContact.
     * 
     * @param gsm
     */
    public void setGsm(java.lang.String gsm) {
        this.gsm = gsm;
    }


    /**
     * Gets the email value for this Case_requestOwnerContact.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Case_requestOwnerContact.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the title value for this Case_requestOwnerContact.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Case_requestOwnerContact.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the department value for this Case_requestOwnerContact.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Case_requestOwnerContact.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the case_role value for this Case_requestOwnerContact.
     * 
     * @return case_role
     */
    public java.lang.String getCase_role() {
        return case_role;
    }


    /**
     * Sets the case_role value for this Case_requestOwnerContact.
     * 
     * @param case_role
     */
    public void setCase_role(java.lang.String case_role) {
        this.case_role = case_role;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Case_requestOwnerContact)) return false;
        Case_requestOwnerContact other = (Case_requestOwnerContact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.social_security==null && other.getSocial_security()==null) || 
             (this.social_security!=null &&
              this.social_security.equals(other.getSocial_security()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.postalcode==null && other.getPostalcode()==null) || 
             (this.postalcode!=null &&
              this.postalcode.equals(other.getPostalcode()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.gsm==null && other.getGsm()==null) || 
             (this.gsm!=null &&
              this.gsm.equals(other.getGsm()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.case_role==null && other.getCase_role()==null) || 
             (this.case_role!=null &&
              this.case_role.equals(other.getCase_role())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSocial_security() != null) {
            _hashCode += getSocial_security().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getPostalcode() != null) {
            _hashCode += getPostalcode().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getGsm() != null) {
            _hashCode += getGsm().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getCase_role() != null) {
            _hashCode += getCase_role().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Case_requestOwnerContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Case.case", "case_requestOwnerContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("social_security");
        elemField.setXmlName(new javax.xml.namespace.QName("", "social_security"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gsm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gsm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "case_role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
