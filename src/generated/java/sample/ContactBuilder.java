package sample;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class ContactBuilder
    implements Cloneable {
  protected ContactBuilder self;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected int value$age$int;
  protected boolean isSet$age$int;

  /**
   * Creates a new {@link ContactBuilder}.
   */
  public ContactBuilder() {
    self = (ContactBuilder)this;
  }

  /**
   * Sets the default value for the {@link Contact#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContactBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Contact#age} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContactBuilder withAge(int value) {
    this.value$age$int = value;
    this.isSet$age$int = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      ContactBuilder result = (ContactBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public ContactBuilder but() {
    return (ContactBuilder)clone();
  }

  /**
   * Creates a new {@link Contact} based on this builder's settings.
   *
   * @return the created Contact
   */
  public Contact build() {
    try {
      Contact result = new Contact();
      if (isSet$name$java$lang$String) {
        result.name = value$name$java$lang$String;
      }
      if (isSet$age$int) {
        result.age = value$age$int;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
