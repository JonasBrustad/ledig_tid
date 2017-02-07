package no.brustad.react.core.service.impl;

import no.brustad.react.core.service.BookService;
import no.brustad.react.integrasjon.repository.BookDao;
import no.vegvesen.react.commons.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
