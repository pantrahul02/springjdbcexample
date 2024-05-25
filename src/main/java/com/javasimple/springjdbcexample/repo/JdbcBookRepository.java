package com.javasimple.springjdbcexample.repo;

import com.javasimple.springjdbcexample.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcBookRepository implements BookRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from books", Integer.class);
    }

    @Override
    public int save(Book book) {
        return jdbcTemplate.update("insert into books (name,price) values (?,?)", book.getName(), book.getPrice());
    }

    @Override
    public int update(Book book) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByNameAndPrice(String name, BigDecimal price) {
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public String getNameById(Long id) {
        return null;
    }
}
