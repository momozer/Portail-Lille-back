package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public class UserRepository extends MongoRepository<Users, String> {
}
