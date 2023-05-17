package com.ll.basic1;

public class DataNotFoundException  extends  RuntimeException{
    private static final long serialVersionUID = 1L;// 예외처리
    public DataNotFoundException(String message) {
        super(message);
    }
}
