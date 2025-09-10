package com.minilibrary.service;

import com.minilibrary.dto.BookRequestDto;
import com.minilibrary.entity.Author;
import com.minilibrary.repository.AuthorRepository;
import com.minilibrary.repository.BookRepository;
import com.minilibrary.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(BookRequestDto request ) {
        Author author = authorRepository.findById(Long.valueOf(request.getAuthorId()))
                .orElseThrow(() -> new RuntimeException("Author not found"));

        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setIsbn(request.getIsbn());
        book.setAuthor(author);

        return bookRepository.save(book);
    }

    public Book updateBook(Long id, BookRequestDto request) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));

        Author author= authorRepository.findById(Long.valueOf(request.getAuthorId()))
                        .orElseThrow(()-> new RuntimeException("Author not found"));

        book.setTitle(request.getTitle());
        book.setIsbn(request.getIsbn());
        book.setAuthor(author);

        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        bookRepository.delete(book);
    }


}
