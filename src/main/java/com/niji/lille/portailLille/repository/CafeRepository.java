package com.niji.lille.portailLille.repository;

import com.niji.lille.portailLille.entity.PacketCafe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CafeRepository extends MongoRepository<PacketCafe, String> {
}
