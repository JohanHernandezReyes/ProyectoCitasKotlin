
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Patient as Patient
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

interface PatientRepositoryIfc : JpaRepository<Patient, Long> {

     @Transactional(propagation = Propagation.NOT_SUPPORTED)
     @Query("select * from pacientes where id_paciente = :id", nativeQuery = true)
     fun getPatientById(id: Long): Optional<Patient>

     @Transactional(propagation = Propagation.NOT_SUPPORTED)
     @Query("select * from pacientes where identif = :identif", nativeQuery = true)
     fun findByIdentif(identif: String): Optional<Patient>

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("delete from pacientes where id_paciente = :id", nativeQuery = true)
    fun DeletePatient(id: Long)

}