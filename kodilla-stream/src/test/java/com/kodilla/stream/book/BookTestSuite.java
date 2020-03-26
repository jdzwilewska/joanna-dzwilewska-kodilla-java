package com.kodilla.stream.book;

import org.junit.Test;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
        @Test
        public void testGetListUsingIntStream () {
            //Given
            BookDirectory bookDirectory1 = new BookDirectory();
            //When
            List<Book> books1 = bookDirectory1.getList();
            //Then
            int numberOfBooksPublicatedAfter20071 = IntStream.range(0, books1.size())
                    .filter(n -> books1.get(n).getYearOfPublication() > 2007)
                    .map(n -> 1)
                    .sum();
            Assert.assertEquals(3, numberOfBooksPublicatedAfter20071);
        }
    }

