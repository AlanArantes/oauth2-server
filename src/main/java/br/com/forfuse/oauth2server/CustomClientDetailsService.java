package br.com.forfuse.oauth2server;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

@Service
public class CustomClientDetailsService implements ClientDetailsService {

  @Autowired
  private BCryptPasswordEncoder passwordEncoder;

  public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

    CustomClientDetails client = new CustomClientDetails();
    client.clientId(clientId);
    client.clientSecret(passwordEncoder.encode("secret"));
    client.authorizedGrantTypes(new HashSet<String>(Arrays.asList("client_credentials", "authorization_code")));
    client.scope(new HashSet<String>(Arrays.asList("user_info")));
    client.autoApprove(true);
    client.accessTokenValiditySeconds(3600);
    client.refreshTokenValiditySeconds(3600);
    client.registeredRedirectUri(new HashSet<String>(Arrays.asList("http://localhost:8082/ui/login","http://localhost:8082/login")));

    return client.toBaseClientDetails();
  }
}