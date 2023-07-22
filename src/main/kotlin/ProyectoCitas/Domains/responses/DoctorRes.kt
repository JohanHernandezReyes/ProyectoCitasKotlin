
package ProyectoCitas.Domains.responses

import java.time.Instant

data class DoctorRes(
    val id_doctor: Long,
    val nombre: String,
    val apellido: String,
    val consultorio: Long,
    val especialidad: String,
    val correo: String?,
    val created_at: Instant?,
    val updated_at: Instant?
){

}