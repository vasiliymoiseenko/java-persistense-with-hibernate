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
public class BankAccaunt extends BillingDetails {

  @NotNull
  private String account;

  @NotNull
  private String bankname;

  @NotNull
  private String swift;
}
