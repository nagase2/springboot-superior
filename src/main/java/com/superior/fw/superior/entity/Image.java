package com.superior.fw.superior.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Data
@NoArgsConstructor
public class Image {

	private int id;
	private String name;

	public Image(int i, String name) {
		this.id = i;
		this.name = name;
	}
}
// end::code[]
