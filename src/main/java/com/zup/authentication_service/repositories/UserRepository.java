package com.zup.authentication_service.repositories;

package com.zup.authentication.repositories;

import com.zup.authentication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
