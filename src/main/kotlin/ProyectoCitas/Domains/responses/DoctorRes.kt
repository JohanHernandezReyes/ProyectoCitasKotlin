package ProyectoCitas.Domains.responses

import java.time.Instant
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("doctores")
data class DoctorRes(
    @Id
    var id_doctor: Int?,
    
    val nombre: String,
    val apellido: String,
    val consultorio: Long,
    val especialidad: String,
    val correo: String?,
    val created_at: Instant?,
    val updated_at: Instant?
){
   
}