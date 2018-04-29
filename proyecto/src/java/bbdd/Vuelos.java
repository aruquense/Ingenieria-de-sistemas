/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aru
 */
@Entity
@Table(name = "VUELOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vuelos.findAll", query = "SELECT v FROM Vuelos v")
    , @NamedQuery(name = "Vuelos.findByIdVuelos", query = "SELECT v FROM Vuelos v WHERE v.idVuelos = :idVuelos")
    , @NamedQuery(name = "Vuelos.findByHorario", query = "SELECT v FROM Vuelos v WHERE v.horario = :horario")
    , @NamedQuery(name = "Vuelos.findByOrigen", query = "SELECT v FROM Vuelos v WHERE v.origen = :origen")
    , @NamedQuery(name = "Vuelos.findByDestino", query = "SELECT v FROM Vuelos v WHERE v.destino = :destino")
    , @NamedQuery(name = "Vuelos.findByCompa\u00f1ia", query = "SELECT v FROM Vuelos v WHERE v.compa\u00f1ia = :compa\u00f1ia")
    , @NamedQuery(name = "Vuelos.findByAvion", query = "SELECT v FROM Vuelos v WHERE v.avion = :avion")})
public class Vuelos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VUELOS")
    private Integer idVuelos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "HORARIO")
    private String horario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ORIGEN")
    private String origen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESTINO")
    private String destino;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "COMPA\u00d1IA")
    private String compañia;
    @Size(max = 200)
    @Column(name = "AVION")
    private String avion;

    public Vuelos() {
    }

    public Vuelos(Integer idVuelos) {
        this.idVuelos = idVuelos;
    }

    public Vuelos(Integer idVuelos, String horario, String origen, String destino, String compañia) {
        this.idVuelos = idVuelos;
        this.horario = horario;
        this.origen = origen;
        this.destino = destino;
        this.compañia = compañia;
    }

    public Integer getIdVuelos() {
        return idVuelos;
    }

    public void setIdVuelos(Integer idVuelos) {
        this.idVuelos = idVuelos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVuelos != null ? idVuelos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vuelos)) {
            return false;
        }
        Vuelos other = (Vuelos) object;
        if ((this.idVuelos == null && other.idVuelos != null) || (this.idVuelos != null && !this.idVuelos.equals(other.idVuelos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bbdd.Vuelos[ idVuelos=" + idVuelos + " ]";
    }
    
}
