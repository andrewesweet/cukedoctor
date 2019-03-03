package com.github.cukedoctor.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by rafael-pestano on 01/07/2015.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocString {

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  private String content_type;

  public String getContentType() {
    return content_type;
  }

  public void setContent_type(String value) {
    this.content_type = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
