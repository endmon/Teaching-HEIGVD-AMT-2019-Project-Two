package ch.heigvd.flight.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T12:31:54.987+01:00[Europe/Berlin]")

public class Customers   {
  @JsonProperty("customer_id")
  private Long customerId;

  @JsonProperty("customer_pseudo")
  private String customerPseudo;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("customer_pw")
  private String customerPw;

  public Customers customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @ApiModelProperty(value = "")


  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Customers customerPseudo(String customerPseudo) {
    this.customerPseudo = customerPseudo;
    return this;
  }

  /**
   * Get customerPseudo
   * @return customerPseudo
  */
  @ApiModelProperty(value = "")


  public String getCustomerPseudo() {
    return customerPseudo;
  }

  public void setCustomerPseudo(String customerPseudo) {
    this.customerPseudo = customerPseudo;
  }

  public Customers firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Get firstname
   * @return firstname
  */
  @ApiModelProperty(value = "")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Customers lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
  */
  @ApiModelProperty(value = "")


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Customers age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Customers customerPw(String customerPw) {
    this.customerPw = customerPw;
    return this;
  }

  /**
   * Get customerPw
   * @return customerPw
  */
  @ApiModelProperty(value = "")


  public String getCustomerPw() {
    return customerPw;
  }

  public void setCustomerPw(String customerPw) {
    this.customerPw = customerPw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customers customers = (Customers) o;
    return Objects.equals(this.customerId, customers.customerId) &&
        Objects.equals(this.customerPseudo, customers.customerPseudo) &&
        Objects.equals(this.firstname, customers.firstname) &&
        Objects.equals(this.lastname, customers.lastname) &&
        Objects.equals(this.age, customers.age) &&
        Objects.equals(this.customerPw, customers.customerPw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerPseudo, firstname, lastname, age, customerPw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customers {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerPseudo: ").append(toIndentedString(customerPseudo)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    customerPw: ").append(toIndentedString(customerPw)).append("\n");
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

