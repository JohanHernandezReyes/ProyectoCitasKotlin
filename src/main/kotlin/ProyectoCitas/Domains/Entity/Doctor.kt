package ProyectoCitas.Domains.Entity

import java.time.Instant
import javax.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@Entity
@Table(name = "doctores")
@JsonIgnoreProperties(ignoreUnknown = true)
open class Doctor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_doctor")
    open var id_doctor: Long=0,

    @Column(name="nombre")
    open var nombre: String,

    @Column(name="apellido")
    open var apellido: String,

    @Column(name="especialidad")
    open var especialidad: String,

    @Column(name="consultorio")
    open var consultorio: Long,

    @Column(name="correo")
    open var correo: String?="",

    @Column(name="created_at")
    open var created_at: Instant = Instant.now(),

    @Column(name="updated_at")
    open var updated_at: Instant = Instant.now(),

    @OneToMany(cascade=arrayOf(CascadeType.PERSIST),mappedBy="id_doctor")   
    @get:JsonIgnore
    private val CitasDoctor: MutableList<Appointment> = ArrayList()
    
)
