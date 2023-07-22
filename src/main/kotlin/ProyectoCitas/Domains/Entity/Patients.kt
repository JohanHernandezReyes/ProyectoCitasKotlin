package ProyectoCitas.Domains.Entity

import java.time.Instant
import javax.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@Entity
@Table(name = "pacientes")
@JsonIgnoreProperties(ignoreUnknown = true)
open class Patient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_paciente")
    open var id_paciente: Long=0,

    @Column(name="nombre")
    open var nombre: String,

    @Column(name="apellido")
    open var apellido: String,

    @Column(name="identif")
    open var identif: String,


    @Column(name="telefono")
    open var telefono: String?="",

    @Column(name="created_at")
    open var created_at: Instant = Instant.now(),

    @Column(name="updated_at")
    open var updated_at: Instant = Instant.now(),

    @OneToMany(cascade=arrayOf(CascadeType.PERSIST),mappedBy="identif_paciente")
    @get:JsonIgnore
    private val CitasPaciente: MutableList<Appointment> = ArrayList()
)
