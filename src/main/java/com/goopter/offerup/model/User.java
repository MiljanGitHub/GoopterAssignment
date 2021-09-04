package com.goopter.offerup.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String username;

    private String email;

    private String phone;

    private BankData bankData;

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @RequiredArgsConstructor
    public class BankData{
        private String creditCardNumber;
        private String cvv;
    }

}
