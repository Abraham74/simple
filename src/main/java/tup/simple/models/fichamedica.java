package tup.simple.models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class fichamedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmedfic;

    private String obrasoc;

    private String preocupacional;

    private Date fechapreocupacional;

    private String patprevias;

    public Long getIdmedfic() {
        return idmedfic;
    }

    public void setIdmedfic(Long idmedfic) {
        this.idmedfic = idmedfic;
    }

    public String getObrasoc() {
        return obrasoc;
    }

    public void setObrasoc(String obrasoc) {
        this.obrasoc = obrasoc;
    }

    public String getPreocupacional() {
        return preocupacional;
    }

    public void setPreocupacional(String preocupacional) {
        this.preocupacional = preocupacional;
    }

    public Date getFechapreocupacional() {
        return fechapreocupacional;
    }

    public void setFechapreocupacional(Date fechapreocupacional) {
        this.fechapreocupacional = fechapreocupacional;
    }

    public String getPatprevias() {
        return patprevias;
    }

    public void setPatprevias(String patprevias) {
        this.patprevias = patprevias;
    }

    
   
    
}