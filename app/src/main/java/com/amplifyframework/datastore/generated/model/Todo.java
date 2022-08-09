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

/** This is an auto generated class representing the Todo type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Todos", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class Todo implements Model {
  public static final QueryField ID = field("Todo", "id");
  public static final QueryField NAME = field("Todo", "name");
  public static final QueryField DESCRIPTION = field("Todo", "description");
  public static final QueryField DEVICE_CHECK = field("Todo", "device_Check");
  public static final QueryField TODO_TYPE = field("Todo", "todoType");
  public static final QueryField COMPLETE_AT = field("Todo", "completeAt");
  public static final QueryField UPDATED_AT = field("Todo", "updatedAt");
  public static final QueryField PRIORITY = field("Todo", "priority");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="String") String description;
  private final @ModelField(targetType="String") String device_Check;
  private final @ModelField(targetType="KindsOfTodoType") KindsOfTodoType todoType;
  private final @ModelField(targetType="AWSDateTime") Temporal.DateTime completeAt;
  private final @ModelField(targetType="AWSDateTime") Temporal.DateTime updatedAt;
  private final @ModelField(targetType="Priority") Priority priority;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public String getDescription() {
      return description;
  }
  
  public String getDeviceCheck() {
      return device_Check;
  }
  
  public KindsOfTodoType getTodoType() {
      return todoType;
  }
  
  public Temporal.DateTime getCompleteAt() {
      return completeAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  public Priority getPriority() {
      return priority;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  private Todo(String id, String name, String description, String device_Check, KindsOfTodoType todoType, Temporal.DateTime completeAt, Temporal.DateTime updatedAt, Priority priority) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.device_Check = device_Check;
    this.todoType = todoType;
    this.completeAt = completeAt;
    this.updatedAt = updatedAt;
    this.priority = priority;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Todo todo = (Todo) obj;
      return ObjectsCompat.equals(getId(), todo.getId()) &&
              ObjectsCompat.equals(getName(), todo.getName()) &&
              ObjectsCompat.equals(getDescription(), todo.getDescription()) &&
              ObjectsCompat.equals(getDeviceCheck(), todo.getDeviceCheck()) &&
              ObjectsCompat.equals(getTodoType(), todo.getTodoType()) &&
              ObjectsCompat.equals(getCompleteAt(), todo.getCompleteAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), todo.getUpdatedAt()) &&
              ObjectsCompat.equals(getPriority(), todo.getPriority()) &&
              ObjectsCompat.equals(getCreatedAt(), todo.getCreatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getDescription())
      .append(getDeviceCheck())
      .append(getTodoType())
      .append(getCompleteAt())
      .append(getUpdatedAt())
      .append(getPriority())
      .append(getCreatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Todo {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("description=" + String.valueOf(getDescription()) + ", ")
      .append("device_Check=" + String.valueOf(getDeviceCheck()) + ", ")
      .append("todoType=" + String.valueOf(getTodoType()) + ", ")
      .append("completeAt=" + String.valueOf(getCompleteAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ")
      .append("priority=" + String.valueOf(getPriority()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()))
      .append("}")
      .toString();
  }
  
  public static NameStep builder() {
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
  public static Todo justId(String id) {
    return new Todo(
      id,
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
      device_Check,
      todoType,
      completeAt,
      updatedAt,
      priority);
  }
  public interface NameStep {
    BuildStep name(String name);
  }
  

  public interface BuildStep {
    Todo build();
    BuildStep id(String id);
    BuildStep description(String description);
    BuildStep deviceCheck(String deviceCheck);
    BuildStep todoType(KindsOfTodoType todoType);
    BuildStep completeAt(Temporal.DateTime completeAt);
    BuildStep updatedAt(Temporal.DateTime updatedAt);
    BuildStep priority(Priority priority);
  }
  

  public static class Builder implements NameStep, BuildStep {
    private String id;
    private String name;
    private String description;
    private String device_Check;
    private KindsOfTodoType todoType;
    private Temporal.DateTime completeAt;
    private Temporal.DateTime updatedAt;
    private Priority priority;
    @Override
     public Todo build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Todo(
          id,
          name,
          description,
          device_Check,
          todoType,
          completeAt,
          updatedAt,
          priority);
    }
    
    @Override
     public BuildStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep description(String description) {
        this.description = description;
        return this;
    }
    
    @Override
     public BuildStep deviceCheck(String deviceCheck) {
        this.device_Check = deviceCheck;
        return this;
    }
    
    @Override
     public BuildStep todoType(KindsOfTodoType todoType) {
        this.todoType = todoType;
        return this;
    }
    
    @Override
     public BuildStep completeAt(Temporal.DateTime completeAt) {
        this.completeAt = completeAt;
        return this;
    }
    
    @Override
     public BuildStep updatedAt(Temporal.DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @Override
     public BuildStep priority(Priority priority) {
        this.priority = priority;
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
    private CopyOfBuilder(String id, String name, String description, String deviceCheck, KindsOfTodoType todoType, Temporal.DateTime completeAt, Temporal.DateTime updatedAt, Priority priority) {
      super.id(id);
      super.name(name)
        .description(description)
        .deviceCheck(deviceCheck)
        .todoType(todoType)
        .completeAt(completeAt)
        .updatedAt(updatedAt)
        .priority(priority);
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
     public CopyOfBuilder deviceCheck(String deviceCheck) {
      return (CopyOfBuilder) super.deviceCheck(deviceCheck);
    }
    
    @Override
     public CopyOfBuilder todoType(KindsOfTodoType todoType) {
      return (CopyOfBuilder) super.todoType(todoType);
    }
    
    @Override
     public CopyOfBuilder completeAt(Temporal.DateTime completeAt) {
      return (CopyOfBuilder) super.completeAt(completeAt);
    }
    
    @Override
     public CopyOfBuilder updatedAt(Temporal.DateTime updatedAt) {
      return (CopyOfBuilder) super.updatedAt(updatedAt);
    }
    
    @Override
     public CopyOfBuilder priority(Priority priority) {
      return (CopyOfBuilder) super.priority(priority);
    }
  }
  
}
