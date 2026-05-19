package com.doc_intel.doc.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "file_keywords")
@Getter @Setter
@NoArgsConstructor
public class FileKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fileId;

    private String keyword;

    private double score;
}