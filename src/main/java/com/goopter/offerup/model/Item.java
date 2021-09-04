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
@RequiredArgsConstructor
@Builder
@NoArgsConstructor
@Document(collection = "item")
public class Item {

    @Id
    private String id;

    private String description;

    private String title;

    private boolean sold;

    private boolean shipping;

    private boolean buyNow;

    private Dimensions dimension;

    private Location location;

    @Builder.Default
    private List<Attachment> attachments = new ArrayList<Attachment>();

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @RequiredArgsConstructor
    public class Dimensions{

        private double width;
        private double length;
        private double height;
        private double weight;
    }

    public class Location{
        private double latitude;
        private double longitude;
    }

}
