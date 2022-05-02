package helloworld;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Message {

  @Id
  @GeneratedValue
  private Long id;

  @Getter
  @Setter
  private String text;

}
