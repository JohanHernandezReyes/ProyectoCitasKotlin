package ProyectoCitas.Services

import org.springframework.stereotype.Service
import ProyectoCitas.Domains.Entity.Doctor as Doctor
import ProyectoCitas.Domains.requests.DoctorReq as DoctorReq
import ProyectoCitas.Domains.responses.DoctorRes as DoctorRes
import org.springframework.beans.factory.annotation.Autowired
import ProyectoCitas.Repositories.DoctorRepository
import java.time.Instant
import java.util.Optional


@Service
class DoctorService{
    
   @Autowired
   private lateinit var DoctorRepository: DoctorRepository

    fun createDoctor(request: DoctorReq, header:String):DoctorRes?{
          
          val doctor = DoctorRepository.createDoctor(
          Doctor(
                    nombre = request.nombre,
                    apellido = request.apellido,
                    especialidad = request.especialidad,
                    correo = request.correo,
                    consultorio = request.consultorio,
                    created_at = Instant.now()
          ))
          
          return DoctorRes(
                    id_doctor = doctor.id_doctor,
<<<<<<< HEAD
                    nombre = doctor.nombre,
                    apellido = doctor.apellido,
                    especialidad = doctor.especialidad,
                    correo = doctor.correo,
                    consultorio = doctor.consultorio,
                    created_at = doctor.created_at,
=======
                    nombre = request.nombre,
                    apellido = request.apellido,
                    especialidad = request.especialidad,
                    correo = request.correo,
                    consultorio = request.consultorio,
                    created_at = request.created_at,
>>>>>>> a9dd4bf (Actualización Repository y entities)
                    updated_at= null
          )
          println(header)
    }

    fun GetDoctorById(id:Long):Optional<Doctor> {
          var doctor: Optional<Doctor> =  DoctorRepository.GetDoctorById(id)
          return doctor           
    }

    
    fun GetAllDoctors():MutableList<Doctor>{
          var doctores: MutableList<Doctor> = DoctorRepository.GetAllDoctors()
          return doctores
    }
    

    fun UpdateDoctor(request: DoctorReq, id:Long):Optional<Doctor> {
          var doctor: Optional<Doctor> =  DoctorRepository.GetDoctorById(id)
        
          if (doctor!=null){ 
    
                    DoctorRepository.createDoctor(
                    Doctor(
                              nombre = request.nombre,
                              apellido = request.apellido,
                              especialidad = request.especialidad,
                              correo = request.correo,
                              consultorio = request.consultorio,
                              updated_at = Instant.now()
                    ))
          }         
          
          return doctor

    }

    fun DeleteDoctor(id:Long){
          var doctor: Optional<Doctor> =  DoctorRepository.GetDoctorById(id)
          if (doctor!=null){
                    DoctorRepository.DeleteDoctor(id)
                    print("Id $id eliminado exitosamente")
         }

    }

    
}