package ProyectoCitas.Domains.responses

import java.time.Instant


data class PatientRes(
    val id_paciente: Long,
    val nombre: String, 
    val apellido: String,
    val identif: String,
    val telefono: String?,
    val created_at: Instant?,
    val updated_at: Instant?
){
   
}