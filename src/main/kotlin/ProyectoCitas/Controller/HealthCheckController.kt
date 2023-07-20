
package ProyectoCitas.Controller

import ProyectoCitas.Constants.HEALT_CHECK as HEALTH_CHECK
import ProyectoCitas.Domains.responses.HealthCheckResponse as HealthCheckResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import  org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController{

    @GetMapping(HEALTH_CHECK)
    fun healthcheck():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}