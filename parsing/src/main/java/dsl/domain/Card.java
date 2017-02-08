package dsl.domain;

import java.util.Set;

/**
 * Created by Alexander Prilipko on 04.02.2017.
 * Article of the word;
 */
public class Card {
    String word;
    Set<Transcription> transcriptions;
    Set<Mark> marks;
    Set<Audio> audios;
    Set<Meaning> meanings;
}
