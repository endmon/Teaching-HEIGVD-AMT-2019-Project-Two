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
 * Flights
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T03:29:22.150+01:00[Europe/Berlin]")

public class Flights   {
  @JsonProperty("flight_id")
  private Integer flightId;

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

  public Flights flightId(Integer flightId) {
    this.flightId = flightId;
    return this;
  }

  /**
   * Get flightId
   * @return flightId
  */
  @ApiModelProperty(value = "")


  public Integer getFlightId() {
    return flightId;
  }

  public void setFlightId(Integer flightId) {
    this.flightId = flightId;
  }

  public Flights name(String name) {
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

  public Flights departureTime(Integer departureTime) {
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

  public Flights arrivalTime(Integer arrivalTime) {
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

  public Flights startPoint(String startPoint) {
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

  public Flights endPoint(String endPoint) {
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

  public Flights price(Integer price) {
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
    Flights flights = (Flights) o;
    return Objects.equals(this.flightId, flights.flightId) &&
        Objects.equals(this.name, flights.name) &&
        Objects.equals(this.departureTime, flights.departureTime) &&
        Objects.equals(this.arrivalTime, flights.arrivalTime) &&
        Objects.equals(this.startPoint, flights.startPoint) &&
        Objects.equals(this.endPoint, flights.endPoint) &&
        Objects.equals(this.price, flights.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightId, name, departureTime, arrivalTime, startPoint, endPoint, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flights {\n");
    
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
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

