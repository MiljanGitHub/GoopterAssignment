package com.goopter.offerup.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "offer")
public class Offer {

    @Id
    private String id;

    private String sellerId;

    private String buyerId;

    private String itemId;

    private double price;

    private boolean accepted;

}
