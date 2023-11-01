// 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
package programmers.lv1.etc;

import java.util.*;

public class SortStringMyMind {
    // Sort the Strings in ascending order by nth letter.
    // If nth letter is same order it by dictionary.
    public String[] sortStringMyMind(String[] strings, int n){

        Word[] words = new Word[strings.length];
        for(int i = 0; i < strings.length; i++){
            Word word = new Word(strings[i], n);
            words[i] = word;
        }

        List<Word> wordList = Arrays.asList(words);
        Collections.sort(wordList);

        String[] result = new String[strings.length];
        Iterator<Word> scan = wordList.iterator();
        int count = 0;

        while(scan.hasNext()){
            result[count] = scan.next().getWord();
            count++;
        }

        return result;
    }
    public static class Word implements Comparable<Word>{
        String word;
        int index;

        public Word(String word, int index){
            this.word = word;
            this.index = index;
        }
        public String getWord() {
            return word;
        }
        public char getChar(){
            return word.charAt(index);
        }
        @Override
        public int compareTo(Word other) {
            if(other.getChar() == this.getChar()){
                return this.word.compareTo(other.getWord());
            }
            else if (other.getChar() > this.getChar()) {
                return -1;
            }
            else{
                return 1;
            }
        }
    }
}