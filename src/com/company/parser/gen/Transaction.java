//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.29 at 02:22:01 PM IST 
//


package com.company.parser.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}operations"/>
 *         &lt;element ref="{}commit"/>
 *       &lt;/sequence>
 *       &lt;attribute name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequenceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createdEdits" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failedEdits" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operations",
    "commit"
})
@XmlRootElement(name = "transaction")
public class Transaction {

    @XmlElement(required = true)
    protected Operations operations;
    @XmlElement(required = true)
    protected Commit commit;
    @XmlAttribute(name = "transactionId")
    protected String transactionId;
    @XmlAttribute(name = "sequenceId")
    protected String sequenceId;
    @XmlAttribute(name = "branchId")
    protected String branchId;
    @XmlAttribute(name = "createdEdits")
    protected String createdEdits;
    @XmlAttribute(name = "failedEdits")
    protected String failedEdits;

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     * @return
     *     possible object is
     *     {@link Commit }
     *     
     */
    public Commit getCommit() {
        return commit;
    }

    /**
     * Sets the value of the commit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commit }
     *     
     */
    public void setCommit(Commit value) {
        this.commit = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the createdEdits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedEdits() {
        return createdEdits;
    }

    /**
     * Sets the value of the createdEdits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedEdits(String value) {
        this.createdEdits = value;
    }

    /**
     * Gets the value of the failedEdits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedEdits() {
        return failedEdits;
    }

    /**
     * Sets the value of the failedEdits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedEdits(String value) {
        this.failedEdits = value;
    }

}
