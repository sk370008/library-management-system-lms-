package com.backendMarch.librarymanagementsystem.DTO;

import com.backendMarch.librarymanagementsystem.Enum.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDto {

    private String transactionNumber;

    TransactionStatus transactionStatus;

    private Date transactionDate;

    private boolean isIssueOperation;

    private String message;
}
