package com.example.flashcard

class WordPairDeck {

    private val wordList = mutableListOf<WordPair>()
    lateinit var currentWord : WordPair

    init {
        initlizeWord()
        getNewWord()
    }

    fun initlizeWord() {
        val word = WordPair("Hello", "Hej")
        wordList.add(word)

        wordList.add(WordPair("Good bye", "Hej då"))
        wordList.add(WordPair("Thank you", "Tack"))
        wordList.add(WordPair("Welcomee", "Välkommen"))
        wordList.add(WordPair("Computer", "Dator"))

    }

    fun getNewWord() : WordPair {
        val rnd = (0 until wordList.size).random()
        currentWord = wordList[rnd]
        return currentWord
    }
}