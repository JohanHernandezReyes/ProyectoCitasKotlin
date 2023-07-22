
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Appointment as Appointment
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

interface AppointmentRepositoryIfc : JpaRepository<Appointment, Long> {

   @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from citas where id_cita = :id", nativeQuery = true)
    fun getByAppointmentById(id: Long): Optional<Appointment>


    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from citas",  nativeQuery = true)
    fun getAllAppointments(): List<Appointment>?

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("delete from citas where id_cita = :id", nativeQuery = true)
    fun DeleteAppointment(id: Long)

}