package br.com.growthdev.reposity;

import br.com.growthdev.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
