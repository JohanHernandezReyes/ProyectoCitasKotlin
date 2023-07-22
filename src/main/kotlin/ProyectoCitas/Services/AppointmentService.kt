package ProyectoCitas.Services

import org.springframework.stereotype.Service
import ProyectoCitas.Domains.Entity.Appointment as Appointment
import ProyectoCitas.Domains.requests.AppointmentReq as AppointmentReq
import ProyectoCitas.Domains.responses.AppointmentRes as AppointmentRes
import org.springframework.beans.factory.annotation.Autowired
import ProyectoCitas.Repositories.AppointmentRepository
import java.time.Instant
import java.util.Optional


@Service
class AppointmentService{
    
   @Autowired
   private lateinit var AppointmentRepository: AppointmentRepository

    fun createAppointment(request: AppointmentReq, header:String):AppointmentRes?{   
          var cita =AppointmentRepository.createAppointment(
          Appointment(
                    horario = request.horario,
                    id_doctor = request.id_doctor,
                    identif_paciente = request.identif_paciente,
                    created_at = Instant.now()
          ))
         

          return AppointmentRes(
                    id_cita = cita.id_cita,
                    horario  = cita.horario,
                    id_doctor = cita.id_doctor.id_doctor,
                    identif_paciente = cita.identif_paciente.identif,                   
                    nombre_paciente =  cita.identif_paciente.nombre+" "+cita.identif_paciente.apellido,
                    nombre_doctor = cita.id_doctor.nombre+" "+cita.id_doctor.apellido,
                    consultorio = cita.id_doctor.consultorio,
                    especialidad =  cita.id_doctor.especialidad,
                    created_at = cita.created_at,
                    updated_at= null
          )
          println(header)
    }


    fun GetAppointmentById(id:Long):Optional<Appointment> {
          var cita: Optional< Appointment> =  AppointmentRepository.GetAppointmentById(id)
          return cita           
    }

    

    fun GetAllAppointments():MutableList<Appointment>{
          var citas: MutableList<Appointment> = AppointmentRepository.GetAllAppointments()
          return citas
    }
    

    fun UpdateAppointment(request: AppointmentReq, id:Long):Optional<Appointment> {

          var cita: Optional<Appointment> =  AppointmentRepository.GetAppointmentById(id)
        
          if (cita!=null){ 
    
                    AppointmentRepository.createAppointment(
                    Appointment(
                              horario  = request.horario,
                              id_doctor = request.id_doctor,
                              identif_paciente = request.identif_paciente,
                              updated_at = Instant.now()
                    ))
          }         
          
          return cita

    }

    fun DeleteAppointment(id:Long){
          var cita: Optional<Appointment> =  AppointmentRepository.GetAppointmentById(id)
          if (cita!=null){
                    AppointmentRepository.DeleteAppointment(id)
                    print("Id $id eliminado exitosamente")
         }

    }

    
}