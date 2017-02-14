package no.brustad.react.tjenester.book;

import no.brustad.react.core.service.BookService;
import no.vegvesen.react.commons.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Book>> findAll(){
        logger.info("Henter alle bøkene");
        List<Book> books = bookService.findAll();
        if(books.isEmpty()){
            logger.info("Fant ingen bøker");
            return new ResponseEntity<List<Book>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
    }

}
