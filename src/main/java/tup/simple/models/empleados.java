package tup.simple.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity // This tells Hibernate to make a table out of this class
public class empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Character sexo;

    private Date fechanac;

    private Date fechaincor;

    private Float salario;

    private Float comision;

    @OneToOne(optional=false)
    @JoinColumn(name="idcargo")
    private cargos idcargo;

    @ManyToOne
    @JoinColumn(name="jefe")
    private directores jefe;

    private Long codigodepto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public Date getFechaincor() {
        return fechaincor;
    }

    public void setFechaincor(Date fechaincor) {
        this.fechaincor = fechaincor;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }

    public String getCargo() {
        return idcargo.getCargo();
    }

    public void setCargo(cargos idcargo) {
        this.idcargo = idcargo;
    }

    public String getJefe() {
        return jefe.getNombre();
    }

    public void setJefe(directores jefe) {
        this.jefe = jefe;
    }

    public Long getCodigodepto() {
        return codigodepto;
    }

    public void setCodigodepto(Long codigodepto) {
        this.codigodepto = codigodepto;
    }

    
}
