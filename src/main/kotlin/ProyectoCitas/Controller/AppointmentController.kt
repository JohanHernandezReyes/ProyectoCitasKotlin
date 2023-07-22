
package ProyectoCitas.Controller

import ProyectoCitas.Constants.CITAS as Route
import ProyectoCitas.Domains.responses.HealthCheckResponse as HealthCheckResponse
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import ProyectoCitas.Domains.requests.AppointmentReq as AppointmentReq
import ProyectoCitas.Domains.responses.AppointmentRes as AppointmentRes
import ProyectoCitas.Domains.Entity.Appointment as Appointment
import ProyectoCitas.Services.AppointmentService
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.Valid
import java.util.Optional


@RestController
class AppointmentController{

    @Autowired
    private lateinit var AppointmentService:AppointmentService

    @GetMapping("$Route/list")
    fun getAllAppointments():MutableList<Appointment> = AppointmentService.GetAllAppointments()

    @GetMapping("$Route/{id}")
          fun geAppointmentById(@PathVariable("id") id: Long
    ):Optional<Appointment> = AppointmentService.GetAppointmentById(id)

    @PostMapping("$Route/create")
   fun createAppointment(
        @RequestBody @Valid request: AppointmentReq,
        @RequestHeader("HeaderExample") headerTest: String
    ):AppointmentRes? = AppointmentService.createAppointment(request, headerTest)

    @PutMapping("$Route/update/{id}")
    fun updateAppointment(
        @RequestBody @Valid request: AppointmentReq,
        @PathVariable("id") id: Long
    ):Optional<Appointment> = AppointmentService.UpdateAppointment(request, id)


    @DeleteMapping("$Route/delete/{id}")
    fun deleteAppointment(
        @PathVariable("id") id: Long
    ) = AppointmentService.DeleteAppointment(id)

}