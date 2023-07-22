package ProyectoCitas.Domains.requests
import org.jetbrains.annotations.NotNull
import ProyectoCitas.Domains.Entity.Doctor as Doctor
import ProyectoCitas.Domains.Entity.Patient as Patient

data class AppointmentReq(
    @field:NotNull("El horario de la cita es requerido")
    val horario: String,
    val id_doctor: Doctor,
    val identif_paciente: Patient
    
){

}