package ProyectoCitas.Domains.requests
import org.jetbrains.annotations.NotNull
import java.time.Instant

data class DoctorReq(
    @field:NotNull("El nombre es requerido")
    val nombre: String,
    val apellido: String,
    val consultorio: Long,
    val especialidad: String,
    val correo: String?,
    val created_at: Instant?,
    val updated_at: Instant?
){

}