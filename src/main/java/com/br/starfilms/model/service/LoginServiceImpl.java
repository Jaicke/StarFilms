package com.br.starfilms.model.service;

import com.br.starfilms.model.entity.Login;
import com.br.starfilms.model.repository.LoginRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAICKE
 */
@Service
public class LoginServiceImpl implements LoginService {

    private LoginRepository loginRepository;

    @Override
    public Login buscaLogin(Long id) {
        Optional<Login> l = this.loginRepository.findById(id);
        return l.get();
    }

}
