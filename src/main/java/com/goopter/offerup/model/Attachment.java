package com.goopter.offerup.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;



@Getter
@Setter
@RequiredArgsConstructor
@Builder
@NoArgsConstructor
@Document(collection = "attachment")
public class Attachment {

    @Id
    private String id;

    private String itemId;

    private String url;

    private String name;

    private String objectName;
}
