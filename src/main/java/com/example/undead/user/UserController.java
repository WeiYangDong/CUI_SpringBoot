package com.example.undead.user;

import com.example.common.utils.PageParam;
import com.example.undead.user.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author WeiYangDong
 * @date 2018/2/1 15:17
 * @deprecated 用户接口Controller
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 获取用户列表
     * @param pageParam 分页请求参数
     * @return List
     */
    @GetMapping
    public List<UserDTO> listUser(PageParam pageParam) {
        return Stream.of(new UserDTO("00001", "半步幽冥", "123"),
                new UserDTO("00002", "半步轻吟", "123"))
                .collect(Collectors.toList());
    }

    /**
     * 根据ID获取用户信息
     * @param userId 用户ID
     * @return UserDTO
     */
    @GetMapping(value = "/{userId:\\d+}")
    public UserDTO getUser(@PathVariable String userId) {
        UserDTO userDTO = new UserDTO("00001", "半步幽冥", "123");
        return userDTO;
    }

    /**
     * 获取用户名为{username}，并且年龄小于{age}的用户
     * @return List
     */
    @GetMapping(value = "/name/{username}/age/less/{age}")
    public List<UserDTO> getUserByUsernameAndAge(@PathVariable String username, @PathVariable Integer age) {
        UserDTO userDTO = new UserDTO("00001", "半步幽冥", "123");
        return Arrays.asList(userDTO);
    }

    /**
     * 保存用户
     * @param userDTO 用户
     * @return UserDTO
     */
    @PostMapping
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userDTO;
    }

    /**
     * 更新用户信息
     * @param userDTO 用户
     * @return UserDTO
     */
    @PutMapping(value = "/{id:\\d+}")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userDTO;
    }


    /**
     * 删除用户
     * @param id 用户ID
     */
    @DeleteMapping(value = "/{id:\\d+}")
    public void removeUser(@PathVariable Integer id) {
        //删除用户
    }
}
