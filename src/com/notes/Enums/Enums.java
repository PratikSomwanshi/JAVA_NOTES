package com.notes.Enums;

import java.util.Optional;

public class Enums {

	enum WEEK {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, RED;

	}

	public static Optional<String> getHexCode(WEEK day) {
		if (day == WEEK.RED) {
			return Optional.of("#FF0000");
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		getHexCode(WEEK.MONDAY);
	}
}
