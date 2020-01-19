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
 * Flight
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T01:08:58.699+01:00[Europe/Berlin]")

public class Flight   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("departure_time")
  private Integer departureTime;

  @JsonProperty("arrival_time")
  private Integer arrivalTime;

  @JsonProperty("start_point")
  private String startPoint;

  @JsonProperty("end_point")
  private String endPoint;

  @JsonProperty("price")
  private Integer price;

  public Flight name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Flight departureTime(Integer departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Get departureTime
   * @return departureTime
  */
  @ApiModelProperty(value = "")


  public Integer getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Integer departureTime) {
    this.departureTime = departureTime;
  }

  public Flight arrivalTime(Integer arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  /**
   * Get arrivalTime
   * @return arrivalTime
  */
  @ApiModelProperty(value = "")


  public Integer getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(Integer arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Flight startPoint(String startPoint) {
    this.startPoint = startPoint;
    return this;
  }

  /**
   * Get startPoint
   * @return startPoint
  */
  @ApiModelProperty(value = "")


  public String getStartPoint() {
    return startPoint;
  }

  public void setStartPoint(String startPoint) {
    this.startPoint = startPoint;
  }

  public Flight endPoint(String endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  /**
   * Get endPoint
   * @return endPoint
  */
  @ApiModelProperty(value = "")


  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public Flight price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flight flight = (Flight) o;
    return Objects.equals(this.name, flight.name) &&
        Objects.equals(this.departureTime, flight.departureTime) &&
        Objects.equals(this.arrivalTime, flight.arrivalTime) &&
        Objects.equals(this.startPoint, flight.startPoint) &&
        Objects.equals(this.endPoint, flight.endPoint) &&
        Objects.equals(this.price, flight.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, departureTime, arrivalTime, startPoint, endPoint, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flight {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

