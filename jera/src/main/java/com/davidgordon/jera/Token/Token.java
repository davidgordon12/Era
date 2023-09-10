package com.davidgordon.jera.Token;

import java.util.HashMap;
import java.util.Map;

public class Token {
  final TokenType tokenType;
  final String lexeme;
  final Object literal;
  final int line;

  public Token(TokenType tokenType, String lexeme, Object literal, int line) {
    this.tokenType = tokenType;
    this.lexeme = lexeme;
    this.literal = literal;
    this.line = line;
  }

  public String toString() {
    return tokenType + " " + lexeme + " " + literal;
  }

  public static final Map<String, TokenType> keywords;

  static {
    keywords = new HashMap<String, TokenType>();
    keywords.put("and",    TokenType.AND);
    keywords.put("class",  TokenType.CLASS);
    keywords.put("else",   TokenType.ELSE);
    keywords.put("false",  TokenType.FALSE);
    keywords.put("for",    TokenType.FOR);
    keywords.put("def",    TokenType.DEF);
    keywords.put("if",     TokenType.IF);
    keywords.put("none",   TokenType.NONE);
    keywords.put("or",     TokenType.OR);
    keywords.put("print",  TokenType.PRINT);
    keywords.put("return", TokenType.RETURN);
    keywords.put("super",  TokenType.SUPER);
    keywords.put("this",   TokenType.THIS);
    keywords.put("true",   TokenType.TRUE);
    keywords.put("var",    TokenType.VAR);
    keywords.put("while",  TokenType.WHILE);
  }    
}
