/*
 * Energy Australia Coding Test API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Band;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MusicFestival
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-09-30T22:42:27.997+10:00[Australia/Melbourne]")
public class MusicFestival {
  @SerializedName("name")
  private String name = null;

  @SerializedName("bands")
  private List<Band> bands = null;

  public MusicFestival name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name!=null ? name : "";
  }

  public void setName(String name) {
    this.name = name;
  }

  public MusicFestival bands(List<Band> bands) {
    this.bands = bands;
    return this;
  }

  public MusicFestival addBandsItem(Band bandsItem) {
    if (this.bands == null) {
      this.bands = new ArrayList<Band>();
    }
    this.bands.add(bandsItem);
    return this;
  }

   /**
   * Get bands
   * @return bands
  **/
  @Schema(description = "")
  public List<Band> getBands() {
    return bands;
  }

  public void setBands(List<Band> bands) {
    this.bands = bands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicFestival musicFestival = (MusicFestival) o;
    return Objects.equals(this.name, musicFestival.name) &&
        Objects.equals(this.bands, musicFestival.bands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicFestival {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bands: ").append(toIndentedString(bands)).append("\n");
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