package com.itheima.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {

    private long id;

    private String roleName;//角色名

    private String roleDesc;//角色功能


}
