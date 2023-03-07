/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter() {
  }

  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter = (TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter) o;
    return Objects.equals(this.size, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.size) &&
        Objects.equals(this.color, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.color) &&
        Objects.equals(this.id, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.id) &&
        Objects.equals(this.name, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, color, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("size");
    openapiFields.add("color");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter is not found in the empty JSON string", TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter>() {
           @Override
           public void write(JsonWriter out, TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter
  * @throws IOException if the JSON string is invalid with respect to TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter
  */
  public static TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.class);
  }

 /**
  * Convert an instance of TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

