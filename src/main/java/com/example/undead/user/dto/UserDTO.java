package com.example.undead.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WeiYangDong
 * @date 2018/2/1 15:46
 * @deprecated 用户数据载体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String id;
    private String userName;
    private String password;

}
