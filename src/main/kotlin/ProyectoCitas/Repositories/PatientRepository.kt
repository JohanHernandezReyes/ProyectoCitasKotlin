
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Patient as Patient
import ProyectoCitas.Domains.responses.PatientRes as PatientRes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.Optional
import java.time.Instant


@Repository
class PatientRepository {
   
   @Autowired
   private lateinit var PatientRepositoryIfc: PatientRepositoryIfc


    fun createPatient(Patient:Patient):Patient{
          return PatientRepositoryIfc.save(Patient)
    }

    fun GetPatientById(id:Long):Optional<Patient>{
         return PatientRepositoryIfc.findById(id)
    }
    
   fun GetPatientByIdentif(identif:String):Optional<Patient>{
         return PatientRepositoryIfc.findByIdentif(identif)
    }

    
    fun GetAllPatients():MutableList<Patient>{       
          return PatientRepositoryIfc.findAll()
    }
    
    fun DeletePatient(id:Long){
          PatientRepositoryIfc.DeletePatient(id)
    }

}