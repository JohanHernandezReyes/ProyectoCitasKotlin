
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Doctor as Doctor
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import org.springframework.beans.factory.annotation.Autowired
<<<<<<< HEAD
import java.util.Optional
=======
>>>>>>> a9dd4bf (Actualización Repository y entities)


interface DoctorRepositoryIfc : JpaRepository<Doctor, Long> {
    
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from doctores where id_doctor = :id", nativeQuery = true)
<<<<<<< HEAD
    fun getByDoctorById(id: Long): Optional<Doctor>
=======
    fun getByDoctorById(id: Long): Doctor?
>>>>>>> a9dd4bf (Actualización Repository y entities)

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from doctores",  nativeQuery = true)
    fun getAllDoctors(): List<Doctor>?

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("delete from doctores where id_doctor = :id", nativeQuery = true)
<<<<<<< HEAD
    fun DeleteById(id: Long)
=======
    fun DeleteById(id: Long): Doctor?
>>>>>>> a9dd4bf (Actualización Repository y entities)


}