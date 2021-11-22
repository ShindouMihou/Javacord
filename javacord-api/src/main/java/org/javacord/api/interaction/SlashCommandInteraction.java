package org.javacord.api.interaction;

import org.javacord.api.entity.server.Server;

import java.util.Optional;

public interface SlashCommandInteraction
        extends InteractionBase, SlashCommandInteractionOptionsProvider {
    /**
     * Gets the id of the invoked slash command.
     *
     * @return The id of the invoked command.
     */
    long getCommandId();

    /**
     * Gets the id of the invoked slash command as string.
     *
     * @return The id of the invoked command as string.
     */
    String getCommandIdAsString();

    /**
     * Gets the name of the invoked slash command.
     *
     * @return The name of the invoked command.
     */
    String getCommandName();

    /**
     * Gets the id of server that the slash command was created for.
     *
     * @return The id of server that the slash command was created for.
     */
    default Optional<Long> getCommandServerId() {
        return getCommandServer().map(Server::getId);
    }


    /**
     * Gets the server that the slash command was created for.
     *
     * @return The server that the slash command was created for.
     */
    Optional<Server> getCommandServer();
}
