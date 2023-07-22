
package ProyectoCitas.Controller

import ProyectoCitas.Constants.PACIENTES as Route
import ProyectoCitas.Domains.responses.HealthCheckResponse as HealthCheckResponse
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import ProyectoCitas.Domains.requests.PatientReq as PatientReq
import ProyectoCitas.Domains.responses.PatientRes as PatientRes
import ProyectoCitas.Services.PatientService
import ProyectoCitas.Domains.Entity.Patient as Patient
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.Valid
import java.util.Optional


@RestController
class PatientController{

    @Autowired
    private lateinit var PatientService:PatientService

    @GetMapping("$Route/list")
    fun getAllPatients():MutableList<Patient> = PatientService.GetAllPatients()

    @GetMapping("$Route/{id}")
        fun getPatientById(@PathVariable("id") id: Long
    ):Optional<Patient> = PatientService.GetPatientById(id)

     @GetMapping("$Route/identif/{identif}")
        fun getPatientByIdentif(@PathVariable("identif") identif: String
    ):Optional<Patient> = PatientService.GetPatientByIdentif(identif)


    @PostMapping("$Route/create")
       fun createPatient(
        @RequestBody @Valid request: PatientReq,
        @RequestHeader("HeaderExample") headerTest: String
    ):PatientRes? = PatientService.createPatient(request, headerTest)

    @PutMapping("$Route/update/{id}")
     fun updatePatient(
        @RequestBody @Valid request: PatientReq,
        @PathVariable("id") id: Long
    ):Optional<Patient> = PatientService.UpdatePatient(request, id)

    @DeleteMapping("$Route/delete/{id}")
    fun deletePatient(
        @PathVariable("id") id: Long
    ) = PatientService.DeletePatient(id)

}