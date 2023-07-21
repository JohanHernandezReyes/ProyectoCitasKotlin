
package ProyectoCitas.Controller

import ProyectoCitas.Constants.CITAS as Route
import ProyectoCitas.Domains.responses.HealthCheckResponse as HealthCheckResponse
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import ProyectoCitas.Domains.requests.AppointmentReq as AppointmentReq
import ProyectoCitas.Domains.responses.AppointmentRes as AppointmentRes
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.Valid


@RestController
class AppointmentController{

    @Autowired
    private lateinit var AppointmentService:AppointmentService

    @GetMapping("$Route/list")
    fun getAllAppointments():List<ResAppointment> = AppointmentService.GetAllAppointments()

    @GetMapping("$Route/{id}")
          fun geAppointmentById(@PathVariable("id") id: Int
    ):AppointmentRes = AppointmentService.GetAppointmentById(id)

    @PostMapping("$Route/create")
   fun createAppointment(
        @RequestBody @Valid request: AppointmentReq,
        @RequestHeader("HeaderExample") headerTest: String
    ):AppointmentPatient = AppointmentService.createAppointment(request, headerTest)un createAppointment():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)

    @PutMapping("$Route/update/{id}")
    fun updateAppointment(
        @PathVariable("id") id: Int
    ):AppointmentRes = AppointmentService.UpdateAppointment(id)

    @DeleteMapping("$Route/delete/{id}")
    fun deleteAppointment(
        @PathVariable("id") id: Int
    ) = AppointmentService.DeleteAppointment(id)

}