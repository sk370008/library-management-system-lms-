package com.backendMarch.librarymanagementsystem.Entity;

import com.backendMarch.librarymanagementsystem.Enum.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String transactionNumber;

    @Enumerated(EnumType.STRING)
    TransactionStatus transactionStatus;

    @CreatedDate
    private Date transactionDate;

    private boolean isIssueOperation;

    @ManyToOne
    @JoinColumn
    Book book;

    @ManyToOne
    @JoinColumn
    LibraryCard card;
}
