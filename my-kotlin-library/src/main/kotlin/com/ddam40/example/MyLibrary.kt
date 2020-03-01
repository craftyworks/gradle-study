package com.ddam40.example

/**
 * 언어
 *
 * @author ddam40
 * @since 2020.03.01
 * @param name 언어명
 * @param hotness 인기도
 */
data class Language(val name: String, val hotness: Int)

/**
 * 라이브러리
 */
class MyLibrary {
    /**
     * 코틀린 랭귀지 생성
     * @return 코틀린 랭귀지 인스턴스
     */
    fun kotlinLanguage() = Language("Kotlin", 10)
}
