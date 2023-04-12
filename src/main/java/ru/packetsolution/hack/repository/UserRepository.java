package ru.packetsolution.hack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.packetsolution.hack.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
