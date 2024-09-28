package com.example.demo.appuser;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
