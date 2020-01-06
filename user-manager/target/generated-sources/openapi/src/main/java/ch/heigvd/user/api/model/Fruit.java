package ch.heigvd.user.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Fruit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-06T09:37:30.079+01:00[Europe/Berlin]")

public class Fruit   {
  @JsonProperty("kind")
  private String kind;

  @JsonProperty("colour")
  private String colour;

  @JsonProperty("size")
  private String size;

  public Fruit kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Fruit colour(String colour) {
    this.colour = colour;
    return this;
  }

  /**
   * Get colour
   * @return colour
  */
  @ApiModelProperty(value = "")
  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public Fruit size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @ApiModelProperty(value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fruit fruit = (Fruit) o;
    return Objects.equals(this.kind, fruit.kind) &&
        Objects.equals(this.colour, fruit.colour) &&
        Objects.equals(this.size, fruit.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, colour, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fruit {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

