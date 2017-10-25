package top.sinfonia.uc.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.sinfonia.uc.domain.model.user.User;
import top.sinfonia.uc.domain.model.user.UserRepository;
import top.sinfonia.uc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 17:44<br>
 * <b>Author:</b> heiha<br>
 */
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Page<User> listUser(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getOne(id);
    }
}
