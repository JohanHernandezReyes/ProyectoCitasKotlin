package ProyectoCitas.Domains.Entity

import java.time.Instant
import javax.persistence.*
import ProyectoCitas.Domains.Entity.Doctor as Doctor
import ProyectoCitas.Domains.Entity.Patient as Patient
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@Entity
@Table(name = "citas")
@JsonIgnoreProperties(ignoreUnknown = true)
open class Appointment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cita")
    open var id_cita: Long=0,

    @Column(name="horario")
    open var horario: String,

    @ManyToOne
    @JoinColumn(name="id_doctor", referencedColumnName = "id_doctor")
    open var id_doctor: Long,

    @ManyToOne
    @JoinColumn(name="identif_paciente", referencedColumnName ="identif_paciente")
    open var identif_paciente: String,

    @Column(name="created_at")
    open var created_at: Instant = Instant.now(),

    @Column(name="updated_at")
    open var updated_at: Instant = Instant.now()


)
