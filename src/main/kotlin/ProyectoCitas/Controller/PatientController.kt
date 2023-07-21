
package ProyectoCitas.Controller

import ProyectoCitas.Constants.PACIENTES as Route
import ProyectoCitas.Domains.responses.HealthCheckResponse as HealthCheckResponse
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import ProyectoCitas.Domains.requests.PatientReq as PatientReq
import ProyectoCitas.Domains.responses.PatientRes as PatientRes
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.Valid


@RestController
class PatientController{

     @Autowired
    private lateinit var PatientService:PatientService

    @GetMapping("$Route/list")
    fun getAllPatients():List<ResPatient> = PatientService.GetAllPatients()

    @GetMapping("$Route/{id}")
        fun getPatientById(@PathVariable("id") id: Int
    ):PatientRes = PatientService.GetPatientById(id)

    @PostMapping("$Route/create")
       fun createPatient(
        @RequestBody @Valid request: PatientReq,
        @RequestHeader("HeaderExample") headerTest: String
    ):DoctorPatient = DoctorService.createPatient(request, headerTest)

    @PutMapping("$Route/update/{id}")
     fun updatePatient(
        @PathVariable("id") id: Int
    ):PatientRes = PatientService.UpdatePatient(id)

    @DeleteMapping("$Route/delete/{id}")
    fun deletePatient(
        @PathVariable("id") id: Int
    ) = PatientService.DeletePatient(id)

}