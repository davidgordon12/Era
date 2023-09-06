package com.davidgordon.jera.Token;
  
public enum TokenType {
  // Literals
  IDENTIFIER, STRING, NUMBER,

  // Delimiters
  LEFT_PAREN, RIGHT_PAREN,
  LEFT_BRACE, RIGHT_BRACE,
  COMMA, DOT,
  SEMICOLON, POUND,
  
  // Operators
  BANG, BANG_EQUAL,
  EQUAL, EQUAL_EQUAL,
  GREATER, GREATER_EQUAL,
  LESS, LESS_EQUAL,
  PLUS, MINUS,
  DIVIDE, MULTIPLY,

  // Keywords
  IF, ELSE,
  AND, OR,
  FOR, WHILE,
  VAR, NONE,
  PRINT, RETURN,
  TRUE, FALSE,
  CLASS, DEF,
  THIS, SUPER,

  EOF,
}
