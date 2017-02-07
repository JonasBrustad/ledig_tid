package no.brustad.react.integrasjon.repository.impl;

import no.brustad.react.integrasjon.repository.BookDao;
import no.vegvesen.react.commons.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private EmbeddedDatabase embeddedDatabase;

    @Override
    public List<Book> findAll() {
        return getJdbcTemplate().query("select * from book", new BookMapper());
    }

    private static final class BookMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Book book = new Book();
            book.setTitle(resultSet.getString("title"));
            book.setGenre(resultSet.getString("genre"));
            return book;
        }
    }

    private JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(embeddedDatabase);
    }
}
