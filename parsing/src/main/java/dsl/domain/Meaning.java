package dsl.domain;

import java.util.Set;

/**
 * Created by Alexander Prilipko on 05.02.2017.
 * Meaning of the world
 */
public class Meaning {
    String capture;
    Set<Meaning> meanings;
    Set<Translation> translations;
    Set<Mark> marks;
    Long orderNumber;
}
