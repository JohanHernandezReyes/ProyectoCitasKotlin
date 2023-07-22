package ProyectoCitas.Services

import org.springframework.stereotype.Service
import ProyectoCitas.Domains.Entity.Appointment as Appointment
import ProyectoCitas.Domains.requests.AppointmentReq as AppointmentReq
import ProyectoCitas.Domains.responses.AppointmentRes as AppointmentRes
import org.springframework.beans.factory.annotation.Autowired
import ProyectoCitas.Repositories.AppointmentRepository
<<<<<<< HEAD
import ProyectoCitas.Repositories.DoctorRepository
import ProyectoCitas.Repositories.PatientRepository
=======
>>>>>>> a9dd4bf (Actualización Repository y entities)
import java.time.Instant
import java.util.Optional
import ProyectoCitas.Domains.Entity.Doctor as Doctor
import ProyectoCitas.Domains.Entity.Patient as Patient


@Service
class AppointmentService{
    
   @Autowired
   private lateinit var AppointmentRepository: AppointmentRepository

   @Autowired
   private lateinit var DoctorRepository: DoctorRepository

   @Autowired
   private lateinit var PatientRepository: PatientRepository 

<<<<<<< HEAD
    fun createAppointment(request: AppointmentReq, header:String):AppointmentRes?{
=======
    fun createAppointmentr(request: AppointmentrReq, header:String):AppointmentRes?{
>>>>>>> a9dd4bf (Actualización Repository y entities)
          
          val cita =AppointmentRepository.createAppointment(
          Appointment(
                    horario = request.horario,
                    id_doctor = request.id_doctor,
                    identif_paciente = request.identif_paciente,
                    created_at = Instant.now()
          ))
<<<<<<< HEAD
          
          var nombre_paciente:String = ""
          var nombre_doctor:String = ""
          var consultorio:Long = 0
          var especialidad:String = ""
          
          var doctor: Optional<Doctor> =  DoctorRepository.GetDoctorById(request.id_doctor)
          if(doctor != null){
                    nombre_doctor = doctor.nombre+" "+doctor.apellido
                    consultorio = doctor.consultorio
                    especialidad = doctor.especialidad
          }
          
          var paciente: Optional<Patient> =  PatientRepository.GetPatientByIdentif(request.identif_paciente)
          if(paciente != null){
                    nombre_paciente:String = paciente.nombre+" "+paciente.apellido
          }


          return AppointmentRes(
                    id_cita = cita.id_cita,
                    horario  = cita.horario,
                    id_doctor = cita.id_doctor,
                    identif_paciente = cita.identif_paciente,                   
                    nombre_paciente =  nombre_paciente,
                    nombre_doctor = nombre_doctor,
                    consultorio = consultorio,
                    especialidad =  especialidad,
                    created_at = cita.created_at,
=======

          var doctor: Optional<Doctor> =  DoctorRepository.GetDoctorById(request.id_doctor)

          var paciente: Optional<Patient> =  PatientRepository.GetPatientByIdentif(request.identif_pacient)
          
          return AppointmentRes(
                    id_cita = doctor.id_cita,
                    horario  = request.horario,
                    id_doctor = request.id_doctor,
                    identif_paciente = request.identif_paciente,
                    nombre_paciente:paciente.nombre+" "paciente.apellido,
                    nombre_doctor:doctor.nombre+" "doctor.apellido,
                    consultorio: doctor.consultorio,
                    especialidad: doctor.especialidad,
                    created_at = request.created_at,
>>>>>>> a9dd4bf (Actualización Repository y entities)
                    updated_at= null
          )
          println(header)
    }

<<<<<<< HEAD
    fun GetAppointmentById(id:Long):Optional<Appointment> {
          var cita: Optional< Appointment> =  AppointmentRepository.GetAppointmentById(id)
=======
    fun GetAppointmentById(id:Long):Optional<Appointmentr> {
          var cita: Optional<Doctor> =  AppointmentRepository.GetAppointmentById(id)
>>>>>>> a9dd4bf (Actualización Repository y entities)
          return cita           
    }

    
<<<<<<< HEAD
    fun GetAllAppointments():MutableList<Appointment>{
=======
    fun GetAllAppointments():MutableList<Doctor>{
>>>>>>> a9dd4bf (Actualización Repository y entities)
          var citas: MutableList<Appointment> = AppointmentRepository.GetAllAppointments()
          return citas
    }
    

    fun UpdateAppointment(request: AppointmentReq, id:Long):Optional<Appointment> {
<<<<<<< HEAD
          var cita: Optional<Appointment> =  AppointmentRepository.GetAppointmentById(id)
=======
          var cita: Optional<Appointment> =  AppointmentRepository.GetAppointmentrById(id)
>>>>>>> a9dd4bf (Actualización Repository y entities)
        
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