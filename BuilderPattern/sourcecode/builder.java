package org.designpattern.builder;

import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class builder {


        public  static  void main(String[] args){

            Book book = new Book.Builder("0-12-345678-9", "Moby-Dick")
                    .genre("ADVENTURE_FICTION")
                    .author("Herman Melville")
                    .published(Year.of(1851))
                    .description(
                            "The book is the sailor Ishmael's narrative of the obsessive quest of "
                                    + "Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, "
                                    + "the giant white sperm whale that on the ship's previous voyage bit "
                                    + "off Ahab's leg at the knee."
                    )
                    .build();

            System.out.println(book);


        }

    }

