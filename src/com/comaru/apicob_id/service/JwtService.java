package com.comaru.apicob_id.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class JwtService {

	public String gerarToken(String chaveGeral, String chaveConta) {
		long agora = System.currentTimeMillis();
		long exp = agora + 600_000; // 10 minutos

		Map<String, Object> claims = new HashMap<>();
		claims.put("iat", agora / 1000); // em segundos
		claims.put("exp", exp / 1000); // em segundos
		claims.put("iss", "cobexpress");
		claims.put("hash", chaveConta);

		// Usa a chave original, mesmo que menor que 64 bytes, igual ao PHP
		Key key = new SecretKeySpec(chaveGeral.getBytes(StandardCharsets.UTF_8), SignatureAlgorithm.HS256.getJcaName());

		return Jwts.builder()
				.setHeaderParam("alg", "HS256")
				.setClaims(claims)
				.signWith(key, SignatureAlgorithm.HS256)
				.compact();
	}
}