package com.vivie.tugas_note.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}