package ProyectoCitas.Services

import org.springframework.stereotype.Service
import ProyectoCitas.Domains.requests.DoctorReq as DoctorReq
import ProyectoCitas.Domains.responses.DoctorRes as DoctorRes
import java.time.Instant


@Service
class DoctorService{

    fun createDoctor(request: DoctorReq, header:String):DoctorRes{
        println(header)
        return DoctorRes(
            id_doctor = 1 ,
            nombre= request.nombre,
            apellido= request.apellido,
            consultorio= request.consultorio,
            especialidad= request.especialidad,
            correo= request.correo,
            created_at = Instant.now(),
            updated_at = null
        )
    }

    fun GetDoctorById(id:Int):DoctorRes{
        return DoctorRes(
            id_doctor = id ,
            nombre= "",
            apellido= "",
            consultorio= 100,
            especialidad= "",
            correo= "",
            created_at = Instant.now(),
            updated_at = null
        )
    }

    
    fun GetAllDoctors():List<DoctorRes>{
          var doctores:List<DoctorRes> = listOf(
          DoctorRes(
            id_doctor = 1 ,
            nombre= "",
            apellido= "",
            consultorio= 100,
            especialidad= "",
            correo= "",
            created_at = Instant.now(),
            updated_at = null
          ),
          DoctorRes(
            id_doctor = 2 ,
            nombre= "",
            apellido= "",
            consultorio= 200,
            especialidad= "",
            correo= "",
            created_at = Instant.now(),
            updated_at = null
        ))

           return doctores
    }
    

    fun UpdateDoctor(id:Int):DoctorRes{
        return DoctorRes(
            id_doctor = id ,
            nombre= "",
            apellido= "",
            consultorio= 100,
            especialidad= "",
            correo= "",
            created_at = Instant.now(),
            updated_at = null
        )
    }

    fun DeleteDoctor(id:Int){
        print("Id $id eliminado exitosamente")
    }

    
}