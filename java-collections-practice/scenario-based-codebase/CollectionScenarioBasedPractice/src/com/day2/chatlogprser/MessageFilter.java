package com.day2.chatlogprser;

public interface MessageFilter<T> {

    boolean allow(T message);
}
