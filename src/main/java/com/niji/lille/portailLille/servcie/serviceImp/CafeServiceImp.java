package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.Cafe;
import com.niji.lille.portailLille.repository.CafeRepository;
import com.niji.lille.portailLille.servcie.CafeService;
import org.springframework.stereotype.Service;


public class CafeServiceImp implements CafeService {

    private CafeRepository cafeRepository;

    public CafeServiceImp(CafeRepository cafeRepository) {

    }

    @Override
    public Cafe getLien() {
        return cafeRepository.getLien();
    }

    @Override
    public Cafe getImage() {
        return cafeRepository.getImage();
    }
}
