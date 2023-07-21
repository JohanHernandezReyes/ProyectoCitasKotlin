package ProyectoCitas.Domains.responses

import java.time.Instant
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("citas")
data class AppointmentRes(
    @Id
    var id_cita: Int?,
    
    val horario: String,
    val id_doctor: Int,
    val identif_paciente: String,
    val nombre_paciente:String,
    val nombre_doctor:String,
    val consultorio: Long,
    val especialidad: String,
    val created_at: Instant?,
    val updated_at: Instant?
){
   
}