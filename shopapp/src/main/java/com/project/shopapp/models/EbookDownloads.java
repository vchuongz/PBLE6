package com.project.shopapp.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ebook_downloads")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EbookDownloads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "downloaded_at")
    private LocalDateTime downloadedAt;
}
