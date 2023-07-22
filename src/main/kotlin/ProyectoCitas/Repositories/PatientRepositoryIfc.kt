
package ProyectoCitas.Repositories

import ProyectoCitas.Domains.Entity.Patient as Patient
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

interface PatientRepositoryIfc : JpaRepository<Patient, Long> {

     @Transactional(propagation = Propagation.NOT_SUPPORTED)
     @Query("select * from pacientes where id_paciente = :id", nativeQuery = true)
<<<<<<< HEAD
     fun getPatientById(id: Long): Optional<Patient>

     @Transactional(propagation = Propagation.NOT_SUPPORTED)
     @Query("select * from pacientes where identif = :identif", nativeQuery = true)
     fun findByIdentif(identif: String): Optional<Patient>

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("delete from pacientes where id_paciente = :id", nativeQuery = true)
    fun DeletePatient(id: Long)
=======
     fun getByPatientById(id: Long): Patient?

     @Transactional(propagation = Propagation.NOT_SUPPORTED)
     @Query("select * from pacientes where identif = :identif", nativeQuery = true)
     fun getByPatientByIdentif(identif: String): Patient?

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("alter table pacientes set= :updates where id_paciente = :id", nativeQuery = true)
    fun UpdatePatient(id: Long): Patient?

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("delete from pacientes where id_paciente = :id", nativeQuery = true)
    fun DeletePatient(id: Long): Patient?
>>>>>>> a9dd4bf (Actualización Repository y entities)


}