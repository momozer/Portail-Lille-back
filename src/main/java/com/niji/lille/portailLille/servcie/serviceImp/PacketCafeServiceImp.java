package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.PacketCafe;
import com.niji.lille.portailLille.repository.PacketCafeRepository;
import com.niji.lille.portailLille.servcie.PacketCafeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacketCafeServiceImp implements PacketCafeService {

    private PacketCafeRepository packetCafeRepository;

    @Override
    public List<PacketCafe> findAll() {
        return packetCafeRepository.findAll();
    }

    @Override
    public PacketCafe findById(String id) {
        return packetCafeRepository.findById(id).orElse(null);
    }

    @Override
    public PacketCafe save(PacketCafe entity) {
        return packetCafeRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        packetCafeRepository.deleteById(id);
    }
}
