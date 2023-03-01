package com.niji.lille.portailLille.servcie.serviceImp;

import com.niji.lille.portailLille.entity.Users;
import com.niji.lille.portailLille.repository.UserRepository;
import com.niji.lille.portailLille.servcie.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserServcieImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServcieImpl.class);

    private final UserRepository userRepository;

    public UserServcieImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users save(Users entity) {
        return null;
    }

    @Override
    public Users findById(String id) {
        return null;
    }

    @Override
    public Void deleteById(String id) {
        return null;
    }
}
