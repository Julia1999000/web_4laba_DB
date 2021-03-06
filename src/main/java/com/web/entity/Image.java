package com.web.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "image")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;
}
