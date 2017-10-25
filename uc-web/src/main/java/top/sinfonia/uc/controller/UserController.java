package top.sinfonia.uc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.sinfonia.uc.domain.model.user.User;
import top.sinfonia.uc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 13:07<br>
 * <b>Author:</b> heiha<br>
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private UserService userService;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) throws JsonProcessingException {
        LOGGER.info("Create User: {}", objectMapper.writeValueAsString(user));
        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> listUser(Pageable pageable) {
        return userService.listUser(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
