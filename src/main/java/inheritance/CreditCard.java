package inheritance;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CreditCard extends BillingDetails {

  @NotNull
  private String cardNumber;

  @NotNull
  private String expMouth;

  @NotNull
  private String expYear;
}
