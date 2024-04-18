package com.portailrh.portailrh.Repository;

import com.portailrh.portailrh.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}

