package com.yakootah.dictionary.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "words", schema = "main")
public class Word {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "words_seq")
	private int id;
	private String word;
	@Column(name = "picture_link")
	private String pictureLink;
	@Column(name = "picture_blob")
	private String pictureBlob;
	private String pronounce;
	@ManyToOne (targetEntity = Language.class)
	@JoinColumn(name = "languages_id", nullable = false)
	private Language language;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "word", targetEntity = Meaning.class)
	private List<Meaning> meanings = new ArrayList<Meaning>();
}
