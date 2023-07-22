
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Appointment as Appointment
import ProyectoCitas.Domains.responses.AppointmentRes as AppointmentRes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.Optional
import java.time.Instant


@Repository
class AppointmentRepository {
   
   @Autowired
   private lateinit var AppointmentRepositoryIfc: AppointmentRepositoryIfc


    fun createAppointment(Appointment:Appointment):Appointment{
          return AppointmentRepositoryIfc.save(Appointment)
    }

    fun GetAppointmentById(id:Long):Optional<Appointment>{
         return AppointmentRepositoryIfc.findById(id)
    }

    
    fun GetAllAppointments():MutableList<Appointment>{       
          return AppointmentRepositoryIfc.findAll()
    }
    
    fun DeleteAppointment(id:Long){
          AppointmentRepositoryIfc.DeleteAppointment(id)
    }

}