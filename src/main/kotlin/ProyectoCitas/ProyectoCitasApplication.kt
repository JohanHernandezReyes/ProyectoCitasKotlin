package ProyectoCitas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication()
@EnableJpaRepositories("ProyectoCitas.ProyectoCitas.Repositories")
@EntityScan("ProyectoCitas.ProyectoCitas.Domains.Entity")
class ProyectoCitasApplication

    fun main(args: Array<String>) {
        runApplication<ProyectoCitasApplication>(*args)
    }
