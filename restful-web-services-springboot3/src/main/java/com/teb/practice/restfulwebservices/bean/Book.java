package com.teb.practice.restfulwebservices.bean;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {

	private String bookId;

	@NotNull
	@Size(min = 10, max = 40, message = "Book name should be between 10 to 40 characters.")
	private String bookName;

	@NotNull
	@Size(min = 10, max = 20, message = "Author name should be between 10 to 20 characters.")
	private String bookAuthor;

}
