
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Doctor as Doctor
import ProyectoCitas.Domains.responses.DoctorRes as DoctorRes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.Optional
import java.time.Instant


@Repository
class DoctorRepository {
   
   @Autowired
   private lateinit var DoctorRepositoryIfc: DoctorRepositoryIfc


    fun createDoctor(Doctor:Doctor):Doctor{
          return DoctorRepositoryIfc.save(Doctor)
    }

    fun GetDoctorById(id:Long):Optional<Doctor>{
         return DoctorRepositoryIfc.findById(id)
    }

    
    fun GetAllDoctors():MutableList<Doctor>{       
          return DoctorRepositoryIfc.findAll()
    }
    
    fun DeleteDoctor(id:Long){
          DoctorRepositoryIfc.DeleteById(id)
    }

}