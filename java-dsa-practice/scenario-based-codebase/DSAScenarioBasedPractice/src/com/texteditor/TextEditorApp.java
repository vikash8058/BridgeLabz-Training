package com.texteditor;

public class TextEditorApp {

	public static void main(String[] args) {

		TextEditorManager editor = new TextEditorManager();

		editor.insert("Hello");
		editor.insert(" World");

		editor.delete(6);

		editor.undo();
		editor.undo();

		editor.redo();
		editor.redo();
	}
}
