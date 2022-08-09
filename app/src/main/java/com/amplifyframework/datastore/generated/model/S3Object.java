package com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import java.util.Objects;
import java.util.List;

/** This is an auto generated class representing the S3Object type in your schema. */
public final class S3Object {
  private final String image;
  private final String sound;
  public String getImage() {
      return image;
  }
  
  public String getSound() {
      return sound;
  }
  
  private S3Object(String image, String sound) {
    this.image = image;
    this.sound = sound;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      S3Object s3Object = (S3Object) obj;
      return ObjectsCompat.equals(getImage(), s3Object.getImage()) &&
              ObjectsCompat.equals(getSound(), s3Object.getSound());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getImage())
      .append(getSound())
      .toString()
      .hashCode();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(image,
      sound);
  }
  public interface BuildStep {
    S3Object build();
    BuildStep image(String image);
    BuildStep sound(String sound);
  }
  

  public static class Builder implements BuildStep {
    private String image;
    private String sound;
    @Override
     public S3Object build() {
        
        return new S3Object(
          image,
          sound);
    }
    
    @Override
     public BuildStep image(String image) {
        this.image = image;
        return this;
    }
    
    @Override
     public BuildStep sound(String sound) {
        this.sound = sound;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String image, String sound) {
      super.image(image)
        .sound(sound);
    }
    
    @Override
     public CopyOfBuilder image(String image) {
      return (CopyOfBuilder) super.image(image);
    }
    
    @Override
     public CopyOfBuilder sound(String sound) {
      return (CopyOfBuilder) super.sound(sound);
    }
  }
  
}
