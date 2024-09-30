package com.skhanal5;

import java.util.List;

public class Runner {

    public static void main(String[]args) {
        // Using a subclass of Thread
        var command = new SubclassedCommand("git", List.of("branch", "-v", "-a"));
        command.start();

        // Using a naive implementation of Runnable
        var otherCommand = new RunnableCommand("git", List.of("commit", "-m", "\"hello world\""));
        otherCommand.run();
    }
}
