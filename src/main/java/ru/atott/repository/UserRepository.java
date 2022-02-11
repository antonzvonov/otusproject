package ru.atott.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.atott.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
