package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.Idee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IdeeRepository extends MongoRepository<Idee, String> {

}
