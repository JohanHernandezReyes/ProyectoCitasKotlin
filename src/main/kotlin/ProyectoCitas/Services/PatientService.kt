package ProyectoCitas.Services

import org.springframework.stereotype.Service
import ProyectoCitas.Domains.Entity.Patient as Patient 
import ProyectoCitas.Domains.requests.PatientReq as PatientReq
import ProyectoCitas.Domains.responses.PatientRes as PatientRes
import org.springframework.beans.factory.annotation.Autowired
import ProyectoCitas.Repositories.PatientRepository
import java.time.Instant
import java.util.Optional


@Service
class PatientService{
  
   @Autowired
   private lateinit var PatientRepository: PatientRepository

    fun createPatient (request: PatientReq, header:String):PatientRes?{
          
          val paciente = PatientRepository.createPatient(
          Patient(
                    nombre = request.nombre,
                    apellido = request.apellido,
                    identif = request.identif ,
                    telefono = request.telefono,
                    created_at = Instant.now()
          ))
          
          return PatientRes(
                    id_paciente = paciente.id_paciente,
                    nombre = paciente.nombre,
                    apellido = paciente.apellido,
                    identif  = paciente.identif,
                    telefono = paciente.telefono,
                    created_at = paciente.created_at,
                    updated_at= null
          )
          println(header)
    }

    fun GetPatientById(id:Long):Optional<Patient> {
          var paciente: Optional<Patient> =  PatientRepository.GetPatientById(id)
          return paciente           
    }


     fun GetPatientByIdentif(identif:String):Optional<Patient> {
          var paciente: Optional<Patient> =  PatientRepository.GetPatientByIdentif(identif)
          return paciente           
    }

    
    fun GetAllPatients():MutableList<Patient>{
          var pacientes: MutableList<Patient> = PatientRepository.GetAllPatients()
          return pacientes
    }
    

    fun UpdatePatient(request: PatientReq, id:Long):Optional<Patient> {

          var paciente: Optional<Patient> =  PatientRepository.GetPatientById(id)
        
          if (paciente!=null){ 
    
                    PatientRepository.createPatient(
                    Patient(
                              nombre = request.nombre,
                              apellido = request.apellido,
                              identif  = request.identif ,
                              telefono = request.telefono,
                              updated_at = Instant.now()
                    ))
          }         
          
          return paciente

    }

    fun DeletePatient(id:Long){

          var paciente: Optional<Patient> =  PatientRepository.GetPatientById(id)
          if (paciente!=null){
                    PatientRepository.DeletePatient(id)
                    print("Id $id eliminado exitosamente")
         }

    }

    
}