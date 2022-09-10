package tup.simple.models;

import java.sql.Date;

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

    @ManyToOne(optional = false)
    @JoinColumn(name = "cargo")
    private cargos cargo;

    @ManyToOne
    @JoinColumn(name = "jefe")
    private directores jefe;

    @ManyToOne
    @JoinColumn(name = "codigodepto")
    private departamentos codigodepto;

    @OneToOne
    @JoinColumn(name = "fichamedica")
    private fichamedica fichamedica;

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
        return cargo.getCargo();
    }

    public void setCargo(cargos cargo) {
        this.cargo = cargo;
    }

    public String getJefe() {
        return jefe.getNombre() + ' ' + jefe.getApellido().substring(0,1);
    }

    public void setJefe(directores jefe) {
        this.jefe = jefe;
    }

    public String getCodigodepto() {
        return codigodepto.getCiudad();
    }

    public void setCodigodepto(departamentos codigodepto) {
        this.codigodepto = codigodepto;
    }

    public String getFichamedica() {
        return fichamedica.getObrasoc();
    }

    public void setFichamedica(fichamedica fichamedica) {
        this.fichamedica = fichamedica;
    }

}
