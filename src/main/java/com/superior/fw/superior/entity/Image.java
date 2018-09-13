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

	private String id;
	private String name;

	public Image(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
// end::code[]
