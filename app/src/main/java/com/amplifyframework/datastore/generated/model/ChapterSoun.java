package com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import java.util.Objects;
import java.util.List;

/** This is an auto generated class representing the ChapterSoun type in your schema. */
public final class ChapterSoun {
  private final Integer Chapter01;
  private final Integer Chapter02;
  private final Integer Chapter03;
  private final Integer Chapter04;
  private final Integer Chapter05;
  private final Integer Chapter06;
  private final Integer Chapter07;
  private final Integer Chapter08;
  private final Integer Chapter09;
  private final Integer Chapter10;
  public Integer getChapter01() {
      return Chapter01;
  }
  
  public Integer getChapter02() {
      return Chapter02;
  }
  
  public Integer getChapter03() {
      return Chapter03;
  }
  
  public Integer getChapter04() {
      return Chapter04;
  }
  
  public Integer getChapter05() {
      return Chapter05;
  }
  
  public Integer getChapter06() {
      return Chapter06;
  }
  
  public Integer getChapter07() {
      return Chapter07;
  }
  
  public Integer getChapter08() {
      return Chapter08;
  }
  
  public Integer getChapter09() {
      return Chapter09;
  }
  
  public Integer getChapter10() {
      return Chapter10;
  }
  
  private ChapterSoun(Integer Chapter01, Integer Chapter02, Integer Chapter03, Integer Chapter04, Integer Chapter05, Integer Chapter06, Integer Chapter07, Integer Chapter08, Integer Chapter09, Integer Chapter10) {
    this.Chapter01 = Chapter01;
    this.Chapter02 = Chapter02;
    this.Chapter03 = Chapter03;
    this.Chapter04 = Chapter04;
    this.Chapter05 = Chapter05;
    this.Chapter06 = Chapter06;
    this.Chapter07 = Chapter07;
    this.Chapter08 = Chapter08;
    this.Chapter09 = Chapter09;
    this.Chapter10 = Chapter10;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      ChapterSoun chapterSoun = (ChapterSoun) obj;
      return ObjectsCompat.equals(getChapter01(), chapterSoun.getChapter01()) &&
              ObjectsCompat.equals(getChapter02(), chapterSoun.getChapter02()) &&
              ObjectsCompat.equals(getChapter03(), chapterSoun.getChapter03()) &&
              ObjectsCompat.equals(getChapter04(), chapterSoun.getChapter04()) &&
              ObjectsCompat.equals(getChapter05(), chapterSoun.getChapter05()) &&
              ObjectsCompat.equals(getChapter06(), chapterSoun.getChapter06()) &&
              ObjectsCompat.equals(getChapter07(), chapterSoun.getChapter07()) &&
              ObjectsCompat.equals(getChapter08(), chapterSoun.getChapter08()) &&
              ObjectsCompat.equals(getChapter09(), chapterSoun.getChapter09()) &&
              ObjectsCompat.equals(getChapter10(), chapterSoun.getChapter10());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getChapter01())
      .append(getChapter02())
      .append(getChapter03())
      .append(getChapter04())
      .append(getChapter05())
      .append(getChapter06())
      .append(getChapter07())
      .append(getChapter08())
      .append(getChapter09())
      .append(getChapter10())
      .toString()
      .hashCode();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(Chapter01,
      Chapter02,
      Chapter03,
      Chapter04,
      Chapter05,
      Chapter06,
      Chapter07,
      Chapter08,
      Chapter09,
      Chapter10);
  }
  public interface BuildStep {
    ChapterSoun build();
    BuildStep chapter01(Integer chapter01);
    BuildStep chapter02(Integer chapter02);
    BuildStep chapter03(Integer chapter03);
    BuildStep chapter04(Integer chapter04);
    BuildStep chapter05(Integer chapter05);
    BuildStep chapter06(Integer chapter06);
    BuildStep chapter07(Integer chapter07);
    BuildStep chapter08(Integer chapter08);
    BuildStep chapter09(Integer chapter09);
    BuildStep chapter10(Integer chapter10);
  }
  

  public static class Builder implements BuildStep {
    private Integer Chapter01;
    private Integer Chapter02;
    private Integer Chapter03;
    private Integer Chapter04;
    private Integer Chapter05;
    private Integer Chapter06;
    private Integer Chapter07;
    private Integer Chapter08;
    private Integer Chapter09;
    private Integer Chapter10;
    @Override
     public ChapterSoun build() {
        
        return new ChapterSoun(
          Chapter01,
          Chapter02,
          Chapter03,
          Chapter04,
          Chapter05,
          Chapter06,
          Chapter07,
          Chapter08,
          Chapter09,
          Chapter10);
    }
    
    @Override
     public BuildStep chapter01(Integer chapter01) {
        this.Chapter01 = chapter01;
        return this;
    }
    
    @Override
     public BuildStep chapter02(Integer chapter02) {
        this.Chapter02 = chapter02;
        return this;
    }
    
    @Override
     public BuildStep chapter03(Integer chapter03) {
        this.Chapter03 = chapter03;
        return this;
    }
    
    @Override
     public BuildStep chapter04(Integer chapter04) {
        this.Chapter04 = chapter04;
        return this;
    }
    
    @Override
     public BuildStep chapter05(Integer chapter05) {
        this.Chapter05 = chapter05;
        return this;
    }
    
    @Override
     public BuildStep chapter06(Integer chapter06) {
        this.Chapter06 = chapter06;
        return this;
    }
    
    @Override
     public BuildStep chapter07(Integer chapter07) {
        this.Chapter07 = chapter07;
        return this;
    }
    
    @Override
     public BuildStep chapter08(Integer chapter08) {
        this.Chapter08 = chapter08;
        return this;
    }
    
    @Override
     public BuildStep chapter09(Integer chapter09) {
        this.Chapter09 = chapter09;
        return this;
    }
    
    @Override
     public BuildStep chapter10(Integer chapter10) {
        this.Chapter10 = chapter10;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(Integer chapter01, Integer chapter02, Integer chapter03, Integer chapter04, Integer chapter05, Integer chapter06, Integer chapter07, Integer chapter08, Integer chapter09, Integer chapter10) {
      super.chapter01(chapter01)
        .chapter02(chapter02)
        .chapter03(chapter03)
        .chapter04(chapter04)
        .chapter05(chapter05)
        .chapter06(chapter06)
        .chapter07(chapter07)
        .chapter08(chapter08)
        .chapter09(chapter09)
        .chapter10(chapter10);
    }
    
    @Override
     public CopyOfBuilder chapter01(Integer chapter01) {
      return (CopyOfBuilder) super.chapter01(chapter01);
    }
    
    @Override
     public CopyOfBuilder chapter02(Integer chapter02) {
      return (CopyOfBuilder) super.chapter02(chapter02);
    }
    
    @Override
     public CopyOfBuilder chapter03(Integer chapter03) {
      return (CopyOfBuilder) super.chapter03(chapter03);
    }
    
    @Override
     public CopyOfBuilder chapter04(Integer chapter04) {
      return (CopyOfBuilder) super.chapter04(chapter04);
    }
    
    @Override
     public CopyOfBuilder chapter05(Integer chapter05) {
      return (CopyOfBuilder) super.chapter05(chapter05);
    }
    
    @Override
     public CopyOfBuilder chapter06(Integer chapter06) {
      return (CopyOfBuilder) super.chapter06(chapter06);
    }
    
    @Override
     public CopyOfBuilder chapter07(Integer chapter07) {
      return (CopyOfBuilder) super.chapter07(chapter07);
    }
    
    @Override
     public CopyOfBuilder chapter08(Integer chapter08) {
      return (CopyOfBuilder) super.chapter08(chapter08);
    }
    
    @Override
     public CopyOfBuilder chapter09(Integer chapter09) {
      return (CopyOfBuilder) super.chapter09(chapter09);
    }
    
    @Override
     public CopyOfBuilder chapter10(Integer chapter10) {
      return (CopyOfBuilder) super.chapter10(chapter10);
    }
  }
  
}
