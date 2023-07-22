
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Appointment as Appointment
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
<<<<<<< HEAD
import java.util.Optional
=======

>>>>>>> a9dd4bf (Actualización Repository y entities)

interface AppointmentRepositoryIfc : JpaRepository<Appointment, Long> {

   @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from citas where id_cita = :id", nativeQuery = true)
<<<<<<< HEAD
    fun getByAppointmentById(id: Long): Optional<Appointment>
=======
    fun getByAppointmentById(id: Long): Appointment?
>>>>>>> a9dd4bf (Actualización Repository y entities)

     @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from citas",  nativeQuery = true)
    fun getAllAppointments(): List<Appointment>?

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
<<<<<<< HEAD
    @Query("delete from citas where id_cita = :id", nativeQuery = true)
    fun DeleteAppointment(id: Long)
=======
    @Query("alter table citas set= :updates where id_cita = :id", nativeQuery = true)
    fun UpdateAppointmentr(id: Long): Appointment?

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("delete from citas where id_cita = :id", nativeQuery = true)
    fun DeleteAppointment(id: Long): Appointment?

>>>>>>> a9dd4bf (Actualización Repository y entities)

}