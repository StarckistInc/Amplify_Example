package com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import java.util.Objects;
import java.util.List;

/** This is an auto generated class representing the S3Object type in your schema. */
public final class S3Object {
  private final String localUri;
  public String getLocalUri() {
      return localUri;
  }
  
  private S3Object(String localUri) {
    this.localUri = localUri;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      S3Object s3Object = (S3Object) obj;
      return ObjectsCompat.equals(getLocalUri(), s3Object.getLocalUri());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getLocalUri())
      .toString()
      .hashCode();
  }
  
  public static LocalUriStep builder() {
      return new Builder();
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(localUri);
  }
  public interface LocalUriStep {
    BuildStep localUri(String localUri);
  }
  

  public interface BuildStep {
    S3Object build();
  }
  

  public static class Builder implements LocalUriStep, BuildStep {
    private String localUri;
    @Override
     public S3Object build() {
        
        return new S3Object(
          localUri);
    }
    
    @Override
     public BuildStep localUri(String localUri) {
        Objects.requireNonNull(localUri);
        this.localUri = localUri;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String localUri) {
      super.localUri(localUri);
    }
    
    @Override
     public CopyOfBuilder localUri(String localUri) {
      return (CopyOfBuilder) super.localUri(localUri);
    }
  }
  
}
