package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the BookInfo type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "BookInfos", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class BookInfo implements Model {
  public static final QueryField ID = field("BookInfo", "id");
  public static final QueryField NAME = field("BookInfo", "name");
  public static final QueryField DESCRIPTION = field("BookInfo", "description");
  public static final QueryField CHAPTER_MIN = field("BookInfo", "chapter_Min");
  public static final QueryField CHAPTER_MAX = field("BookInfo", "chapter_Max");
  public static final QueryField CHAPTER_SOUND = field("BookInfo", "chapter_Sound");
  public static final QueryField BOOK_IMAGE = field("BookInfo", "book_Image");
  public static final QueryField BOOK_PUBLISHER = field("BookInfo", "book_Publisher");
  public static final QueryField STUDY_TYPE = field("BookInfo", "study_Type");
  public static final QueryField COMPLETE_RATE = field("BookInfo", "complete_Rate");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String name;
  private final @ModelField(targetType="String") String description;
  private final @ModelField(targetType="Int") Integer chapter_Min;
  private final @ModelField(targetType="Int") Integer chapter_Max;
  private final @ModelField(targetType="ChapterSoun") ChapterSoun chapter_Sound;
  private final @ModelField(targetType="S3Object") S3Object book_Image;
  private final @ModelField(targetType="KindsOfPublisher") KindsOfPublisher book_Publisher;
  private final @ModelField(targetType="KindsOfStudy") KindsOfStudy study_Type;
  private final @ModelField(targetType="Int") Integer complete_Rate;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public String getDescription() {
      return description;
  }
  
  public Integer getChapterMin() {
      return chapter_Min;
  }
  
  public Integer getChapterMax() {
      return chapter_Max;
  }
  
  public ChapterSoun getChapterSound() {
      return chapter_Sound;
  }
  
  public S3Object getBookImage() {
      return book_Image;
  }
  
  public KindsOfPublisher getBookPublisher() {
      return book_Publisher;
  }
  
  public KindsOfStudy getStudyType() {
      return study_Type;
  }
  
  public Integer getCompleteRate() {
      return complete_Rate;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private BookInfo(String id, String name, String description, Integer chapter_Min, Integer chapter_Max, ChapterSoun chapter_Sound, S3Object book_Image, KindsOfPublisher book_Publisher, KindsOfStudy study_Type, Integer complete_Rate) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.chapter_Min = chapter_Min;
    this.chapter_Max = chapter_Max;
    this.chapter_Sound = chapter_Sound;
    this.book_Image = book_Image;
    this.book_Publisher = book_Publisher;
    this.study_Type = study_Type;
    this.complete_Rate = complete_Rate;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      BookInfo bookInfo = (BookInfo) obj;
      return ObjectsCompat.equals(getId(), bookInfo.getId()) &&
              ObjectsCompat.equals(getName(), bookInfo.getName()) &&
              ObjectsCompat.equals(getDescription(), bookInfo.getDescription()) &&
              ObjectsCompat.equals(getChapterMin(), bookInfo.getChapterMin()) &&
              ObjectsCompat.equals(getChapterMax(), bookInfo.getChapterMax()) &&
              ObjectsCompat.equals(getChapterSound(), bookInfo.getChapterSound()) &&
              ObjectsCompat.equals(getBookImage(), bookInfo.getBookImage()) &&
              ObjectsCompat.equals(getBookPublisher(), bookInfo.getBookPublisher()) &&
              ObjectsCompat.equals(getStudyType(), bookInfo.getStudyType()) &&
              ObjectsCompat.equals(getCompleteRate(), bookInfo.getCompleteRate()) &&
              ObjectsCompat.equals(getCreatedAt(), bookInfo.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), bookInfo.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getDescription())
      .append(getChapterMin())
      .append(getChapterMax())
      .append(getChapterSound())
      .append(getBookImage())
      .append(getBookPublisher())
      .append(getStudyType())
      .append(getCompleteRate())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("BookInfo {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("description=" + String.valueOf(getDescription()) + ", ")
      .append("chapter_Min=" + String.valueOf(getChapterMin()) + ", ")
      .append("chapter_Max=" + String.valueOf(getChapterMax()) + ", ")
      .append("chapter_Sound=" + String.valueOf(getChapterSound()) + ", ")
      .append("book_Image=" + String.valueOf(getBookImage()) + ", ")
      .append("book_Publisher=" + String.valueOf(getBookPublisher()) + ", ")
      .append("study_Type=" + String.valueOf(getStudyType()) + ", ")
      .append("complete_Rate=" + String.valueOf(getCompleteRate()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static BookInfo justId(String id) {
    return new BookInfo(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      name,
      description,
      chapter_Min,
      chapter_Max,
      chapter_Sound,
      book_Image,
      book_Publisher,
      study_Type,
      complete_Rate);
  }
  public interface BuildStep {
    BookInfo build();
    BuildStep id(String id);
    BuildStep name(String name);
    BuildStep description(String description);
    BuildStep chapterMin(Integer chapterMin);
    BuildStep chapterMax(Integer chapterMax);
    BuildStep chapterSound(ChapterSoun chapterSound);
    BuildStep bookImage(S3Object bookImage);
    BuildStep bookPublisher(KindsOfPublisher bookPublisher);
    BuildStep studyType(KindsOfStudy studyType);
    BuildStep completeRate(Integer completeRate);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String name;
    private String description;
    private Integer chapter_Min;
    private Integer chapter_Max;
    private ChapterSoun chapter_Sound;
    private S3Object book_Image;
    private KindsOfPublisher book_Publisher;
    private KindsOfStudy study_Type;
    private Integer complete_Rate;
    @Override
     public BookInfo build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new BookInfo(
          id,
          name,
          description,
          chapter_Min,
          chapter_Max,
          chapter_Sound,
          book_Image,
          book_Publisher,
          study_Type,
          complete_Rate);
    }
    
    @Override
     public BuildStep name(String name) {
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep description(String description) {
        this.description = description;
        return this;
    }
    
    @Override
     public BuildStep chapterMin(Integer chapterMin) {
        this.chapter_Min = chapterMin;
        return this;
    }
    
    @Override
     public BuildStep chapterMax(Integer chapterMax) {
        this.chapter_Max = chapterMax;
        return this;
    }
    
    @Override
     public BuildStep chapterSound(ChapterSoun chapterSound) {
        this.chapter_Sound = chapterSound;
        return this;
    }
    
    @Override
     public BuildStep bookImage(S3Object bookImage) {
        this.book_Image = bookImage;
        return this;
    }
    
    @Override
     public BuildStep bookPublisher(KindsOfPublisher bookPublisher) {
        this.book_Publisher = bookPublisher;
        return this;
    }
    
    @Override
     public BuildStep studyType(KindsOfStudy studyType) {
        this.study_Type = studyType;
        return this;
    }
    
    @Override
     public BuildStep completeRate(Integer completeRate) {
        this.complete_Rate = completeRate;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String name, String description, Integer chapterMin, Integer chapterMax, ChapterSoun chapterSound, S3Object bookImage, KindsOfPublisher bookPublisher, KindsOfStudy studyType, Integer completeRate) {
      super.id(id);
      super.name(name)
        .description(description)
        .chapterMin(chapterMin)
        .chapterMax(chapterMax)
        .chapterSound(chapterSound)
        .bookImage(bookImage)
        .bookPublisher(bookPublisher)
        .studyType(studyType)
        .completeRate(completeRate);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder description(String description) {
      return (CopyOfBuilder) super.description(description);
    }
    
    @Override
     public CopyOfBuilder chapterMin(Integer chapterMin) {
      return (CopyOfBuilder) super.chapterMin(chapterMin);
    }
    
    @Override
     public CopyOfBuilder chapterMax(Integer chapterMax) {
      return (CopyOfBuilder) super.chapterMax(chapterMax);
    }
    
    @Override
     public CopyOfBuilder chapterSound(ChapterSoun chapterSound) {
      return (CopyOfBuilder) super.chapterSound(chapterSound);
    }
    
    @Override
     public CopyOfBuilder bookImage(S3Object bookImage) {
      return (CopyOfBuilder) super.bookImage(bookImage);
    }
    
    @Override
     public CopyOfBuilder bookPublisher(KindsOfPublisher bookPublisher) {
      return (CopyOfBuilder) super.bookPublisher(bookPublisher);
    }
    
    @Override
     public CopyOfBuilder studyType(KindsOfStudy studyType) {
      return (CopyOfBuilder) super.studyType(studyType);
    }
    
    @Override
     public CopyOfBuilder completeRate(Integer completeRate) {
      return (CopyOfBuilder) super.completeRate(completeRate);
    }
  }
  
}
