package com.learning.completablefuture.Repository;

import com.learning.completablefuture.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
