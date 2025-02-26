package com.zup.authentication_service.repositories;

package com.zup.authentication.repositories;

import com.zup.authentication.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}