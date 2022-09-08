package tup.simple.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class departamentos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coddpto;

    private String nombredpto;

    private String ciudad;

    private Long coddirector;

    public Long getCoddpto() {
        return coddpto;
    }

    public void setCoddpto(Long coddpto) {
        this.coddpto = coddpto;
    }

    public String getNombredpto() {
        return nombredpto;
    }

    public void setNombredpto(String nombredpto) {
        this.nombredpto = nombredpto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Long getCoddirector() {
        return coddirector;
    }

    public void setCoddirector(Long coddirector) {
        this.coddirector = coddirector;
    }

    

}
