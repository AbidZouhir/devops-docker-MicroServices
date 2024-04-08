package net.bank.accountservice.model;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
