package ch.heigvd.user.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JWTToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-13T16:47:44.084+01:00[Europe/Berlin]")

public class JWTToken   {
  @JsonProperty("jwttoken")
  private String jwttoken;

  public JWTToken jwttoken(String jwttoken) {
    this.jwttoken = jwttoken;
    return this;
  }

  /**
   * Get jwttoken
   * @return jwttoken
  */
  @ApiModelProperty(value = "")


  public String getJwttoken() {
    return jwttoken;
  }

  public void setJwttoken(String jwttoken) {
    this.jwttoken = jwttoken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTToken jwTToken = (JWTToken) o;
    return Objects.equals(this.jwttoken, jwTToken.jwttoken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwttoken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTToken {\n");
    
    sb.append("    jwttoken: ").append(toIndentedString(jwttoken)).append("\n");
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

