package ProyectoCitas.Domains.responses

import java.time.Instant

data class AppointmentRes(
   
    val id_cita: Long, 
    val horario: String,
    val id_doctor: Long,
    val identif_paciente: String,
    val nombre_paciente:String,
    val nombre_doctor:String,
    val consultorio: Long,
    val especialidad: String,
    val created_at: Instant?,
    val updated_at: Instant?
){
   
}