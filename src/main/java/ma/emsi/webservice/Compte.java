package ma.emsi.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Date;

@ XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private Integer code ;
    private double solde;
    private Date dateCreation;

    public Compte(Integer code, double v, Date date) {
        this.code = code;
        this.solde = v;
        this.dateCreation = date;
    }


    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
