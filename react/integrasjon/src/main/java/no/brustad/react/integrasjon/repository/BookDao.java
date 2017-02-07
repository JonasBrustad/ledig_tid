package no.brustad.react.integrasjon.repository;

import no.vegvesen.react.commons.model.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAll();
}
