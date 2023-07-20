
package ProyectoCitas.Domains.responses


import org.springframework.http.HttpStatus

data class HealthCheckResponse(
    
    val statusOK:String = HttpStatus.OK.name
)