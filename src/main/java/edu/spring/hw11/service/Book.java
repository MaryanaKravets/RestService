package edu.spring.hw11.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {
    public int id;
    public String title;
    public String genre;
    public String description;
    public int rate;

}
