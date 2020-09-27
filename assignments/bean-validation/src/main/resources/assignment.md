#Opdracht: Bean validation

1. Definieer een eigen `@Entity`-klasse met de concepten die tot nu toe verteld zijn en gebruik daarin *bean validation*.
1.  Maak je eigen *bean validator*. 
    * Hiervoor moet je een eigen annotatie definiëren en een klasse schrijven die de interface `ConstraintValidator` implementeert.
    * Use case: bijv. `DutchPostalCode`, `Iban`, `ImdbId` ,...