package com.backendMarch.librarymanagementsystem.Service;

import com.backendMarch.librarymanagementsystem.DTO.AuthorListResponseDto;
import com.backendMarch.librarymanagementsystem.DTO.AuthorRequestDto;
import com.backendMarch.librarymanagementsystem.DTO.AuthorResponseDto;
import com.backendMarch.librarymanagementsystem.Entity.Author;
import com.backendMarch.librarymanagementsystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

//    public void addAuthor(Author author){
//
//        authorRepository.save(author);
//    }

    public AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto){
        Author author = new Author();
        author.setName(authorRequestDto.getName());
        author.setAge(authorRequestDto.getAge());
        author.setMobNo(authorRequestDto.getMobNo());
        author.setEmail(authorRequestDto.getEmail());
        authorRepository.save(author);

        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        authorResponseDto.setId(author.getId());
        authorResponseDto.setName(author.getName());
        return authorResponseDto;
    }

    public List<AuthorListResponseDto> getAuthors() {
        List<Author> authors = authorRepository.findAll();

        List<AuthorListResponseDto> listResponseDtos = new ArrayList<>();

        for(Author author :authors){
            AuthorListResponseDto authorListResponseDto = new AuthorListResponseDto();
            authorListResponseDto.setName(author.getName());
            authorListResponseDto.setAge(author.getAge());
            authorListResponseDto.setMobNo(author.getMobNo());
            authorListResponseDto.setEmail(author.getEmail());
            listResponseDtos.add(authorListResponseDto);
        }

        return listResponseDtos;


    }
}
