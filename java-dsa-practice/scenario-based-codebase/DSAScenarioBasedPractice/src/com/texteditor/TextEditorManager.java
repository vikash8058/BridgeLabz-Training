package com.texteditor;

import java.util.Stack;

public class TextEditorManager {
	private String text = "";

	// stack to undo operations
	Stack<Action> undoStack = new Stack<>();

	// stack to redo operations
	Stack<Action> redoStack = new Stack<>();

	// method to insert text
	public void insert(String value) {
		text = text + value;

		// push insert action to undo stack
		undoStack.push(new Action("INSERT", text));

		// clear redo stack after new action
		redoStack.clear();

		System.out.println("Inserted: " + value);
		System.out.println("Text: " + text);
	}

	// method to deleted last n characters
	public void delete(int length) {
		if (length > text.length()) {
			length = text.length();
		}

		String removedText = text.substring(text.length() - length);
		text = text.substring(0, text.length() - length);

		// push delete action to undo stack
		undoStack.push(new Action("DELETE", removedText));

		// clear redo stack after new action
		redoStack.clear();

		System.out.println("Deleted: " + removedText);
		System.out.println("Text: " + text);
	}

	// method to undo last operation
	public void undo() {
		if (undoStack.isEmpty()) {
			System.out.println("Nothing to undo.");
			return;
		}

		Action action = undoStack.pop();

		if (action.type.equals("INSERT")) {
			text = text.substring(0, text.length() - action.value.length());
		} else if (action.type.equals("DELETE")) {
			text = text + action.value;
		}

		redoStack.push(action);

		System.out.println("Undo performed.");
		System.out.println("Text: " + text);
	}

	// method to redo last operation
	public void redo() {
		if (redoStack.isEmpty()) {
			System.out.println("Nothing to redo.");
			return;
		}

		Action action = redoStack.pop();

		if (action.type.equals("INSERT")) {
			text = text + action.value;
		} else if (action.type.equals("DELETE")) {
			text = text.substring(0, text.length() - action.value.length());
		}

		undoStack.push(action);

		System.out.println("Redo performed.");
		System.out.println("Text: " + text);
	}
}
