package no.brustad.react.core.service;

import no.vegvesen.react.commons.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
}
