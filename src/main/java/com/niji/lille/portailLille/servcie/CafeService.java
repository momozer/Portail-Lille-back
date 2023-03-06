package com.niji.lille.portailLille.servcie;

import com.niji.lille.portailLille.entity.PacketCafe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CafeService {

    List<PacketCafe> findAll();

    PacketCafe getCafeById(String id);

    PacketCafe getCafeByPaquetCafe(Integer paquetCafe);

    PacketCafe getLienCagnotte(String lienCagnotte );

    PacketCafe createCafe(PacketCafe entity);


}
