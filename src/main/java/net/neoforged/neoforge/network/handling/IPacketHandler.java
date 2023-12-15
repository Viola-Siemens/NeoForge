package net.neoforged.neoforge.network.handling;

import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;

/**
 * Describes a handler for a packet.
 * Allows for the handling of full packets from custom payloads
 */
public interface IPacketHandler {
    
    /**
     * Invoked to handle the given packet.
     *
     * @param packet  The packet.
     */
    void handle(Packet<?> packet);
    
    /**
     * Trigger a disconnect from the network.
     *
     * @param reason The reason for the disconnect.
     */
    void disconnect(Component reason);
}