package ProyectoCitas.Domains.requests
import org.jetbrains.annotations.NotNull

data class AppointmentReq(
    @field:NotNull("El horario de la cita es requerido")
    val horario: String,

    val id_doctor: Long,
    val identif_paciente: String
    
){

}