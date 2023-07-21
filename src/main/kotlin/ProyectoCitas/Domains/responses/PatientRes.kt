package ProyectoCitas.Domains.responses

import java.time.Instant
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("pacientes")
data class PatientRes(
    @Id
    var id_paciente: Int?,
    
    val apellido: String,
    val identif: String,
    val telefono: String?
    val created_at: Instant?,
    val updated_at: Instant?
){
   
}