package com.yakootah.dictionary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "meanings", schema = "main")
public class Meaning {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meanings_seq")
	private int id;
	private String meaning;
	@ManyToOne (targetEntity = Word.class)
	@JoinColumn(name = "words_id", nullable = false)
	private Word word;
}
