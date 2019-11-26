package com.musa2.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import com.musa2.dao.UsuariosDao;

@Component
public class InfoAdicionalToken implements TokenEnhancer {
	@Autowired
	private UsuariosDao usuarioDao;
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		// TODO Auto-generated method stub
		Map<String, Object> info = new HashMap<>();
		info= usuarioDao.datosUsuario(authentication.getName());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}
}
