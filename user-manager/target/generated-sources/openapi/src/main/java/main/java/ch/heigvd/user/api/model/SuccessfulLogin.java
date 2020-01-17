package main.java.ch.heigvd.user.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SuccessfulLogin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-06T13:02:36.750+01:00[Europe/Berlin]")

public class SuccessfulLogin   {
  @JsonProperty("userID")
  private Integer userID;

  @JsonProperty("JWTToken")
  private String jwTToken;

  public SuccessfulLogin userID(Integer userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
  */
  @ApiModelProperty(value = "")


  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }

  public SuccessfulLogin jwTToken(String jwTToken) {
    this.jwTToken = jwTToken;
    return this;
  }

  /**
   * Get jwTToken
   * @return jwTToken
  */
  @ApiModelProperty(value = "")


  public String getJwTToken() {
    return jwTToken;
  }

  public void setJwTToken(String jwTToken) {
    this.jwTToken = jwTToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessfulLogin successfulLogin = (SuccessfulLogin) o;
    return Objects.equals(this.userID, successfulLogin.userID) &&
        Objects.equals(this.jwTToken, successfulLogin.jwTToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, jwTToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessfulLogin {\n");
    
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    jwTToken: ").append(toIndentedString(jwTToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

