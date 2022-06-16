package org.javacord.api.entity.message;

import org.javacord.api.entity.Attachment;
import org.javacord.api.entity.DiscordEntity;

/**
 * This class represents a message attachment.
 */
public interface MessageAttachment extends DiscordEntity, Attachment {

    /**
     * Gets the message of the attachment.
     *
     * @return The message of the attachment.
     */
    Message getMessage();

}
