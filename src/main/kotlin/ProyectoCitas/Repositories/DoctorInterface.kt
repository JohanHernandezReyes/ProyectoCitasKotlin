
package ProyectoCitas.Repositories;

import org.springframework.data.repository.CrudRepository;
import ProyectoCitas.Domains.responses.DoctorRes as DoctorRes;

interface DoctorInterface:CrudRepository<DoctorRes, Int>

