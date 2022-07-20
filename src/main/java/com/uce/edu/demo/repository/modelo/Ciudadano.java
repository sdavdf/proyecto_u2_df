package com.uce.edu.demo.repository.modelo;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {

    @Id
    @Column(name = "ciud_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_id_seq")
    @SequenceGenerator(name = "ciud_id_seq", sequenceName = "ciud_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "ciud_nombre")
    private String nombre;

    @Column(name = "ciud_apellido")
    private String apellido;

    @OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
    private Empleado empleado;

    // SET Y GET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}