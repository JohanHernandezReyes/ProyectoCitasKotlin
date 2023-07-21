package ProyectoCitas.Domains.requests
import org.jetbrains.annotations.NotNull

data class PatientReq(
    @field:NotNull("El nombre es requerido")
    val nombre: String,

    val apellido: String,
    val identif: String,
    val telefono: String?
){

}