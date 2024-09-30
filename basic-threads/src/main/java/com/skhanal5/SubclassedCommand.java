package com.skhanal5;

import java.util.List;

/**
 * A dummy class representing a command with a list
 * of arguments.
 */
public class SubclassedCommand extends Thread {

    String baseCommand;
    List<String> arguments;

    public SubclassedCommand(String baseCommand, List<String> arguments) {
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
