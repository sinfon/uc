package top.sinfonia.uc.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.sinfonia.uc.domain.model.user.User;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 13:03<br>
 * <b>Author:</b> heiha<br>
 */
public interface UserService {
    User createUser(User user);
    Page<User> listUser(Pageable pageable);
    User getUser(Long id);
}
