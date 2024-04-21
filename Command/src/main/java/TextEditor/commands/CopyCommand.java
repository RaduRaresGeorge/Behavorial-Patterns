package src.main.java.TextEditor.commands;

import src.main.java.TextEditor.editor.Editor;


public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
