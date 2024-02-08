package com.yakootah.dictionary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name = "languages", schema = "main")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "languages_seq")
	private int id;
	private String language;
}
