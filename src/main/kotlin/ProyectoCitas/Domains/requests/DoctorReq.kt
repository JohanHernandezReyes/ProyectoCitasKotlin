package ProyectoCitas.Domains.requests
import org.jetbrains.annotations.NotNull

data class DoctorReq(
    @field:NotNull("El nombre es requerido")
    val nombre: String,

    val apellido: String,
    val consultorio: Long,
    val especialidad: String,
    val correo: String?
){

}