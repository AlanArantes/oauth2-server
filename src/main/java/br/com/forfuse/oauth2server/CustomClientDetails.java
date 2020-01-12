package br.com.forfuse.oauth2server;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.security.oauth2.provider.client.BaseClientDetails;

public class CustomClientDetails {
  private String id;

  private String clientId;
  private String clientSecret;
  private Set<String> resourceIds = new HashSet<>();
  private boolean secretRequired;
  private boolean scoped;
  private Set<String> scope = new HashSet<>();
  private Set<String> authorizedGrantTypes = new HashSet<>();
  private Set<String> registeredRedirectUri = new HashSet<>();
  private Collection<String> authorities = new HashSet<>();
  private Integer accessTokenValiditySeconds;
  private Integer refreshTokenValiditySeconds;
  private boolean autoApprove;
  private Map<String, Object> additionalInformation = new HashMap<>();


  public CustomClientDetails() {
  }

  public CustomClientDetails(String id, String clientId, String clientSecret, Set<String> resourceIds, boolean secretRequired, boolean scoped, Set<String> scope, Set<String> authorizedGrantTypes, Set<String> registeredRedirectUri, Collection<String> authorities, Integer accessTokenValiditySeconds, Integer refreshTokenValiditySeconds, boolean autoApprove, Map<String,Object> additionalInformation) {
    this.id = id;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.resourceIds = resourceIds;
    this.secretRequired = secretRequired;
    this.scoped = scoped;
    this.scope = scope;
    this.authorizedGrantTypes = authorizedGrantTypes;
    this.registeredRedirectUri = registeredRedirectUri;
    this.authorities = authorities;
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    this.autoApprove = autoApprove;
    this.additionalInformation = additionalInformation;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getClientId() {
    return this.clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getClientSecret() {
    return this.clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public Set<String> getResourceIds() {
    return this.resourceIds;
  }

  public void setResourceIds(Set<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public boolean isSecretRequired() {
    return this.secretRequired;
  }

  public boolean getSecretRequired() {
    return this.secretRequired;
  }

  public void setSecretRequired(boolean secretRequired) {
    this.secretRequired = secretRequired;
  }

  public boolean isScoped() {
    return this.scoped;
  }

  public boolean getScoped() {
    return this.scoped;
  }

  public void setScoped(boolean scoped) {
    this.scoped = scoped;
  }

  public Set<String> getScope() {
    return this.scope;
  }

  public void setScope(Set<String> scope) {
    this.scope = scope;
  }

  public Set<String> getAuthorizedGrantTypes() {
    return this.authorizedGrantTypes;
  }

  public void setAuthorizedGrantTypes(Set<String> authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
  }

  public Set<String> getRegisteredRedirectUri() {
    return this.registeredRedirectUri;
  }

  public void setRegisteredRedirectUri(Set<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
  }

  public Collection<String> getAuthorities() {
    return this.authorities;
  }

  public void setAuthorities(Collection<String> authorities) {
    this.authorities = authorities;
  }

  public Integer getAccessTokenValiditySeconds() {
    return this.accessTokenValiditySeconds;
  }

  public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  public Integer getRefreshTokenValiditySeconds() {
    return this.refreshTokenValiditySeconds;
  }

  public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
  }

  public boolean isAutoApprove() {
    return this.autoApprove;
  }

  public boolean getAutoApprove() {
    return this.autoApprove;
  }

  public void setAutoApprove(boolean autoApprove) {
    this.autoApprove = autoApprove;
  }

  public Map<String,Object> getAdditionalInformation() {
    return this.additionalInformation;
  }

  public void setAdditionalInformation(Map<String,Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public CustomClientDetails id(String id) {
    this.id = id;
    return this;
  }

  public CustomClientDetails clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public CustomClientDetails clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public CustomClientDetails resourceIds(Set<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public CustomClientDetails secretRequired(boolean secretRequired) {
    this.secretRequired = secretRequired;
    return this;
  }

  public CustomClientDetails scoped(boolean scoped) {
    this.scoped = scoped;
    return this;
  }

  public CustomClientDetails scope(Set<String> scope) {
    this.scope = scope;
    return this;
  }

  public CustomClientDetails authorizedGrantTypes(Set<String> authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
    return this;
  }

  public CustomClientDetails registeredRedirectUri(Set<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
    return this;
  }

  public CustomClientDetails authorities(Collection<String> authorities) {
    this.authorities = authorities;
    return this;
  }

  public CustomClientDetails accessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    return this;
  }

  public CustomClientDetails refreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    return this;
  }

  public CustomClientDetails autoApprove(boolean autoApprove) {
    this.autoApprove = autoApprove;
    return this;
  }

  public CustomClientDetails additionalInformation(Map<String,Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CustomClientDetails)) {
            return false;
        }
        CustomClientDetails CustomClientDetails = (CustomClientDetails) o;
        return Objects.equals(id, CustomClientDetails.id) && Objects.equals(clientId, CustomClientDetails.clientId) && Objects.equals(clientSecret, CustomClientDetails.clientSecret) && Objects.equals(resourceIds, CustomClientDetails.resourceIds) && secretRequired == CustomClientDetails.secretRequired && scoped == CustomClientDetails.scoped && Objects.equals(scope, CustomClientDetails.scope) && Objects.equals(authorizedGrantTypes, CustomClientDetails.authorizedGrantTypes) && Objects.equals(registeredRedirectUri, CustomClientDetails.registeredRedirectUri) && Objects.equals(authorities, CustomClientDetails.authorities) && Objects.equals(accessTokenValiditySeconds, CustomClientDetails.accessTokenValiditySeconds) && Objects.equals(refreshTokenValiditySeconds, CustomClientDetails.refreshTokenValiditySeconds) && autoApprove == CustomClientDetails.autoApprove && Objects.equals(additionalInformation, CustomClientDetails.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, clientSecret, resourceIds, secretRequired, scoped, scope, authorizedGrantTypes, registeredRedirectUri, authorities, accessTokenValiditySeconds, refreshTokenValiditySeconds, autoApprove, additionalInformation);
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", clientId='" + getClientId() + "'" +
      ", clientSecret='" + getClientSecret() + "'" +
      ", resourceIds='" + getResourceIds() + "'" +
      ", secretRequired='" + isSecretRequired() + "'" +
      ", scoped='" + isScoped() + "'" +
      ", scope='" + getScope() + "'" +
      ", authorizedGrantTypes='" + getAuthorizedGrantTypes() + "'" +
      ", registeredRedirectUri='" + getRegisteredRedirectUri() + "'" +
      ", authorities='" + getAuthorities() + "'" +
      ", accessTokenValiditySeconds='" + getAccessTokenValiditySeconds() + "'" +
      ", refreshTokenValiditySeconds='" + getRefreshTokenValiditySeconds() + "'" +
      ", autoApprove='" + isAutoApprove() + "'" +
      ", additionalInformation='" + getAdditionalInformation() + "'" +
      "}";
  }

  public BaseClientDetails toBaseClientDetails() {
    BaseClientDetails base = new BaseClientDetails(this.getClientId(), "", "", "", "");
    base.setClientSecret(this.getClientSecret());
    base.setAccessTokenValiditySeconds(this.getAccessTokenValiditySeconds());
    base.setRefreshTokenValiditySeconds(this.getRefreshTokenValiditySeconds());
    base.setAdditionalInformation(this.getAdditionalInformation());
    base.setAutoApproveScopes(this.getScope());
    base.setScope(this.getScope());
    base.setAuthorizedGrantTypes(this.getAuthorizedGrantTypes());
    base.setRegisteredRedirectUri(this.getRegisteredRedirectUri());
    return base;
  }

}