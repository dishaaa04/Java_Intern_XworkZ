package com.xworkz.proj.service;

import com.xworkz.proj.dto.BookStoreDTO;
import com.xworkz.proj.repository.BookStoreRepository;
import com.xworkz.proj.repository.BookStoreRepositoryImplementation;

public class BookStoreServiceImplementation implements BookStoreService{
    @Override
    public String validationandsave(BookStoreDTO bookStoreDTO) {
        BookStoreRepository bookStoreRepository = new BookStoreRepositoryImplementation();
        bookStoreRepository.Save(bookStoreDTO);
        return "pass";
    }
}
