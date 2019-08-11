package edu.spring.hw11.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {
    private int id;
    private String title;
    private String genre;
    private String description;
    private int rate;

}
