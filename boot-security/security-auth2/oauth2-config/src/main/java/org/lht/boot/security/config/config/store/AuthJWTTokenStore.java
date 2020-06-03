//package org.lht.boot.security.config.config.store;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
//
//import javax.annotation.Resource;
//import java.security.KeyPair;
//
///**
// * @description: 授权服务器 TokenStore 配置类，使用 JWT RSA 非对称加密
// */
//public class AuthJWTTokenStore {
//
//    @Bean("keyProp")
//    public KeyProperties keyProperties(){
//        return new KeyProperties();
//    }
//
//    @Resource(name = "keyProp")
//    private KeyProperties keyProperties;
//
//    @Bean
//    public TokenStore tokenStore(JwtAccessTokenConverter jwtAccessTokenConverter) {
//        return new JwtTokenStore(jwtAccessTokenConverter);
//    }
//
//    @Bean
//    public JwtAccessTokenConverter jwtAccessTokenConverter() {
//        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        KeyPair keyPair = new KeyStoreKeyFactory
//                (keyProperties.getKeyStore().getLocation(), keyProperties.getKeyStore().getSecret().toCharArray())
//                .getKeyPair(keyProperties.getKeyStore().getAlias());
//        converter.setKeyPair(keyPair);
//        return converter;
//    }
//
//}
