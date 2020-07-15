package org.lht.boot.security.server.listener;

import org.lht.boot.security.server.domain.entity.SystemLoginInfo;
import org.lht.boot.security.server.service.SystemLoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * @description: 认证成功事件
 * @author: LiHaitao
 * @date: 2020/7/15 16:44
 */
@Component
public class AuthenticationSuccessEventHandler implements ApplicationListener<AuthenticationSuccessEvent> {


    @Autowired
    private SystemLoginInfoService systemLoginInfoService;

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        Authentication authentication = (Authentication) event.getSource();
        String username = authentication.getName();
        SystemLoginInfo info = new SystemLoginInfo();
        info.setUsername(username);
        info.setMsg("登录成功");
        systemLoginInfoService.add(info);
    }
}
