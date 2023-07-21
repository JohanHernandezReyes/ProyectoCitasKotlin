
package ProyectoCitas.Controller

import ProyectoCitas.Constants.DOCTORES as Route
import ProyectoCitas.Domains.responses.HealthCheckResponse as HealthCheckResponse
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import ProyectoCitas.Domains.requests.DoctorReq as DoctorReq
import ProyectoCitas.Domains.responses.DoctorRes as DoctorRes
import ProyectoCitas.Services.DoctorService
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.Valid


@RestController
class DoctorController{

    @Autowired
    private lateinit var DoctorService:DoctorService

    @GetMapping("$Route/list")
    fun getAllDoctors():List<DoctorRes> = DoctorService.GetAllDoctors()

    @GetMapping("$Route/{id}")
    fun getDoctorById(
        @PathVariable("id") id: Int
    ):DoctorRes = DoctorService.GetDoctorById(id)

    @PostMapping("$Route/create")
    fun createDoctor(
        @RequestBody @Valid request: DoctorReq,
        @RequestHeader("HeaderExample") headerTest: String
    ):DoctorRes = DoctorService.createDoctor(request, headerTest)

    @PutMapping("$Route/update/{id}")
    fun updateDoctor(
        @PathVariable("id") id: Int
    ):DoctorRes = DoctorService.UpdateDoctor(id)

    @DeleteMapping("$Route/delete/{id}")
    fun deleteDoctor(
        @PathVariable("id") id: Int
    ) = DoctorService.DeleteDoctor(id)

}