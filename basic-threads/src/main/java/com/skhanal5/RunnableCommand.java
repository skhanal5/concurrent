package com.skhanal5;

import java.util.List;

/**
 * A dummy class representing a command with a list
 * of arguments.
 */
public class RunnableCommand implements Runnable {

    String baseCommand;
    List<String> arguments;

    public RunnableCommand(String baseCommand, List<String> arguments) {
        this.baseCommand = baseCommand;
        this.arguments = arguments;
    }

    public String outputCommand() {
        var stringifiedArgs = String.join(" ", arguments);
        return baseCommand + " " + stringifiedArgs;
    }

    @Override
    public void run() {
        System.out.println(this.outputCommand());
    }
}
