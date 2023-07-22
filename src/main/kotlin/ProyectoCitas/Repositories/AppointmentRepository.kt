
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


<<<<<<< HEAD
    fun createAppointment(Appointment:Appointment):Appointment{
          return AppointmentRepositoryIfc.save(Appointment)
    }

    fun GetAppointmentById(id:Long):Optional<Appointment>{
=======
    fun createAppointment(Appointmentr:Appointment):Appointment{
          return AppointmentRepositoryIfc.save(Appointment)
    }

    fun GetAppointmentrById(id:Long):Optional<Appointmentr>{
>>>>>>> a9dd4bf (Actualización Repository y entities)
         return AppointmentRepositoryIfc.findById(id)
    }

    
    fun GetAllAppointments():MutableList<Appointment>{       
          return AppointmentRepositoryIfc.findAll()
    }
    
    fun DeleteAppointment(id:Long){
<<<<<<< HEAD
          AppointmentRepositoryIfc.DeleteAppointment(id)
=======
          AppointmentRepositoryIfc.DeleteById(id)
>>>>>>> a9dd4bf (Actualización Repository y entities)
    }

}