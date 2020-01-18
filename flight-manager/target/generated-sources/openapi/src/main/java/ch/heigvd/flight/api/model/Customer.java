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
 * Customer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-18T15:31:43.221+01:00[Europe/Berlin]")

public class Customer   {
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

  public Customer customerPseudo(String customerPseudo) {
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

  public Customer firstname(String firstname) {
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

  public Customer lastname(String lastname) {
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

  public Customer age(Integer age) {
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

  public Customer customerPw(String customerPw) {
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
    Customer customer = (Customer) o;
    return Objects.equals(this.customerPseudo, customer.customerPseudo) &&
        Objects.equals(this.firstname, customer.firstname) &&
        Objects.equals(this.lastname, customer.lastname) &&
        Objects.equals(this.age, customer.age) &&
        Objects.equals(this.customerPw, customer.customerPw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPseudo, firstname, lastname, age, customerPw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
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

